package com.mycompany.porssisalkkuomx;

import java.util.HashMap;
import java.util.Map;

/**
LAITA KAMAA ERI TIEDOSTOIHIN
*/
public class App {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("testi");
    }
    private HashMap<String, Double> ostohinnat;
    private HashMap<String, Integer> saldot;
    private HashMap<String, Double> markkinaArvot;
    private double markkinaArvo=11.8;//TÄSSÄ MUUTETTIIN 11.8  0.0 :KSI

     

    public App() {//konstruktori porssisalkkuOMX joka jostain syystä vääntää tätä nimeä
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

    

            

       

            public String toString() {
                return "Osakkeita myytiin " + saldot.values() + "hävittiin vuoden aikana ";
            }
        }
    

