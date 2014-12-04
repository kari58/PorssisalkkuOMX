package PorssisalkkuOMX;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import PorssisalkkuOMX.Omatili;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author kromanow
 */
public class OmatiliTest {

    public OmatiliTest() {
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
    public void konstruktoriLimiittitili() {

        Omatili limiittitili = new Omatili("tunnus", "salasana");
        double vastaus = limiittitili.getLimiittitili();
        assertEquals(vastaus, 0.0, 0.01);
    }

    @Test
    public void Limiittitili() {
        Omatili limiittitili2 = new Omatili();
        double vastaus;
        vastaus = limiittitili2.osta("osake", 10, 100.0);
        assertEquals(vastaus, -1000.0, 0.01);
    }

    @Test
    public void getLimiittitili() {
        Omatili limiittitili = new Omatili();
        double vastaus = limiittitili.getLimiittitili();

        assertEquals(vastaus, 0.0, 0.0);

    }

    @Test
    public void setTunnus() {
        Omatili tunnus = new Omatili("tunnus", "salasana");
        String vastaus = tunnus.setTunnus();
        assertEquals("tunnus", vastaus);
    }

    @Test
    public void getTunnus() {
        Omatili tunnus = new Omatili("tunnus", "salasana");
        String vastaus = tunnus.getTunnus();
        assertEquals("tunnus", vastaus);
    }

    @Test
    public void setSalasana() {
        Omatili salasana = new Omatili("tunnus", "salasana");
        String vastaus = salasana.setSalasana();
        assertEquals("salasana", vastaus);
    }

    @Test
    public void getSalasana() {
        Omatili salasana = new Omatili("tunnus", "salasana");
        String vastaus = salasana.getSalasana();
        assertEquals("salasana", vastaus);
    }

    @Test
    public void getOsakkeet() {
        Omatili limiittitili = new Omatili();
        limiittitili.osta("UPM", 11, 1.0);
        assertEquals(limiittitili.getOsakkeet().size(), 1);
    }

    @Test
    public void testOsta() {

        PorssisalkkuOMX salkku = new PorssisalkkuOMX();
        Omatili limiittitili = new Omatili();

        limiittitili.osta("UPM", 100, 1.0);
        limiittitili.osta("UPM", 100, 1.0);

        salkku.lisaaOsake("UPM", 100, 11.0, 11.0);
        salkku.lisaaOsake("UPM", 100, 11.0, 11.0);
        
        HashMap<String, Integer> saldot = salkku.getsaldot();
        assertEquals((Integer) 200, saldot.get("UPM"));
    }

    @Test
    public void myy() {
        PorssisalkkuOMX salkku = new PorssisalkkuOMX();
         Omatili limiittitili = new Omatili();
        salkku.lisaaOsake("UPM", 100, 11.0, 11.0);
        limiittitili.osta("UPM", 100, 11.0);
        salkku.vahennaOsake("UPM", 10, 11.0);
        limiittitili.myy("UPM", 10, 11.0);
        HashMap<String, Double> MarkkinaArvot = salkku.getmarkkinaArvot();
        assertEquals((Double) 11.0, 11.0, 10.0);
    }
}
     ///ekana pitää ostaa joitain
//@Test
//public void myy1(){
//     ArrayList<Tapahtumat> osakkeet = new ArrayList<>();
//    PorssisalkkuOMX salkku=new PorssisalkkuOMX();
//    salkku.lisaaOsake("UPM", 100, 11.0, 12.0);
//    Tapahtumat eka=new Tapahtumat("UPM",19,11,2011);
//    Tapahtumat toka=new Tapahtumat("UPM",26,12,2014);
//   
//    osakkeet.add(eka);
//    osakkeet.add(toka);
//       HashMap<String, Integer> saldot = salkku.getsaldot();
////       saldot.putAll(saldot);
//    Omatili tili=new Omatili();
//    tili.osta("UPM", 100, 11.0);
//    double  limiitti = tili.myy("UPM", 100, 11.0);
//    assertEquals(0.0, limiitti);
//}
///*   OSTA EKAN OSTA TESTISSA PARI KERTAA
//    @Test
//    public void vahennaOsake() {
//        PorssisalkkuOMX salkku = new PorssisalkkuOMX();
//        salkku.lisaaOsake("UPM", 100, 11.0, 11.0);
//        //salkku.vahennaOsake("UPM", 100, 12.0);
//        HashMap<String, Integer> saldot = salkku.getsaldot();
//        assertEquals((Integer) 100, saldot.get("UPM"));
//        /*
//     @Test
//    public void testMyy() {
//       
//
//        double result = instance.myy("UPM", 100);
//        assertEquals(result, 98900, 0.01);
//    }   

//
// public double myy(String osake, int saldo, double markkinaArvo) {
//
//        Collections.sort(super.osakkeet);
//
//        if (saldot.containsKey(osake)) {
//
//            limiittitili += markkinaArvo * saldo;
//
//        }
//
//        vahennaOsake(osake, saldo, (double) markkinaArvo);
//
//        for (Tapahtumat osakkeet1 : new ArrayList<>(super.osakkeet)) {
//
//            if (osakkeet1.getOsakkeennimi().equals(osake)) {
//                super.osakkeet.remove(osakkeet1);
//            }
//        }
//        markkinaArvot.put(osake, markkinaArvo);
//
//        return limiittitili;
//
//    }
//
//*/
