/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.porssisalkkuomx;

import java.util.Collections;

/**
 *
 * @author kromanow
 */
public class Limiittitili extends PorssisalkkuOMX {
    private double limiittitili;

    private String osakkeennimi;
   // private Tapahtumat o;       //18.9 ASSISTENTTI
    //private PorssisalkkuOMX h;    //   vanhinosake()   yritetään  yhdistää  

    
    private int saldo;
    private int PE ; //P/E
    private int F; //määritellään myöhemmin
       private double ostohinta;
       private double markkinaArvo;
    public Limiittitili(){
        this.limiittitili=100000.0;
    }
   /**
    * 
     *myydään osake, kun se on vanhin ostosarjasta, jos osakkeen hinta putoaa ostohinnasta 5% 
     * tai kurssi nousee ostohinnasta 10%
     * lopussa tillee tulee myynnin arvo, provisiota tai veroa ei huomioida tässä
    
    */
    public double getLimiittitili(){
        return limiittitili;
    }
    
    public double myy(String osake,int saldo){
       // vanhinosake()
        Collections.sort(super.osakkeet);
     
        
        if(saldot.containsKey(osake)){//  if saldot.get(osake)>saldo TÄHÄN PITÄISI SAADA VANHIN()OSAKE
             if(((ostohinnat.get(osakkeennimi) / markkinaArvot.get(osakkeennimi)) == 0.95) &&
            ((ostohinnat.get(osakkeennimi)/ markkinaArvot.get(osakkeennimi)) >= 1.1)) {
            } else {
                 limiittitili+=markkinaArvo*saldo;
            }
        }
        return limiittitili;
    }
    /**
     * ostetaan osakeita kun sen kurssin P/E -luku on välillä 7 ja 16
     * F määritellään myöhemmin, kuitenkin syklisiä osakkeita ostetaan käyrän minimissä ja sama periaate 
     * muutenkin muissa ostoissa,keskitytään ainoastaan osinkja maksaviin
     * ostossa limiittililtä lähetetään rahaa välittäjälle
     * @param osake
     * @param saldo
     * @return 
     */
    public double osta(double ostohinta,int saldo){ 
        if ((7 < PE) && (PE < 16) && (F <= 5) && (F >= 2)) {  //  if limiittitili>=markkinaArvot*saldo 
                return limiittitili -= this.saldo * ostohinta;
                //return    pankintili+=this.saldo*ostohinta; //pankin provisiota ei huomioida, voi ottaa *1,005
            }
         
        
        return limiittitili-=ostohinta*saldo;
    //saldot.put    ostohinnat.put   markkinaArvot.put    
    }
    
}


/*
@Test
            public void Tapahtumat2(){
                
          
    Tapahtumat tapahtumat=new Tapahtumat("UPM", 11, 9, 2010);
    Tapahtumat tapahtumat2=new Tapahtumat("StoraEnso", 12, 8, 2013);
    boolean vastaus=tapahtumat.vanhempiKuin(tapahtumat2);
    assertTrue(vastaus);
    
   voitot/tappiot
publpublic double myy(String osake, int saldo) {
                double voitotTappiot = 0;
                if (((ostohinta / markkinaArvo) ==0.95) || ((ostohinta / markkinaArvo) == 1.1)) {
                    saldo = 0;//jos myydään kaikki
                    return limiittitili += this.saldo * this.markkinaArvo;
                    //return pankintili-=this.saldo*this.markkinaArvo;
                  
//return voitotTappiot+=this.saldo*markkinaArvo-this.saldo*this.ostohinta;}ic double myy(String osake, int saldo) {

                double voitotTappiot = 0;

                if (((ostohinta / markkinaArvo) ==0.95) || ((ostohinta / markkinaArvo) == 1.1)) {
                    saldo = 0;//jos myydään kaikki
                    return limiittitili += this.saldo * this.markkinaArvo;
                    //return pankintili-=this.saldo*this.markkinaArvo;

                    //return voitotTappiot+=this.saldo*markkinaArvo-this.saldo*this.ostohinta;}


}
*/