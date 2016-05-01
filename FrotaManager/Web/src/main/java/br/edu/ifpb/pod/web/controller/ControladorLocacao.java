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
import java.util.Date;
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
public class ControladorLocacao implements Serializable {

    @Inject
    private ServiceLocacao serviceLocacao;

    @Inject
    private ServiceVeiculo serviceVeiculo;

    @Inject
    private ServiceFuncionario serviceFuncionario;

    private Locacao locacao;

    public ControladorLocacao() {
        locacao = new Locacao();
    }

    public Locacao getLocacao() {
        return locacao;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }

    public void locarVeiculo(Veiculo veiculo, Funcionario funcionario) {
        System.out.println(funcionario);
        System.out.println(veiculo);

        veiculo.setStatus(Status.OCUPADO);
        serviceVeiculo.atualizar(veiculo);

        locacao.setFuncionario(funcionario);
        locacao.setKmSaida(veiculo.getKm());
        locacao.setSaida(new Date());
        locacao.setVeiculo(veiculo);

        funcionario.setLocação(locacao);
        serviceFuncionario.atualizar(funcionario);
    }

    public void deslocarVeiculo(Veiculo veiculo) {
        veiculo.setStatus(Status.LIVRE);
        serviceVeiculo.atualizar(veiculo);
    }
}
