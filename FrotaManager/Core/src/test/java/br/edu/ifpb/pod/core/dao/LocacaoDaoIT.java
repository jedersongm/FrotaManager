/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.core.dao;

import br.edu.ifpb.pod.shared.beans.Locacao;
import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author jederson
 */
public class LocacaoDaoIT extends TestCase {
    
    public LocacaoDaoIT(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(LocacaoDaoIT.class);
        return suite;
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of salvar method, of class LocacaoDao.
     */
    public void testSalvar() throws Exception {
        System.out.println("salvar");
        Locacao locacao = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LocacaoDao instance = (LocacaoDao)container.getContext().lookup("java:global/classes/LocacaoDao");
        boolean expResult = false;
        boolean result = instance.salvar(locacao);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluir method, of class LocacaoDao.
     */
    public void testExcluir() throws Exception {
        System.out.println("excluir");
        Locacao locacao = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LocacaoDao instance = (LocacaoDao)container.getContext().lookup("java:global/classes/LocacaoDao");
        boolean expResult = false;
        boolean result = instance.excluir(locacao);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atualizar method, of class LocacaoDao.
     */
    public void testAtualizar() throws Exception {
        System.out.println("atualizar");
        Locacao locacao = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LocacaoDao instance = (LocacaoDao)container.getContext().lookup("java:global/classes/LocacaoDao");
        boolean expResult = false;
        boolean result = instance.atualizar(locacao);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisar method, of class LocacaoDao.
     */
    public void testPesquisar() throws Exception {
        System.out.println("pesquisar");
        Class<Locacao> entidade = null;
        Object chave = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LocacaoDao instance = (LocacaoDao)container.getContext().lookup("java:global/classes/LocacaoDao");
        Locacao expResult = null;
        Locacao result = instance.pesquisar(entidade, chave);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar method, of class LocacaoDao.
     */
    public void testListar() throws Exception {
        System.out.println("listar");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LocacaoDao instance = (LocacaoDao)container.getContext().lookup("java:global/classes/LocacaoDao");
        List<Locacao> expResult = null;
        List<Locacao> result = instance.listar();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
