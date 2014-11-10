package PorssisalkkuOMX;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import PorssisalkkuOMX.Paivamaara;
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
public class PaivamaaraTest {
    
    public PaivamaaraTest() {
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
     * Test of toString method, of class Paivamaara.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Paivamaara instance = new Paivamaara(16,9,2014);
        String expResult = "16.9.2014";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    //this.paiva + "." + this.kuukausi + "." + this.vuosi;
    }

    /**
     * Test of aiemmin method, of class Paivamaara.
     */
    @Test
    public void testAiemmin() {
        System.out.println("aiemmin");
        Paivamaara verrattava = new Paivamaara(16,8,2014);// vuosi kuukausi,päivä 
        Paivamaara instance = new Paivamaara(15,8,2014);
        boolean expResult = true;
        boolean result = instance.aiemmin(verrattava);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of erotusVuosissa method, of class Paivamaara.
     */
    @Test
    public void testErotusVuosissa() {
        System.out.println("erotusVuosissa");
        Paivamaara verrattava = new Paivamaara(16,8,2011);
        Paivamaara instance = new Paivamaara(16,8,2014);
        int expResult = 3;
        int result = instance.erotusVuosissa(verrattava);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
     @Test
    public void testAiemminuusi() {
        System.out.println("aiemmin");
        Paivamaara verrattava = new Paivamaara(14,8,2014);// vuosi kuukausi,päivä 
        Paivamaara instance = new Paivamaara(15,8,2014);
        boolean expResult = false;
        boolean result = instance.aiemmin(verrattava);
        assertEquals(expResult, result);
    }

    /**
     * Test of palautakokolukuna method, of class Paivamaara.
     */
    @Test
    public void testPalautakokolukuna() {
        System.out.println("palautakokolukuna");
        Paivamaara instance = new Paivamaara(15,8,2014);
        int expResult = 15082014;
        int result = instance.palautakokolukuna();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
}
