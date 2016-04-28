/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.core.dao;

import br.edu.ifpb.pod.shared.beans.Locacao;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author kaique
 */
@Stateless
public class LocacaoDao {

    @PersistenceContext(unitName = "FrotaManager")
    private EntityManager em;

    public LocacaoDao() {
    }

    public boolean salvar(Locacao locacao) {
        em.persist(locacao);
        return true;
    }

    public boolean excluir(Locacao locacao) {
        em.remove(locacao);
        return true;
    }

    public boolean atualizar(Locacao locacao) {
        em.merge(locacao);
        return true;
    }

    public Locacao pesquisar(Class<Locacao> entidade, Object chave) {
        return em.find(entidade, chave);
    }

    public List<Locacao> listar() {
        Query query = em.createQuery("SELECT l FROM Locacao l ORDER BY l.id");
        List<Locacao> locacaos = query.getResultList();
        if (locacaos.size() > 0) {
            return locacaos;
        }
        return null;
    }
}
