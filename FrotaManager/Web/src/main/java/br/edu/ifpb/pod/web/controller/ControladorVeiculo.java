/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.web.controller;

import br.edu.ifpb.pod.shared.beans.Status;
import br.edu.ifpb.pod.shared.beans.Veiculo;
import br.edu.ifpb.pod.shared.service.ServiceVeiculo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author kaique
 */
@Named
@SessionScoped
public class ControladorVeiculo implements Serializable {

    @Inject
    private ServiceVeiculo serviceVeiculo;

    private Veiculo novoVeiculo;
    private Veiculo veiculoSelecionado;
    private List<Veiculo> listaDeVeiculos;

    public ControladorVeiculo() {
        novoVeiculo = new Veiculo();
        veiculoSelecionado = new Veiculo();
        listaDeVeiculos = new ArrayList<Veiculo>();
    }

    public Veiculo getVeiculoSelecionado() {
        return veiculoSelecionado;
    }

    public void setVeiculoSelecionado(Veiculo veiculoSelecionado) {
        this.veiculoSelecionado = veiculoSelecionado;
    }

    public List<Veiculo> getListaDeVeiculos() {
        return listaDeVeiculos;
    }

    public void setListaDeVeiculos(List<Veiculo> listaDeVeiculos) {
        this.listaDeVeiculos = listaDeVeiculos;
    }

    public Veiculo getNovoVeiculo() {
        return novoVeiculo;
    }

    public void setNovoVeiculo(Veiculo novoVeiculo) {
        this.novoVeiculo = novoVeiculo;
    }

    public String salvarVeiculo() {
        novoVeiculo.setStatus(Status.LIVRE);
        serviceVeiculo.salvar(novoVeiculo);
        return "";
    }

    public void carregarCarros() {
        listaDeVeiculos = serviceVeiculo.listar();
    }

    public String selecionarVeiculo(Veiculo veiculo) {
        veiculoSelecionado = veiculo;
        System.out.println(veiculoSelecionado);        
        return "";
    }
}
