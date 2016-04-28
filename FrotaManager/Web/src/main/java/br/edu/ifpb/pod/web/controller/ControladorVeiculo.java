/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.web.controller;

import br.edu.ifpb.pod.shared.beans.Funcionario;
import br.edu.ifpb.pod.shared.beans.Locacao;
import br.edu.ifpb.pod.shared.beans.Veiculo;
import br.edu.ifpb.pod.shared.service.ServiceFuncionario;
import br.edu.ifpb.pod.shared.service.ServiceLocacao;
import br.edu.ifpb.pod.shared.service.ServiceVeiculo;
import java.io.Serializable;
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

    private Veiculo veiculo;

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

}
