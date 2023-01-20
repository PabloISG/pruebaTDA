
package com.ista.prueba.pablosumba14.Service;

import com.ista.prueba.pablosumba14.Entity.Docente;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Pablo
 */
public class DocenteServicioImplTest {
    
    public DocenteServicioImplTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getDao method, of class DocenteServicioImpl.
     */
    @Test
    public void testGetDao() {
        System.out.println("getDao");
        DocenteServicioImpl instance = new DocenteServicioImpl();
        CrudRepository<Docente, Integer> expResult = null;
        CrudRepository<Docente, Integer> result = instance.getDao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
