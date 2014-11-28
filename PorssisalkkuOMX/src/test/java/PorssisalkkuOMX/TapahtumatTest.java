package PorssisalkkuOMX;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import PorssisalkkuOMX.Tapahtumat;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
public class TapahtumatTest {
    
    public TapahtumatTest() {
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
    public void hello(){
}
    @Test
    public void konstruktoriTapahtumat(){
        Tapahtumat tapahtumat=new Tapahtumat("U" ,11, 9, 2014);
        String vastaus=tapahtumat.getOsakkeennimi();
        assertEquals("U",vastaus);
    }
    @Test
    public void Tapahtumat(){
        
        Tapahtumat tapahtumat=new Tapahtumat("UPM", 11, 9, 2014);
               // Tapahtumat tapahtumat=new Tapahtumat("StoraEnso", 12, 8, 2013);

        String vastaus=tapahtumat.getOsakkeennimi();
        assertEquals("UPM",vastaus);
    }
    @Test
            public void Tapahtumat2(){
                
          
    Tapahtumat tapahtumat=new Tapahtumat("UPM", 11, 9, 2011);
    Tapahtumat tapahtumat2=new Tapahtumat("StoraEnso", 12, 8, 2013);
    boolean vastaus=tapahtumat.vanhempiKuin(tapahtumat2);
    assertTrue(vastaus);
    
    
}
         
   
            @Test
            public void Tapahtumat3vanhinosadake(){
                Tapahtumat tapahtumat3=new Tapahtumat("Lemminkainen",23,9,2010);
                Tapahtumat tapahtumat4=new Tapahtumat("Lemminkainen",23,9,2013);
                int answer=tapahtumat3.vanhinosake();
                
                
                Calendar cal = Calendar.getInstance();
               
                DateFormat dateFormat = new SimpleDateFormat("yyyy");
                
                System.out.println("nykyinen vuosi: " + dateFormat.format(cal.getTime()));
                
                assertEquals(Integer.parseInt(dateFormat.format(cal.getTime())) - 2010, answer);
            }
            @Test
            public void compareTo(){
                Tapahtumat tapahtumat5=new Tapahtumat("Lemminkainen",23,9,2010);
                Tapahtumat tapahtumat6=new Tapahtumat("Lemminkainen",23,9,2009);
                int vastaus=tapahtumat5.compareTo(tapahtumat6);
                int expResult=1;
                assertEquals(expResult,vastaus);
            }
              @Test 
        public void vanhempiKuin(){
            Tapahtumat tapahtumat7=new Tapahtumat("Lemminkainen",23,9,2000);
            Tapahtumat tapahtumat8=new Tapahtumat("Lemminkainen",23,9,2009);
            boolean vastaus=tapahtumat7.vanhempiKuin(tapahtumat8);
            assertTrue(vastaus);
                  
              }
              
}

/**
 *  public boolean vanhempiKuin(Tapahtumat verrattava){
        return this.ostopaiva.aiemmin(verrattava.ostopaiva);
    }
 *  public int compareTo(Tapahtumat o) {
        return this.ostopaiva.palautakokolukuna()-o.ostopaiva.palautakokolukuna();
        * 
       this.ostopaiva=new Paivamaara(paiva, kuukausi, vuosi); 
    } public void testPalautakokolukuna() {
        System.out.println("palautakokolukuna");
        Paivamaara instance = new Paivamaara(14,11,2016);
        int expResult = 14112016;
        int result = instance.palautakokolukuna();
        assertEquals(expResult, result);
 * 
 * 
 * 
 * selvittää onko 2013 vai 2012 ostettu osake vanhin FIFO-periaatteeseen
DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
Calendar cal = Calendar.getInstance();
System.out.println(dateFormat.format(cal.getTime())); //2014/08/06 16:00:22



 public int vanhinosake(){   
        Calendar nyt=Calendar.getInstance();
    int vuosi=nyt.get(Calendar.YEAR);
    int kuukausi=nyt.get(Calendar.MONTH)+1;
    int paiva=nyt.get(Calendar.DATE);
    Paivamaara tamaPaiva=new Paivamaara(paiva,kuukausi, vuosi);
    return ostopaiva.erotusVuosissa(tamaPaiva);
        
    }
*/