/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package entorns;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jde7989
 */
public class EntornsTest {
    
    public EntornsTest() {
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
     * Test of main method, of class Entorns.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Entorns.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateTicketPrice method, of class Entorns.
     */
    @Test
    public void testCalculateTicketPrice() {
        System.out.println("calculateTicketPrice");
        int tipo_entrada = 0;
        int edad = 0;
        Entorns instance = new Entorns();
        double expResult = 0.0;
        double result = instance.calculateTicketPrice(tipo_entrada, edad);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
