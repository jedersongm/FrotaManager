/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.core.serviceimpl;

import br.edu.ifpb.pod.core.dao.FuncionarioDao;
import br.edu.ifpb.pod.shared.beans.Funcionario;
import br.edu.ifpb.pod.shared.service.ServiceFuncionario;
import java.util.List;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author kaique
 */
@Stateless
@Remote(ServiceFuncionario.class)
public class ServiceFuncionarioImpl implements ServiceFuncionario {
    
    @Inject
    private FuncionarioDao funcionarioDao;

    @Override
    public boolean salvar(Funcionario funcionario) {
        return funcionarioDao.salvar(funcionario);
    }

    @Override
    public boolean excluir(Funcionario funcionario) {
        return funcionarioDao.excluir(funcionario);
    }

    @Override
    public boolean atualizar(Funcionario funcionario) {
        return funcionarioDao.atualizar(funcionario);
    }

    @Override
    public Funcionario pesquisar(Class<Funcionario> entidade, Object chave) {
        return funcionarioDao.pesquisar(entidade, chave);
    }

    @Override
    public List<Funcionario> listar() {
        return funcionarioDao.listar();
    }
}
