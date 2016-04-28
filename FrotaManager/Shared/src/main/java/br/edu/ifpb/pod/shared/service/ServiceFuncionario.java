/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.shared.service;

import br.edu.ifpb.pod.shared.beans.Funcionario;
import java.util.List;

/**
 *
 * @author kaique
 */
public interface ServiceFuncionario {

    public boolean salvar(Funcionario funcionario);

    public boolean excluir(Funcionario funcionario);

    public boolean atualizar(Funcionario funcionario);

    public Funcionario pesquisar(Class<Funcionario> entidade, Object chave);

    public List<Funcionario> listar();
    
    public Funcionario login(int cod, String senha);
}
