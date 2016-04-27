/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.core.dao;

import br.edu.ifpb.pod.shared.beans.Funcionario;
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
public class FuncionarioDao {

    @PersistenceContext
    private EntityManager em;

    public FuncionarioDao() {
    }

    public boolean salvar(Funcionario funcionario) {
        em.persist(funcionario);
        return true;

    }

    public boolean excluir(Funcionario funcionario) {
        em.remove(funcionario);
        return true;
    }

    public boolean atualizar(Funcionario funcionario) {
        em.merge(funcionario);
        return true;
    }

    public Funcionario pesquisar(Class<Funcionario> entidade, Object chave) {
        return em.find(entidade, chave);
    }

    public List<Funcionario> listar() {
        Query query = em.createQuery("SELECT f FROM Funcionario f ORDER BY f.nome");
        List<Funcionario> funcionarios = query.getResultList();
        if (funcionarios.size() > 0) {
            return funcionarios;
        }
        return null;
    }
}
