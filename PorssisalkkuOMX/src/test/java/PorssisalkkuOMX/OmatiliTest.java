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
    