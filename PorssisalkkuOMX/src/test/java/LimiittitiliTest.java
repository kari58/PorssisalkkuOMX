/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.porssisalkkuomx.Limiittitili;
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
public class LimiittitiliTest {

    public LimiittitiliTest() {
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
     public void konstruktoriLimiittitili(){
     Limiittitili limiittitili=new Limiittitili();
     double vastaus=limiittitili.getLimiittitili();
     assertEquals(vastaus,100000.0,0.01);
     }
     

    @Test
    public void Limiittitili() {
        Limiittitili limiittitili2 = new Limiittitili();
        double vastaus = limiittitili2.osta(10.0, 100);
        assertEquals(vastaus, 99000.0, 0.01);
    }
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