/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PorssisalkkuOMX;

import PorssisalkkuOMX.Kirjautuminen;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;
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
public class KirjautuminenTest {

    private Kirjautuminen kirjautuminen;
    private Scanner lukija;

    public KirjautuminenTest() {
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
    public void Kirjautuminen() {
        Kirjautuminen kirja = new Kirjautuminen("tunnus", "salasana");

        String vastaus = kirja.toString();
        assertEquals("Kirjautuminen", vastaus);

    }

    @Test
    public void toStringFanettutoinennimi() {
        Kirjautuminen kirja = new Kirjautuminen("tunnus", "salasana");
        String vastaus = kirja.toString();
        assertEquals("Kirjautuminen", vastaus);

    }

    @Test
    public void KirjautuminenU() {
        lukija = new Scanner(System.in);
        Kirjautuminen kirjautuminen = new Kirjautuminen(lukija);

        assertEquals(true, kirjautuminen.omattilit.containsKey("kari"));
    }

}
