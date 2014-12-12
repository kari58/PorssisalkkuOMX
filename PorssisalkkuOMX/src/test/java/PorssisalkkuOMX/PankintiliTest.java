/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PorssisalkkuOMX;

import PorssisalkkuOMX.Pankintili;
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
public class PankintiliTest {

    Pankintili instance = new Pankintili(100000.0);

    public PankintiliTest() {
        instance.getmarkkinaArvot().put("UPM", 11.0);
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

    @Test
    public void testMyy() {

        double result = instance.myy("UPM", 100);
        assertEquals(result, 98900, 0.01);
    }

    @Test
    public void testErotusVuosissa() {
        System.out.println("erotusVuosissa");
        Paivamaara verrattava = new Paivamaara(16, 8, 2044);
        Paivamaara instance = new Paivamaara(16, 8, 2014);
        int expResult = 30;
        int result = instance.erotusVuosissa(verrattava);
        assertEquals(expResult, result);

    }

    @Test
    public void testOsta() {
        double result = instance.osta("UPM", 100);
        assertEquals(result, 101100.0, 0.01);

    }
}
