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
        
        Tapahtumat tapahtumat=new Tapahtumat("UPM", 11, 13, 2014);
               

        String vastaus=tapahtumat.getOsakkeennimi();
        assertEquals("UPM",vastaus);
    }
      @Test
    public void TapahtumatINTKUUKAUSI(){
        
       
            Paivamaara ostopaiva=new Paivamaara( 11, 12, 2014);
String vastaus=ostopaiva.toString();
        
        assertEquals("11.12.2014",vastaus);
    }

    
    @Test
    public void testTostring(){
        System.out.println("toString");
        Tapahtumat instance=new Tapahtumat("UPM,28.11.2014");
        String expResult="UPM,28.11.2014";
        String result=instance.toString();
        assertEquals(expResult,result);
                }

    
       @Test
            public void Tapahtumat2(){
                
          
    Tapahtumat tapahtumat=new Tapahtumat("UPM", 11, 12, 2013);
    Tapahtumat tapahtumat2=new Tapahtumat("StoraEnso", 12, 12, 2013);
    boolean vastaus=tapahtumat.vanhempiKuin(tapahtumat2);
    assertTrue(vastaus);
    
    
}
         
   
            @Test
            public void Tapahtumat3vanhinosadake(){
                Tapahtumat tapahtumat3=new Tapahtumat("Lemminkainen",22,8,2010);
                Tapahtumat tapahtumat4=new Tapahtumat("Lemminkainen",23,7,2013);
                int answer=tapahtumat3.vanhinosake();
                
                
                Calendar cal = Calendar.getInstance();
               
                DateFormat dateFormat = new SimpleDateFormat("yyyy");
                
             
                
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

