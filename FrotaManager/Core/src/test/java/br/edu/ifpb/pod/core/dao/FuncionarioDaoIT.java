/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.core.dao;

import br.edu.ifpb.pod.shared.beans.Funcionario;
import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author jederson
 */
public class FuncionarioDaoIT extends TestCase {
    
    public FuncionarioDaoIT(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(FuncionarioDaoIT.class);
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
     * Test of salvar method, of class FuncionarioDao.
     */
    public void testSalvar() throws Exception {
        System.out.println("salvar");
        Funcionario funcionario = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        FuncionarioDao instance = (FuncionarioDao)container.getContext().lookup("java:global/classes/FuncionarioDao");
        boolean expResult = false;
        boolean result = instance.salvar(funcionario);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluir method, of class FuncionarioDao.
     */
    public void testExcluir() throws Exception {
        System.out.println("excluir");
        Funcionario funcionario = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        FuncionarioDao instance = (FuncionarioDao)container.getContext().lookup("java:global/classes/FuncionarioDao");
        boolean expResult = false;
        boolean result = instance.excluir(funcionario);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atualizar method, of class FuncionarioDao.
     */
    public void testAtualizar() throws Exception {
        System.out.println("atualizar");
        Funcionario funcionario = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        FuncionarioDao instance = (FuncionarioDao)container.getContext().lookup("java:global/classes/FuncionarioDao");
        boolean expResult = false;
        boolean result = instance.atualizar(funcionario);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisar method, of class FuncionarioDao.
     */
    public void testPesquisar() throws Exception {
        System.out.println("pesquisar");
        Class<Funcionario> entidade = null;
        Object chave = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        FuncionarioDao instance = (FuncionarioDao)container.getContext().lookup("java:global/classes/FuncionarioDao");
        Funcionario expResult = null;
        Funcionario result = instance.pesquisar(entidade, chave);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar method, of class FuncionarioDao.
     */
    public void testListar() throws Exception {
        System.out.println("listar");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        FuncionarioDao instance = (FuncionarioDao)container.getContext().lookup("java:global/classes/FuncionarioDao");
        List<Funcionario> expResult = null;
        List<Funcionario> result = instance.listar();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class FuncionarioDao.
     */
    public void testLogin() throws Exception {
        System.out.println("login");
        int cod = 0;
        String senha = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        FuncionarioDao instance = (FuncionarioDao)container.getContext().lookup("java:global/classes/FuncionarioDao");
        Funcionario expResult = null;
        Funcionario result = instance.login(cod, senha);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
