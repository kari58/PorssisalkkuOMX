/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PorssisalkkuOMX;

import PorssisalkkuOMX.Kirjautuminen;
import java.io.InputStream;
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

    /**
     * Test of kirjautuminen method, of class Kirjautuminen.
     */
    @Test
    public void testKirjautuminen() {
        Scanner scanner = new Scanner("tunnus\nsalasana\n");
        kirjautuminen = new Kirjautuminen(scanner);
        kirjautuminen.kirjautuminen();
        
    }
    @Test
    public void Kirjautuminen(){
       Kirjautuminen kirja=new Kirjautuminen("tunnus","salasana");
       
        String vastaus=kirja.toString();
       assertEquals("Kirjautuminen",vastaus);
      
    }
    @Test
    public void toStringFanettutoinennimi(){
        Kirjautuminen kirja=new Kirjautuminen("tunnus","salasana");
        String vastaus=kirja.toString();
        assertEquals("Kirjautuminen",vastaus);
        
    }
    
}
/*
 public String toString() {
        return "Kirjautuminen";       //{" + '}';
    }
Kirjautuminen kirja=new Kirjautuminen("tunnus","salasana");
       
        String vastaus=kirja.toString();
        System.out.println(vastaus);
    public void Tapahtumat(){
        
        Tapahtumat tapahtumat=new Tapahtumat("UPM", 11, 9, 2014);
               // Tapahtumat tapahtumat=new Tapahtumat("StoraEnso", 12, 8, 2013);

        String vastaus=tapahtumat.getOsakkeennimi();
        assertEquals("UPM",vastaus);
*/