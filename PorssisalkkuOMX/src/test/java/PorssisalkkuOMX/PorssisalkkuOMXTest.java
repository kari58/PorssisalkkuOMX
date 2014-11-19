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
        boolean b = ostohinnat.ostohinnat.containsKey("UPM");
        assertTrue(b);
}
   /*     
     @Test
    public void konstruktoriTapahtumat(){
        Tapahtumat tapahtumat=new Tapahtumat("UPM" ,11, 9, 2014);
        String vastaus=tapahtumat.getOsakkeennimi();
        assertEquals("UPM",vastaus);
    }
}
 
    */
   // TODO add test methods here. public PorssisalkkuOMX() {
       // this.ostohinnat = new HashMap<>();
    // The methods must be annotated with annotation @Test. For example:
    @Test
    public void konstruktoriLimiittitili() {

        Omatili limiittitili = new Omatili("tunnus", "salasana");
        double vastaus = limiittitili.getLimiittitili();
        assertEquals(vastaus, 1000.0, 0.01);
    }
    
     /* public void vahennaOsake(String osake, int saldo, double markkinaArvo) { //lisätty 29.10
        this.saldot.put(osake, saldot.get(osake) - saldo);
    
    }
   
    */
       @Test
    public void  vahennaOsake(){
        PorssisalkkuOMX salkku=new PorssisalkkuOMX();
     salkku.vahennaOsake("UPM", 100, 12.0);
     HashMap<String,Integer> saldot=salkku.getsaldot();
                assertEquals((Integer)0, saldot.get("UPM"));
    }
    @Test
    public void lisaaOsake(){
        PorssisalkkuOMX salkku=new PorssisalkkuOMX();
        salkku.lisaaOsake("UPM", 100, 11.0, 11.0);
        HashMap<String,Integer> saldot=salkku.getsaldot();
        assertEquals((Integer)100,saldot.get("UPM"));
//        int vastaus=this.saldot.hashCode();
//        assertEquals(vastaus, 1);
    }
   
 
}


/*
 public void lisaaOsake(String osake, int saldo, double ostohinta, double markkinaArvo) {
        this.ostohinnat.put(osake, ostohinta);
        this.saldot.put(osake, saldo);
        this.markkinaArvot.put(osake, markkinaArvo);

*/
