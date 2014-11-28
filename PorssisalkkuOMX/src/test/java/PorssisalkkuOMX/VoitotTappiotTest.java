/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PorssisalkkuOMX;

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**TÄMÄN VOISI POISTAA KOSKA KOKO LUOKKA ON SIIREETTY OMATILI
 *ÄLÄ  SIIRRÄ VIELÄ ROSKIIN , KOSAK VOIT KATSELLA JUNIT TESTIIN NMALLIAA
 * @author kromanow
// */
//public class VoitotTappiotTest {
//    
//    public VoitotTappiotTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of getVoitotTappiot method, of class VoitotTappiot.
//     */
//    @Test
//    public void testGetVoitotTappiot() {
//        System.out.println("getVoitotTappiot");
//        VoitotTappiot instance = new VoitotTappiot();
//        double expResult = 0.0;
//        double result = instance.getVoitotTappiot();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getLimiittitili method, of class VoitotTappiot.
//     */
//    @Test
//    public void testGetLimiittitili() {
//        System.out.println("getLimiittitili");
//        VoitotTappiot instance = new VoitotTappiot();
//        double expResult = 0.0;
//        double result = instance.getLimiittitili();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getOstohinta method, of class VoitotTappiot.
//     */
//    @Test
//    public void testGetOstohinta() {
//        System.out.println("getOstohinta");
//        VoitotTappiot instance = new VoitotTappiot();
//        double expResult = 0.0;
//        double result = instance.getOstohinta();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getMarkkinaArvo method, of class VoitotTappiot.
//     */
//    @Test
//    public void testGetMarkkinaArvo() {
//        System.out.println("getMarkkinaArvo");
//        VoitotTappiot instance = new VoitotTappiot();
//        double expResult = 0.0;
//        double result = instance.getMarkkinaArvo();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setVoitotTappiot method, of class VoitotTappiot.
//     */
//    @Test
//    public void testSetVoitotTappiot() {
//        System.out.println("setVoitotTappiot");
//        double voitotTappiot = 0.0;
//        VoitotTappiot instance = new VoitotTappiot();
//        instance.setVoitotTappiot(voitotTappiot);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setLimiittitili method, of class VoitotTappiot.
//     */
//    @Test
//    public void testSetLimiittitili() {
//        System.out.println("setLimiittitili");
//        double limiittitili = 0.0;
//        VoitotTappiot instance = new VoitotTappiot();
//        instance.setLimiittitili(limiittitili);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setOstohinta method, of class VoitotTappiot.
//     */
//    @Test
//    public void testSetOstohinta() {
//        System.out.println("setOstohinta");
//        double ostohinta = 0.0;
//        VoitotTappiot instance = new VoitotTappiot();
//        instance.setOstohinta(ostohinta);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setMarkkinaArvo method, of class VoitotTappiot.
//     */
//    @Test
//    public void testSetMarkkinaArvo() {
//        System.out.println("setMarkkinaArvo");
//        double markkinaArvo = 0.0;
//        VoitotTappiot instance = new VoitotTappiot();
//        instance.setMarkkinaArvo(markkinaArvo);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ostotMyynnit method, of class VoitotTappiot.
//     */
//    @Test
//    public void testOstotMyynnit() {
//        System.out.println("ostotMyynnit");
//        VoitotTappiot instance = new VoitotTappiot();
//        double expResult = 0.0;
//        double result = instance.ostotMyynnit();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    if (!samaaOstettuUseammin.isEmpty() && samaaOstettuUseammin.containsKey(osake)) {  //lisätty 18.11 tässä toisen kerran 
//            tai useammin
//
//            ArrayList<Integer> aikaisemmatOstot = samaaOstettuUseammin.get(osake);
//
//            aikaisemmatOstot.add(saldo);
//            this.samaaOstettuUseammin.put(osake, aikaisemmatOstot);
//
//        } else {
//            ArrayList<Integer> ostot = new ArrayList<Integer>();
//            ostot.add(saldo);
//            this.samaaOstettuUseammin.put(osake, ostot);
//            lisätty 18.11 tässä ekaa kertaa 
//        }
// public HashMap<String, ArrayList<Integer>> getsamaaOstettuUseammin() {
//        return samaaOstettuUseammin;
//    }
   // protected HashMap<String, ArrayList<Integer>> samaaOstettuUseammin; //lisätty 18.11
//   this.samaaOstettuUseammin = new HashMap<>();
////  
//    public double ostohinta(String osake) {
//        if (!this.ostohinnat.containsKey(osake)) {
//            return ostohinnat.get(osake);
//        }
//////        return this.ostohinnat.get(osake);
    
//    public double markkinaArvo(String osake) {
//        if (!this.markkinaArvot.containsKey(osake)) {
//            return this.markkinaArvot.get(osake);
        
//        return this.markkinaArvot.get(osake);
//    }
    //omatili.getsamaaOstettuUseammin().put(nimiKentta.getText(),ArrayList<Integer>());
 //omatili.getsamaaOstettuUseammin().put(osake, ArrayList);
//omatili.getsamaaOstettuUseammin();
//        ostohinnat.put("UPM", 11.0);   //näitä käytetty JUNITest
//        markkinaArvot.put("UPM", 12.0);
//      //  saldot.put("UPM", 100);  POISTETTTU JUNITTEST PORSSISDALKKUOMX
  // PorssisalkkuOMX salkku=new PorssisalkkuOMX();
            
           // salkku.ostohinnat.put("Talvivaara",0.05);
           // salkku.osakkeet.add(new Tapahtumat("Talvivaara", 29, 9, 2014));
           // salkku.saldot.put("Talvivaara", 1000);
            
           // salkku.ostohinnat.put("Talvivaara", 0.035);
           // salkku.osakkeet.add(new Tapahtumat("Talvivaara", 30, 9, 2014));
             //salkku.saldot.put("Talvivaara", salkku.saldot.get("Talvivaara") + 30000);
            
 
            //salkku.markkinaArvot.put("Talvivaara", 0.07);
            //salkku.osakkeet.add(new Tapahtumat("Talvivaara",31,9,2014));
           
                  //  omatili.myy("Talvivaara", 1000);
            
            //System.out.println(eka + " ja " +  tokana + " ero vuosissa on "+ eka.erotusVuosissa(toka));
           // System.out.println("Ostettiin 30.9 "+salkku.osakkeet);
//   omattilit.put(nimiKentta.getText(), omatili);   ///tutki aamulla
 // private JLabel tulostusLabel;
  // private ArrayList<Integer> ArrayList;
  //  omatili.getsaldot();
//* KORVAA protected HashMap<String, Integer> saldot; protected HashMap<String,
// * ArrayList<Integer>> samaaOstettuUseammin;
// *
// *
// *
// *
// * toinen versio lisaaMyymasiosakkeet()
// *
// * // int saldot = 0; // for (int saldo : omatili.getsaldot().values()) { //
// * saldot += saldo; // } // String teksti = ""+saldot + " "; // // // for(String
// * avain : omatili.getsaldot().keySet()){ // teksti += avain + " ,"; // }
// */
// * public void lisaaMyymasiOsakkeet(){ String teksti = ""; Iterator entries
//     * = omatili.getMyydytOsakkeet().entrySet().iterator(); while
//     * (entries.hasNext()) { Entry thisEntry = (Entry) entries.next(); Object
//     * key = thisEntry.getKey(); Object value = thisEntry.getValue(); teksti +=
//     * value + " " + key +", "; //omatili.getostohinnat().get(key).doubleValue()
//     * } myymasi.setText(teksti); }
//     *
//     *
//     * @param container
//System.out.println("ooo"+omatili.getostohinnat().get(key.toString())); 
//a osto ja a osto ei tulosta molempia  mutta a ja b tulostuu
   //  BoxLayout layout12 = new BoxLayout(container, BoxLayout.Y_AXIS);
        
//            Paivamaara eka = new Paivamaara(24, 9, 2009);
//            Paivamaara toka = new Paivamaara(24, 9, 2014);
//            Kirjautuminen kirjautuminen=new Kirjautuminen(new Scanner(System.in));
//            eka.aiemmin(toka);
//            Pankintili pankintili=new Pankintili( 100000);
//      
//            pankintili.getostohinnat();
//            pankintili.getmarkkinaArvot();
//            pankintili.getsaldot();
//            kirjautuminen.kirjautuminen();
//omatili poisto
 //private Paivamaara ostopaiva;
  // private String osakkeennimi;
 // private int saldo;

   // private double ostohinta;
   // private double markkinaArvo;
//pankintili pois
// private Object Osake;
   // private int saldo;  this.saldo=100;
    

//}
