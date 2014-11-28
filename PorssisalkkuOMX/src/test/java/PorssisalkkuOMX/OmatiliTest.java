package PorssisalkkuOMX;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import PorssisalkkuOMX.Omatili;
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
        assertEquals(vastaus, 1000.0, 0.01);
    }

    @Test
    public void Limiittitili() {
       Omatili limiittitili2 = new Omatili();
        double vastaus;
        vastaus = limiittitili2.osta("osake",10, 100.0);
      assertEquals(vastaus, 0.0, 0.01);
    }
    @Test
    public void getLimiittitili(){
         Omatili limiittitili=new Omatili();
      double   vastaus =limiittitili.getLimiittitili();
        
        assertEquals(1000.0, vastaus,0.0);
               
    }
    @Test
    public void setTunnus(){
        Omatili tunnus=new Omatili("tunnus","salasana");
        String vastaus=tunnus.setTunnus();
        assertEquals("tunnus",vastaus);
    }
    @Test
    public void getTunnus(){
        Omatili tunnus=new Omatili("tunnus","salasana");
        String vastaus=tunnus.getTunnus();
        assertEquals("tunnus",vastaus);
    }
    @Test
    public void setSalasana(){
         Omatili salasana=new Omatili("tunnus","salasana");
          String vastaus=salasana.setSalasana();
          assertEquals("salasana",vastaus);
    }
          @Test
          public void getSalasana(){
        Omatili salasana=new Omatili("tunnus","salasana");
        String vastaus=salasana.getSalasana();
          assertEquals("salasana",vastaus);
    }
//        @Test
//        public void getOsakkeet(){
//            Tapahtumat osakkeet=new Tapahtumat("osakkeennimi", "paiva", " kuukausi", " vuosi");
//            
//        }
//    
    /*
       ArrayList<Tapahtumat> osakkeet = new ArrayList<Tapahtumat>();
     public ArrayList getOsakkeet() {
        return osakkeet;
    }
    
    
    
    
    
    
    
    
            public double getLimiittitili() {
        return limiittitili;
    }
     public double osta(String osake, int saldo, double ostohinta) {
        if ((7 < PE) && (PE < 16) && (F <= 5) && (F >= 2)) {
            return limiittitili -= this.saldo * ostohinta;

    */
}
/*@Test
 public void konstruktoriTapahtumat(){
 Tapahtumat tapahtumat=new Tapahtumat("UPM" ,11, 9, 2014);
 String vastaus=tapahtumat.getOsakkeennimi();
 assertEquals("UPM",vastaus);
 }
 public Limiittitili(){
 this.limiittitili=100000;
 }
 }


 /*
 public double osta(String osake,int saldo){
 if ((7 < PE) && (PE < 16) && (F <= 5) && (F >= 2)) {  //  if limiittitili>=markkinaArvot*saldo 
 return limiittitili -= this.saldo * ostohinta;
 //return    pankintili+=this.saldo*ostohinta; //pankin provisiota ei huomioida, voi ottaa *1,005
 }
         
        
 return limiittitili-=markkinaArvo*saldo;
        
 }
    
 }


 /*
 @Test
 public void Tapahtumat2(){
                
          
 Tapahtumat tapahtumat=new Tapahtumat("UPM", 11, 9, 2010);
 Tapahtumat tapahtumat2=new Tapahtumat("StoraEnso", 12, 8, 2013);
 boolean vastaus=tapahtumat.vanhempiKuin(tapahtumat2);
 assertTrue(vastaus);
    
    
 }
 */
