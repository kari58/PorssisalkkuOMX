/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
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
public class NewporssisalkkuOMXTest {
    
    public NewporssisalkkuOMXTest() {
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
    public void hello() {}
    @Test
    public void konstruktoriApp(){
        NewporssisalkkuOMX salkku=new NewporssisalkkuOMX(10);
    }
}
 //public App() {//konstruktori porssisalkkuOMX joka jostain syystä vääntää tätä nimeä
       // this.ostohinnat = new HashMap<String, Double>();
       // this.saldot = new HashMap<String, Integer>();