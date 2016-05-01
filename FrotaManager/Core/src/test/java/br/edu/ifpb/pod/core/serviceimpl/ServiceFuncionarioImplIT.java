/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.core.serviceimpl;

import br.edu.ifpb.pod.shared.beans.Funcionario;
import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author jederson
 */
public class ServiceFuncionarioImplIT extends TestCase {
    
    public ServiceFuncionarioImplIT(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ServiceFuncionarioImplIT.class);
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
     * Test of salvar method, of class ServiceFuncionarioImpl.
     */
    public void testSalvar() throws Exception {
        System.out.println("salvar");
        Funcionario funcionario = null;
        ServiceFuncionarioImpl instance = new ServiceFuncionarioImpl();
        boolean expResult = false;
        boolean result = instance.salvar(funcionario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluir method, of class ServiceFuncionarioImpl.
     */
    public void testExcluir() throws Exception {
        System.out.println("excluir");
        Funcionario funcionario = null;
        ServiceFuncionarioImpl instance = new ServiceFuncionarioImpl();
        boolean expResult = false;
        boolean result = instance.excluir(funcionario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atualizar method, of class ServiceFuncionarioImpl.
     */
    public void testAtualizar() throws Exception {
        System.out.println("atualizar");
        Funcionario funcionario = null;
        ServiceFuncionarioImpl instance = new ServiceFuncionarioImpl();
        boolean expResult = false;
        boolean result = instance.atualizar(funcionario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisar method, of class ServiceFuncionarioImpl.
     */
    public void testPesquisar() throws Exception {
        System.out.println("pesquisar");
        Class<Funcionario> entidade = null;
        Object chave = null;
        ServiceFuncionarioImpl instance = new ServiceFuncionarioImpl();
        Funcionario expResult = null;
        Funcionario result = instance.pesquisar(entidade, chave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar method, of class ServiceFuncionarioImpl.
     */
    public void testListar() throws Exception {
        System.out.println("listar");
        ServiceFuncionarioImpl instance = new ServiceFuncionarioImpl();
        List<Funcionario> expResult = null;
        List<Funcionario> result = instance.listar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class ServiceFuncionarioImpl.
     */
    public void testLogin() throws Exception {
        System.out.println("login");
        int cod = 0;
        String senha = "";
        ServiceFuncionarioImpl instance = new ServiceFuncionarioImpl();
        Funcionario expResult = null;
        Funcionario result = instance.login(cod, senha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
