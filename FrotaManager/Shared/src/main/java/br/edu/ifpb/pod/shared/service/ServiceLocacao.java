/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.shared.service;

import br.edu.ifpb.pod.shared.beans.Locacao;
import java.util.List;

/**
 *
 * @author kaique
 */
public interface ServiceLocacao {
    public boolean salvar(Locacao locacao);

    public boolean excluir(Locacao locacao);

    public boolean atualizar(Locacao locacao);

    public Locacao pesquisar(Class<Locacao> entidade, Object chave);

    public List<Locacao> listar();
}
