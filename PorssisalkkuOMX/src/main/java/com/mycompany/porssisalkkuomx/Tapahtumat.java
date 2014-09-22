package com.mycompany.porssisalkkuomx;


import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kromanow
 */
public class Tapahtumat implements Comparable<Tapahtumat>{
    private String osakkeennimi;
    private Paivamaara ostopaiva;
    
    public Tapahtumat(String osakkeennimi,int paiva,int kuukausi,int vuosi){
        this.osakkeennimi=osakkeennimi;
        this.ostopaiva=new Paivamaara(paiva,kuukausi, vuosi);
    }
    public Tapahtumat(String osakkeennimi,Paivamaara ostopaiva){
        this.osakkeennimi=osakkeennimi;
        this.ostopaiva=ostopaiva;
    }
    public Tapahtumat(String osakkeennimi){
        this.osakkeennimi=osakkeennimi;
    
    Calendar nyt=Calendar.getInstance();
    int vuosi=nyt.get(Calendar.YEAR);
    int kuukausi=nyt.get(Calendar.MONTH)+1;
    int paiva=nyt.get(Calendar.DATE);
    this.ostopaiva=new Paivamaara(paiva, kuukausi, vuosi);
    
}
    /*
    FIFO-säännön mukaan myydessä vanhin osake pitää myydä ekana
    */
    public int vanhinosake(){   
        Calendar nyt=Calendar.getInstance();
    int vuosi=nyt.get(Calendar.YEAR);
    int kuukausi=nyt.get(Calendar.MONTH)+1;
    int paiva=nyt.get(Calendar.DATE);
    Paivamaara tamaPaiva=new Paivamaara(paiva,kuukausi, vuosi);
        System.out.println("vuosi.... " + vuosi + " ja... " + ostopaiva.toString());
    return ostopaiva.erotusVuosissa(tamaPaiva);
        
    }

    public boolean vanhempiKuin(Tapahtumat verrattava){
        return this.ostopaiva.aiemmin(verrattava.ostopaiva);
    }
    public String getOsakkeennimi(){
        return this.osakkeennimi;
    }
    public String toString(){
        return this.osakkeennimi+",ostopäivä "+this.ostopaiva;
    }
    public Paivamaara getVanhin(){
        return this.ostopaiva;
    }
/**
 * palauttaa kok.lukuna, joka on määritelty Paivamaara luokassa
 * @param o
 * @return 
 */
    @Override
    public int compareTo(Tapahtumat o) {
        return this.ostopaiva.palautakokolukuna()-o.ostopaiva.palautakokolukuna();
        
    }
}
//public class Main{
   // public static void main(String[]args){
      //  Ostoja upm= new FIFOOstoja("UPM", 15,9,2014)

  //  }
