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
        Paivamaara instance = new Paivamaara(16, 9, 2014);
        String expResult = "16.9.2014";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of aiemmin method, of class Paivamaara.
     */
    @Test
    public void testAiemmin() {

        Paivamaara verrattava = new Paivamaara(18, 7, 2011);
        Paivamaara instance = new Paivamaara(18, 7, 2011);
        boolean expResult = false;
        boolean result = instance.aiemmin(verrattava);
        assertEquals(expResult, result);

    }

    @Test
    public void testAiemmin1() {

        Paivamaara verrattava = new Paivamaara(1, 4, 2014);
        Paivamaara instance = new Paivamaara(2, 3, 2014);
        boolean expResult = true;
        boolean result = instance.aiemmin(verrattava);
        assertEquals(expResult, result);

    }

    @Test
    public void testAiemmin2() {

        Paivamaara verrattava = new Paivamaara(15, 0, 2014);
        Paivamaara instance = new Paivamaara(16, 0, 2014);
        boolean expResult = false;
        boolean result = instance.aiemmin(verrattava);
        assertEquals(expResult, result);

    }

    /**
     * Test of erotusVuosissa method, of class Paivamaara.
     */
    @Test
    public void testErotusVuosissa() {

        Paivamaara verrattava = new Paivamaara(16, 6, 2010);
        Paivamaara instance = new Paivamaara(15, 6, 2014);
        int expResult = 3;
        int result = instance.erotusVuosissa(verrattava);
        assertEquals(expResult, result);

    }
   public void testErotusVuosissa2() {

        Paivamaara verrattava = new Paivamaara(16, 6, 2014);
        Paivamaara instance = new Paivamaara(15, 5, 2014);
        int expResult = 0;
        int result = instance.erotusVuosissa(verrattava);
        assertEquals(expResult, result);

    }
      public void testErotusVuosissa3() {

        Paivamaara verrattava = new Paivamaara(16, 6, 2010);
        Paivamaara instance = new Paivamaara(15, 6, 2014);
        int expResult = 3;
        int result = instance.erotusVuosissa(verrattava);
        assertEquals(expResult, result);

    }
    @Test
    public void testAiemminuusi() {

        Paivamaara verrattava = new Paivamaara(13, 8, 2014);// vuosi kuukausi,päivä 
        Paivamaara instance = new Paivamaara(15, 8, 2014);
        boolean expResult = false;
        boolean result = instance.aiemmin(verrattava);
        assertEquals(expResult, result);
    }

    @Test
    public void testlaskeErotus() {
        System.out.println("laskeErotus");
        Paivamaara verrattava = new Paivamaara(23, 11, 2013);
        Paivamaara instance = new Paivamaara(25, 12, 2013);
        int expResult = 0;
        int result = instance.laskeErotus(verrattava);
        assertEquals(expResult, result);
    }

    @Test
    public void testPalautakokolukuna() {
        System.out.println("palautakokolukuna");
        Paivamaara instance = new Paivamaara(14, 11, 2016);
        int expResult = 14112016;
        int result = instance.palautakokolukuna();
        assertEquals(expResult, result);

    }
}
