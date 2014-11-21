/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PorssisalkkuOMX;

import PorssisalkkuOMX.Pankintili;
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
public class PankintiliTest {

    Pankintili instance = new Pankintili(100000.0);

    public PankintiliTest() {
        instance.getmarkkinaArvot().put("UPM", 11.0);
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
     * Test of myy method, of class Pankintili.
     */
    @Test
    public void testMyy() {
       

        double result = instance.myy("UPM", 100);
        assertEquals(result, 98900, 0.01);
    }
    /*
     @Test
     public void Limiittitili() {
     Limiittitili limiittitili2 = new Limiittitili();
     double vastaus = limiittitili2.osta(10.0, 100);
     assertEquals(vastaus, 99000.0, 0.01);
        
     public double myy(String osakkeennimi,int saldo){
     return  pankintili-=markkinaArvot.get(osakkeennimi)*saldo;
     }
     }
     */

    /**
     * Test of osta method, of class Pankintili.
     */
  /*
      @Test
    public void testOsta() {
        System.out.println("osta");

        double result = instance.osta("UPM", 1);
        assertEquals(result, 100011, 0.0);

    }
    */
/*
    public double osta(String osakkeennimi,int saldo){
        return Isotili+=markkinaArvot.get(osakkeennimi)*saldo;
    }
    */
    @Test
    public void testErotusVuosissa() {
        System.out.println("erotusVuosissa");
        Paivamaara verrattava = new Paivamaara(16, 8, 2044);
        Paivamaara instance = new Paivamaara(16, 8, 2014);
        int expResult = 30;
        int result = instance.erotusVuosissa(verrattava);
        assertEquals(expResult, result);

    }


    @Test
    public void testOsta() {
       double result=instance.osta("UPM", 100);
       assertEquals(result,101100.0,0.01);
        
       
        
    
}
}
    /*
  Pankintili i= new Pankintili(pankintili);
        
        double expResult = 1001000;
        double result = i.osta(osake, saldo);
        assertEquals(expResult, result, 10);


public double osta(String osakkeennimi,int saldo){
        saldot.put(osakkeennimi, saldo);
        
        markkinaArvot.put(osakkeennimi,markkinaArvot.get(Osake));
       return Isotili+=markkinaArvot.get(osakkeennimi)*saldo;

   @Test
    public void lisaaOsake(){
        PorssisalkkuOMX salkku=new PorssisalkkuOMX();
        salkku.lisaaOsake("UPM", 100, 11.0, 11.0);
        HashMap<String,Integer> saldot=salkku.getsaldot();
        assertEquals((Integer)100,saldot.get("UPM"));



    */

        
      
  
    



   

