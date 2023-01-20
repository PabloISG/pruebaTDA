/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ista.prueba.pablosumba14.Service;

import org.springframework.data.repository.CrudRepository;
import static org.testng.Assert.*;

/**
 *
 * @author Pablo
 */
public class DocenteServicioImplNGTest {
    
    public DocenteServicioImplNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getDao method, of class DocenteServicioImpl.
     */
    @org.testng.annotations.Test
    public void testGetDao() {
        System.out.println("getDao");
        DocenteServicioImpl instance = new DocenteServicioImpl();
        CrudRepository expResult = null;
        CrudRepository result = instance.getDao();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
