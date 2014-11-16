/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PorssisalkkuOMX;

import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kromanow@cs
 */
public class PorssisalkkuOMXTest {
    private Object saldot;
    
    public PorssisalkkuOMXTest() {
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
public void konstruktoriPorssisalkkuOMX(){
    PorssisalkkuOMX ostohinnat=new PorssisalkkuOMX();
        HashMap<String, Double> vastaus=ostohinnat.getostohinnat();
        assertEquals(vastaus,0.0);
    
}
    // TODO add test methods here. public PorssisalkkuOMX() {
       // this.ostohinnat = new HashMap<>();
    // The methods must be annotated with annotation @Test. For example:
    @Test
    public void konstruktoriLimiittitili() {

        Omatili limiittitili = new Omatili("tunnus", "salasana");
        double vastaus = limiittitili.getLimiittitili();
        assertEquals(vastaus, 1000.0, 0.01);
    }
    /*
      public void vahennaOsake(String osake, int saldo, double markkinaArvo) { //lisätty 29.10
        this.saldot.put(osake, saldot.get(osake) - saldo);
    }
    */
    @Test
    public void  vahennaOsake(){
        PorssisalkkuOMX salkku=new PorssisalkkuOMX();
        int vastaus = this.saldot.hashCode();
                assertEquals(vastaus, 0);
    }
}
