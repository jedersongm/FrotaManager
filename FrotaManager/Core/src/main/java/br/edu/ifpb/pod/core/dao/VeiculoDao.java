/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.core.dao;

import br.edu.ifpb.pod.shared.beans.Veiculo;
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
public class VeiculoDao {

    @PersistenceContext(unitName = "FrotaManager")
    private EntityManager em;

    public VeiculoDao() {
    }

    public boolean salvar(Veiculo veiculo) {
        em.persist(veiculo);
        return true;
    }

    public boolean excluir(Veiculo veiculo) {
        em.remove(veiculo);
        return true;
    }

    public boolean atualizar(Veiculo veiculo) {
        em.merge(veiculo);
        return true;
    }

    public Veiculo pesquisar(Class<Veiculo> entidade, Object chave) {
        return em.find(entidade, chave);
    }

    public List<Veiculo> listar() {
        Query query = em.createQuery("SELECT v FROM Veiculo v ORDER BY v.placa");
        List<Veiculo> veiculos = query.getResultList();
        if (veiculos.size() > 0) {
            return veiculos;
        }
        return null;
    }
}
