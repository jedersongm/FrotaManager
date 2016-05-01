/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.core.serviceimpl;

import br.edu.ifpb.pod.shared.beans.Locacao;
import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author jederson
 */
public class ServiceLocacaoImplIT extends TestCase {
    
    public ServiceLocacaoImplIT(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ServiceLocacaoImplIT.class);
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
     * Test of salvar method, of class ServiceLocacaoImpl.
     */
    public void testSalvar() throws Exception {
        System.out.println("salvar");
        Locacao locacao = null;
        ServiceLocacaoImpl instance = new ServiceLocacaoImpl();
        boolean expResult = false;
        boolean result = instance.salvar(locacao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluir method, of class ServiceLocacaoImpl.
     */
    public void testExcluir() throws Exception {
        System.out.println("excluir");
        Locacao locacao = null;
        ServiceLocacaoImpl instance = new ServiceLocacaoImpl();
        boolean expResult = false;
        boolean result = instance.excluir(locacao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atualizar method, of class ServiceLocacaoImpl.
     */
    public void testAtualizar() throws Exception {
        System.out.println("atualizar");
        Locacao locacao = null;
        ServiceLocacaoImpl instance = new ServiceLocacaoImpl();
        boolean expResult = false;
        boolean result = instance.atualizar(locacao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisar method, of class ServiceLocacaoImpl.
     */
    public void testPesquisar() throws Exception {
        System.out.println("pesquisar");
        Class<Locacao> entidade = null;
        Object chave = null;
        ServiceLocacaoImpl instance = new ServiceLocacaoImpl();
        Locacao expResult = null;
        Locacao result = instance.pesquisar(entidade, chave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar method, of class ServiceLocacaoImpl.
     */
    public void testListar() throws Exception {
        System.out.println("listar");
        ServiceLocacaoImpl instance = new ServiceLocacaoImpl();
        List<Locacao> expResult = null;
        List<Locacao> result = instance.listar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
