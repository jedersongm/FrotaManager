/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.core.serviceimpl;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author jederson
 */
public class ServiceimplITSuite extends TestCase {
    
    public ServiceimplITSuite(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("ServiceimplITSuite");
        suite.addTest(ServiceLocacaoImplIT.suite());
        suite.addTest(ServiceFuncionarioImplIT.suite());
        suite.addTest(ServiceVeiculoImplIT.suite());
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
    
}
