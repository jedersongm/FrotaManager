/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.core.serviceimpl;

import br.edu.ifpb.pod.shared.beans.Veiculo;
import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author jederson
 */
public class ServiceVeiculoImplIT extends TestCase {
    
    public ServiceVeiculoImplIT(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ServiceVeiculoImplIT.class);
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
     * Test of salvar method, of class ServiceVeiculoImpl.
     */
    public void testSalvar() throws Exception {
        System.out.println("salvar");
        Veiculo veiculo = null;
        ServiceVeiculoImpl instance = new ServiceVeiculoImpl();
        boolean expResult = false;
        boolean result = instance.salvar(veiculo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluir method, of class ServiceVeiculoImpl.
     */
    public void testExcluir() throws Exception {
        System.out.println("excluir");
        Veiculo veiculo = null;
        ServiceVeiculoImpl instance = new ServiceVeiculoImpl();
        boolean expResult = false;
        boolean result = instance.excluir(veiculo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atualizar method, of class ServiceVeiculoImpl.
     */
    public void testAtualizar() throws Exception {
        System.out.println("atualizar");
        Veiculo veiculo = null;
        ServiceVeiculoImpl instance = new ServiceVeiculoImpl();
        boolean expResult = false;
        boolean result = instance.atualizar(veiculo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisar method, of class ServiceVeiculoImpl.
     */
    public void testPesquisar() throws Exception {
        System.out.println("pesquisar");
        Class<Veiculo> entidade = null;
        Object chave = null;
        ServiceVeiculoImpl instance = new ServiceVeiculoImpl();
        Veiculo expResult = null;
        Veiculo result = instance.pesquisar(entidade, chave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar method, of class ServiceVeiculoImpl.
     */
    public void testListar() throws Exception {
        System.out.println("listar");
        ServiceVeiculoImpl instance = new ServiceVeiculoImpl();
        List<Veiculo> expResult = null;
        List<Veiculo> result = instance.listar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
