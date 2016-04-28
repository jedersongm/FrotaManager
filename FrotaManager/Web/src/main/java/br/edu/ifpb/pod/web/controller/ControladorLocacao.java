/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.web.controller;

import br.edu.ifpb.pod.shared.beans.Locacao;
import br.edu.ifpb.pod.shared.service.ServiceLocacao;
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
public class ControladorLocacao implements Serializable {

    @Inject
    private ServiceLocacao serviceLocacao;

    private Locacao locacao;

    public Locacao getLocacao() {
        return locacao;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }

}
