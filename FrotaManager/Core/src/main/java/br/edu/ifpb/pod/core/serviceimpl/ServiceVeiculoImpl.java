/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.core.serviceimpl;

import br.edu.ifpb.pod.core.dao.VeiculoDao;
import br.edu.ifpb.pod.shared.beans.Veiculo;
import br.edu.ifpb.pod.shared.service.ServiceVeiculo;
import java.util.List;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author kaique
 */
@Stateless
@Remote(ServiceVeiculo.class)
public class ServiceVeiculoImpl implements ServiceVeiculo {

    @Inject
    private VeiculoDao veiculoDao;

    @Override
    public boolean salvar(Veiculo veiculo) {
        return veiculoDao.salvar(veiculo);
    }

    @Override
    public boolean excluir(Veiculo veiculo) {
        return veiculoDao.excluir(veiculo);
    }

    @Override
    public boolean atualizar(Veiculo veiculo) {
        return veiculoDao.atualizar(veiculo);
    }

    @Override
    public Veiculo pesquisar(Class<Veiculo> entidade, Object chave) {
        return veiculoDao.pesquisar(entidade, chave);
    }

    @Override
    public List<Veiculo> listar() {
        return veiculoDao.listar();
    }
}
