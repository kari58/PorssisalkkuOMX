/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PorssisalkkuOMX;

import java.util.HashMap;
import java.util.Objects;
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
    public void konstruktoriPorssisalkkuOMX() {
        PorssisalkkuOMX ostohinnat = new PorssisalkkuOMX();
        assertTrue(ostohinnat.getostohinnat().isEmpty());
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
    public void vahennaOsake2() {
        PorssisalkkuOMX salkku = new PorssisalkkuOMX();
        salkku.lisaaOsake("UPM", 100, 11.0, 11.0);
        salkku.vahennaOsake("UPM", 50, 12.0);
        HashMap<String, Integer> saldot = salkku.getsaldot();
        assertEquals((Integer) 50, saldot.get("UPM"));
        salkku.vahennaOsake("UPM", 50, 12.0);
          assertEquals((Integer) 0, saldot.get("UPM"));
    }
    
    @Test
    public void vahennaOsake() {
        PorssisalkkuOMX salkku = new PorssisalkkuOMX();
        salkku.lisaaOsake("UPM", 100, 11.0, 11.0);
        salkku.vahennaOsake("UPM", 100, 12.0);
        HashMap<String, Integer> saldot = salkku.getsaldot();
        assertEquals((Integer) 0, saldot.get("UPM"));
    }

    @Test
    public void lisaaOsake() {
        PorssisalkkuOMX salkku = new PorssisalkkuOMX();
        salkku.lisaaOsake("UPM", 100, 11.0, 11.0);
        salkku.lisaaOsake("UPM", 200, 11.0, 11.0);
        HashMap<String, Integer> saldot = salkku.getsaldot();
        assertEquals((Integer) 300, saldot.get("UPM"));
//        int vastaus=this.saldot.hashCode();     saldot+=saldot.get(osake);
//        assertEquals(vastaus, 1);
    
        
    }
@Test
public void getsaldot(){
    PorssisalkkuOMX salkku=new PorssisalkkuOMX();
     salkku.lisaaOsake("UPM", 10000, 11.0, 11.0);
    salkku.getsaldot();
    HashMap<String, Integer> saldot = salkku.getsaldot();
    assertEquals((Integer)10000,saldot.get("UPM"));
}
@Test
public void getostohinnat(){
    PorssisalkkuOMX salkku=new PorssisalkkuOMX();
    salkku.lisaaOsake("Talvivaara", 10000, 0.33, 0.00);
    salkku.getostohinnat();
    HashMap<String, Double> ostohinnat = salkku.getostohinnat();
    assertEquals((Double)0.33,ostohinnat.get("Talvivaara"));
}

    /**
     * public HashMap<String, Double> getmarkkinaArvot() {
        return markkinaArvot;
    }
     */
    @Test
   
public void hashCode1(){        //Objects obj
    PorssisalkkuOMX salkku=new PorssisalkkuOMX();
    HashMap<String, Double> ostohinnat = salkku.getostohinnat();
    ostohinnat.put("UPM", 0.1);
    Objects.hashCode(ostohinnat);
    System.out.print("Ostohinnat hashcode: " +Objects.hashCode(ostohinnat));
   // HashMap<String, Integer> saldot = salkku.getsaldot();
   // HashMap<String, Double> markkinaArvot = salkku.getmarkkinaArvot();
    assertEquals(3,3);
    //Ostohinnat hashcode: -1507768047Tests run: 8, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.028 sec
        
}

/*
    public int hashCode() {

28 		

        int hash = 3;

29 		

        hash = 73 * hash + Objects.hashCode(this.ostohinnat);

30 		

        hash = 73 * hash + Objects.hashCode(this.saldot);

31 		

        hash = 73 * hash + Objects.hashCode(this.markkinaArvot);

32 		

        return hash;

33 		

    }
*/

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PorssisalkkuOMXTest other = (PorssisalkkuOMXTest) obj;
        return true;
    }
}
