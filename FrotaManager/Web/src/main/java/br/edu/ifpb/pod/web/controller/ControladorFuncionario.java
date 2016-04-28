/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.web.controller;

import br.edu.ifpb.pod.shared.beans.Funcionario;
import br.edu.ifpb.pod.shared.service.ServiceFuncionario;
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
public class ControladorFuncionario implements Serializable {
    //#{controladorFuncionario.Funcionario}
    
    private Funcionario funcionario;
    private int cod;
    private String senha;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
        

    @Inject
    private ServiceFuncionario serviceFuncionario;
    //Nãão sei se vai funcionar pq ainda não terminei os controladores
    //Tenho que ver direito como faz com CDI, tem uma configuração que não lembro como faz.

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    public String login(){
        
       funcionario = serviceFuncionario.login(cod, senha);
       
       if(funcionario != null){
           return "index.xhtml";
       }
       return "";
    }
}
