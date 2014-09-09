package com.mycompany.porssisalkkuomx;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
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

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    /**
     * Test of main method, of class App.
     */
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        App.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lisaaOsake method, of class App.
     */
    
    public void testLisaaOsake() {
        System.out.println("lisaaOsake");
        String osake = "UPM";
        double ostohinta = 11.8;
        int saldo = 100;
        App instance = new App();
        
        instance.lisaaOsake(osake, ostohinta, saldo);
        int oikeamaara=instance.getsaldot().get(osake);
        
        
        instance.lisaaOsake(osake, ostohinta, saldo);
     double oikeahinta= instance.getostohinnat().get(osake);
        // TODO review the generated test code and remove the default call to fail.
   assertEquals(oikeahinta,11.8);
   //assertEquals(oikeamaara,100);
   
   //public HashMap<String,Integer>getsaldot(){
   // return saldot;
}
 
     public void testLisaaOsakeSaldot() {
        System.out.println("lisaaOsake");
        String osake = "Nokian renkaat";
        double ostohinta = 26.5;
        int saldo = 100;
        App instance = new App();
        
        instance.lisaaOsake(osake, ostohinta, saldo);
        int oikeamaara=instance.getsaldot().get(osake);
        
       
        // TODO review the generated test code and remove the default call to fail.
   //assertEquals(oikeahinta,11.8);
   assertEquals(oikeamaara,100);
   
   //public HashMap<String,Integer>getsaldot(){
   // return saldot;
}
        
  

    /**
     * Test of ostohinta method, of class App.
     */
    public void testOstohinta() {
        System.out.println("ostohinta");
        String osake = "";
        App instance = new App();
        double expResult = 0.0;
        double result = instance.ostohinta(osake);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saldo method, of class App.
     */
    public void testSaldo() {
        System.out.println("saldo");
        String osake = "";
        App instance = new App();
        int expResult = 0;
        int result = instance.saldo(osake);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of markkinaArvo method, of class App.
     */
    public void testMarkkinaArvo() {
        System.out.println("markkinaArvo");
        String osake = "";
        App instance = new App();
        double expResult = 0.0;
        double result = instance.markkinaArvo(osake);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
