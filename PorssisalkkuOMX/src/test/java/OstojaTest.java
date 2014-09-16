/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kromanow
 */
public class OstojaTest {
    
    public OstojaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of osta method, of class Ostoja.
     */
    @Test
    public void testOsta() {
        System.out.println("osta");
        String osake = "UPM";
        int saldo = 100;
        Ostoja instance = new Ostoja(UPM,100);
        double expResult = 100;
        double result = instance.osta(osake, saldo);
        assertEquals(expResult, result, 100);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
/* 
    }
 @Test
    public void testErotusVuosissa() {
        System.out.println("erotusVuosissa");
        Paivamaara verrattava = new Paivamaara(16,8,2011);
        Paivamaara instance = new Paivamaara(16,8,2014);
        int expResult = 3;
        int result = instance.erotusVuosissa(verrattava);
        assertEquals(expResult, result);
