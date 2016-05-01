/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.core;

import br.edu.ifpb.pod.core.dao.DaoITSuite;
import br.edu.ifpb.pod.core.serviceimpl.ServiceimplITSuite;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author jederson
 */
public class CoreITSuite extends TestCase {
    
    public CoreITSuite(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("CoreITSuite");
        suite.addTest(DaoITSuite.suite());
        suite.addTest(ServiceimplITSuite.suite());
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
