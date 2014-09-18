package com.mycompany.porssisalkkuomx;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

   
    public void testApp()
    {
        assertTrue( true );
    }

   
    public void testJotain() {
       
    }

    
    
    public void testLisaaOsake() {
        System.out.println("lisaaOsake");
        String osake = "UPM";
        double ostohinta = 11.8;
        int saldo = 100;
        PorssisalkkuOMX instance = new PorssisalkkuOMX();
        
        instance.lisaaOsake(osake, ostohinta, saldo);
        int oikeamaara=instance.getsaldot().get(osake);
        
        
        instance.lisaaOsake(osake, ostohinta, saldo);
        double oikeahinta= instance.getostohinnat().get(osake);
        
        assertEquals(oikeahinta,11.8);
    }
 
     public void testLisaaOsakeSaldot() {
        System.out.println("lisaaOsake");
        String osake = "UPM";
        double ostohinta = 11.8;
        int saldo = 100;
         PorssisalkkuOMX instance = new  PorssisalkkuOMX();
        
        instance.lisaaOsake(osake, ostohinta, saldo);
        int oikeamaara;
        oikeamaara = instance.getsaldot().get(osake);
        
       
            // TODO review the generated test code and remove the default call to fail.
            //assertEquals(oikeahinta,11.8);
            assertEquals(oikeamaara,100);
   
   //public HashMap<String,Integer>getsaldot(){
   // return saldot;
}
     public void testLisaaOsakemarkkinaArvot(){
         System.out.println("lisaaOsake");
         String osake="UPM";
         double markkinaArvo=11.8;  //TÄSSÄ 11.8 MUUTETTIIN 0.0
         int saldo=100;
         PorssisalkkuOMX instance=new  PorssisalkkuOMX();
         
         instance.lisaaOsake(osake, markkinaArvo, saldo);
          double oikeamarkkinaArvo=instance.getmarkkinaArvot().get(osake);
          assertEquals(oikeamarkkinaArvo,11.8);
     }
        
  

   
    public void testOstohinta() {
        System.out.println("ostohinta");
        String osake = "UPM";
        PorssisalkkuOMX instance = new  PorssisalkkuOMX();
        double expResult = 11.8;
       instance.lisaaOsake(osake, expResult, 100);
        double result = instance.ostohinta(osake);
        assertEquals(expResult, result, 11.8);
        // TODO review the generated test code and remove the default call to fail.
        
    }

  
    public void testSaldo() {
        System.out.println("saldo");
        String osake = "UPM";
       PorssisalkkuOMX instance = new  PorssisalkkuOMX();
        int expResult = 0;
        instance.lisaaOsake(osake, expResult, expResult);
        int result = instance.saldo(osake);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    
    public void testMarkkinaArvo() {
        System.out.println("markkinaArvo");
        String osake = "UPM";
        PorssisalkkuOMX instance = new  PorssisalkkuOMX();
        instance.lisaaOsake(osake, 0.0, 100);
        double result = instance.markkinaArvo(osake);
        assertEquals(result, 11.8);
        
        
    }
}
