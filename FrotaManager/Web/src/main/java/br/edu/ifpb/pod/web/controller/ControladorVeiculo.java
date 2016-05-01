/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.web.controller;

import br.edu.ifpb.pod.shared.beans.Funcionario;
import br.edu.ifpb.pod.shared.beans.Locacao;
import br.edu.ifpb.pod.shared.beans.Status;
import br.edu.ifpb.pod.shared.beans.Veiculo;
import br.edu.ifpb.pod.shared.service.ServiceFuncionario;
import br.edu.ifpb.pod.shared.service.ServiceLocacao;
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
    private List<Veiculo> frota;

    public ControladorVeiculo() {
        novoVeiculo = new Veiculo();
        frota = new ArrayList<Veiculo>();
    }

    public Veiculo getNovoVeiculo() {
        return novoVeiculo;
    }

    public void setNovoVeiculo(Veiculo novoVeiculo) {
        this.novoVeiculo = novoVeiculo;
    }

    public List<Veiculo> getFrota() {
        return frota;
    }

    public void setFrota(List<Veiculo> frota) {
        this.frota = frota;
    }

    public void listarVeiculos() {
        frota = serviceVeiculo.listar();
    }

    public String salvarVeiculo() {
        novoVeiculo.setStatus(Status.LIVRE);
        serviceVeiculo.salvar(novoVeiculo);
        return "";
    }
}
