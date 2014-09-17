/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.porssisalkkuomx;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author kromanow
 */
public class PorssisalkkuOMX {
     public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("testi");
    }
    private HashMap<String, Double> ostohinnat;
   HashMap<String, Integer> saldot;
    private HashMap<String, Double> markkinaArvot;
    double markkinaArvo;
ArrayList<Tapahtumat>osakkeet =new ArrayList<Tapahtumat>();

//if limittitili osto osakkeet.add(osake);
//if limiittitili myy osakkeet.remove(osake.get(osakkeennimi)
//if limiittitili myy osakkeet.remove(osake.vanhinosake();
     

    public PorssisalkkuOMX() {//konstruktori porssisalkkuOMX joka jostain syystä vääntää tätä nimeä
        this.ostohinnat = new HashMap<String, Double>();
        this.saldot = new HashMap<String, Integer>();
        this.markkinaArvot = new HashMap<String, Double>();
    }
public HashMap<String,Double> getostohinnat(){
    return ostohinnat;
}
public HashMap<String,Integer>getsaldot(){
    return saldot;
}
public HashMap<String,Double>getmarkkinaArvot(){
    return markkinaArvot;
}
        
        
    public void lisaaOsake(String osake, double ostohinta, int saldo) {
        this.ostohinnat.put(osake, ostohinta);
        this.saldot.put(osake, saldo);
        this.markkinaArvot.put(osake, markkinaArvo);

    }

    public double ostohinta(String osake) {
        if (!this.ostohinnat.containsKey(osake)) {
            return ostohinnat.get(osake);
        }
        return this.ostohinnat.get(osake);
    }

    public int saldo(String osake) {
        if (!this.saldot.containsKey(osake)) {
            return this.saldot.get(osake);
        }
        return this.saldot.get(osake);
    }

    public double markkinaArvo(String osake) {
        if (!this.markkinaArvot.containsKey(osake)) {
            return this.markkinaArvot.get(osake);
        }
        return this.markkinaArvot.get(osake);
    }
    public int myy(String osakkeennimi,int saldo){
        

             if(vanhinosake()&&((ostohinnat.get(osakkeennimi) / markkinaArvot.get(osakkeennimi)) < 0.95) ||
            ((ostohinnat.get(osakkeennimi)/ markkinaArvot.get(osakkeennimi)) == 1.1))

    

            

                 }

            public String toString() {
                return "Osakkeita myytiin " + saldot.values() + "hävittiin vuoden aikana ";
            }
    
}
