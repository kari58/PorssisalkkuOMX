/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PorssisalkkuOMX;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Objects;

/**Luokka toimii arkistona ostohinnoille ,paivamaarille,tapahtumille, ja saldoille
 *
 * @author kromanow
 */
public class PorssisalkkuOMX {

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.ostohinnat);
        hash = 73 * hash + Objects.hashCode(this.saldot);
        hash = 73 * hash + Objects.hashCode(this.markkinaArvot);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PorssisalkkuOMX other = (PorssisalkkuOMX) obj;
        if (!Objects.equals(this.ostohinnat, other.ostohinnat)) {
            return false;
        }
        if (!Objects.equals(this.saldot, other.saldot)) {
            return false;
        }
        if (!Objects.equals(this.markkinaArvot, other.markkinaArvot)) {
            return false;
        }
        return true;
    }
     public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("testi");
    }
    protected HashMap<String, Double> ostohinnat;
   protected HashMap<String, Integer> saldot;
    protected HashMap<String, Double> markkinaArvot;
    double markkinaArvo=11.0;   //testiä varten
ArrayList<Tapahtumat>osakkeet =new ArrayList<Tapahtumat>();

/**
 * arralist osakkeet käytetään FIFO:ssa vanhimman osakkeen myynnissä
 */ 



     

    public PorssisalkkuOMX() {//konstruktori porssisalkkuOMX joka jostain syystä vääntää tätä nimeä
        this.ostohinnat = new HashMap<String, Double>();
        this.saldot = new HashMap<String, Integer>();
        this.markkinaArvot = new HashMap<String, Double>();
    }
    /**
     * ostohinta kuvaa osakkeen hinnan ostossa, saldot oston määrän saldot salkussa
     * markkinahinta on tämän päivän kurssi ja sitä käytetään myyntiä arvioitaessa
     * ostohetken kurssi on tietysti myyjälle markkinahinta
     * @return 
     */
public HashMap<String,Double> getostohinnat(){
    return ostohinnat;
}
public HashMap<String,Integer>getsaldot(){
    return saldot;
}
public HashMap<String,Double>getmarkkinaArvot(){
    return markkinaArvot;
}
        /**
         * ostossa kuhunkin sarakkeeseen lisätäään ostohinta ja määrä
         * markkina-arvot myyntiä tehtäessä
         * @param osake= tietyn osakkeen nimi
         * @param ostohinta=ostohetkellä maksettu hinta
         * @param saldo =kaikkien tietyn osakkeen lukumäärä
         * @param markkinaArvo =porssin määrittämä sen hetkinen kurssi osakkeelle
         */
        
    public void lisaaOsake(String osake, double ostohinta, int saldo,double markkinaArvo) {
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
