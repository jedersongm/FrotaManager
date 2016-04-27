/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.core.serviceimpl;

import br.edu.ifpb.pod.core.dao.LocacaoDao;
import br.edu.ifpb.pod.shared.beans.Locacao;
import br.edu.ifpb.pod.shared.service.ServiceLocacao;
import java.util.List;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author kaique
 */
@Stateless
@Remote(ServiceLocacao.class)
public class ServiceLocacaoImpl implements ServiceLocacao {

    @Inject
    private LocacaoDao locacaoDao;

    @Override
    public boolean salvar(Locacao locacao) {
        return locacaoDao.salvar(locacao);
    }

    @Override
    public boolean excluir(Locacao locacao) {
        return locacaoDao.excluir(locacao);
    }

    @Override
    public boolean atualizar(Locacao locacao) {
        return locacaoDao.atualizar(locacao);
    }

    @Override
    public Locacao pesquisar(Class<Locacao> entidade, Object chave) {
        return locacaoDao.pesquisar(entidade, chave);
    }

    @Override
    public List<Locacao> listar() {
        return locacaoDao.listar();
    }
}
