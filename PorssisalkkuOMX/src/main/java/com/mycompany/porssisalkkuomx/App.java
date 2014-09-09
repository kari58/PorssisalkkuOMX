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
    private Map<String, Double> ostohinnat;
    private HashMap<String, Integer> saldot;
    private HashMap<String, Double> markkinaArvot;
    private Double markkinaArvo;

//    public class PorssisalkkuOMX{
//        private Map<String,Double>ostohinnat;//yhden vai koko pörssierän?
//        private Map<String,Integer>saldot;   //kpl
//        private Map<String,Double>markkinaArvot;//yhden vai koko pörssierän?
//        
//    }
    public App() {//konstruktori porssisalkkuOMX joka jostain syystä vääntää tätä nimeä
        this.ostohinnat = new HashMap<String, Double>();
        this.saldot = new HashMap<String, Integer>();
        this.markkinaArvot = new HashMap<String, Double>();
    }

    public void lisaaOsake(String osake, double ostohinta, int saldo) {
        this.ostohinnat.put(osake, ostohinta);
        this.saldot.put(osake, saldo);
        this.markkinaArvot.put(osake, markkinaArvo);

    }

    public double ostohinta(String osake) {
        if (!this.ostohinnat.containsKey(osake)) {
            return -9;
        }
        return this.ostohinnat.get(osake);
    }

    public int saldo(String osake) {
        if (!this.saldot.containsKey(osake)) {
            return -2;
        }
        return this.saldot.get(osake);
    }

    public double markkinaArvo(String osake) {
        if (!this.markkinaArvot.containsKey(osake)) {
            return -3;
        }
        return this.markkinaArvot.get(osake);
    }

    public class Ostot {

        private String osake;
        private int saldo;
        private double ostohinta;
        private double markkinaArvo;
        private double limiittitili;
        private double pankintili;  //välittäjän tili
        private int PE;  //P/E
        private int F;   //future, määritellään myöhemmin

        public Ostot(String osake, int saldo, double ostohinta, double limiittitili, double pankintili, int PE, int F) {
            this.osake = osake;
            this.saldo = saldo;
            this.ostohinta = ostohinta;
            this.limiittitili = 100000;
            this.pankintili = pankintili;
            this.PE = PE;

            this.F = F;

        }

        public double osta(String osake, int saldo) {
            if ((7 < PE) && (PE < 16) && (F <= 5) && (F >= 2)) {
                return limiittitili -= this.saldo * ostohinta;
                //return    pankintili+=this.saldo*ostohinta; //pankin provisiota ei huomioida, voi ottaa *1,005
            }
            return 0;
        }

        public class Myynnit {

            private String osake;
            private int saldo;
            private double ostohinta;
            private double markkinaArvo;
            private double limiittitili;
            private double pankintili;

            public Myynnit(String osake, int saldo, double ostohinta, double markkinaArvo, double limiittitili, double pankintili) {
                this.osake = osake;
                this.saldo = saldo;
                this.ostohinta = ostohinta;
                this.markkinaArvo = markkinaArvo;
                this.limiittitili = limiittitili;
                this.pankintili = pankintili;

            }

            public double myy(String osake, int saldo) {
                double voitotTappiot = 0;
                if (((ostohinta / markkinaArvo) < 0.95) || ((ostohinta / markkinaArvo) == 1.1)) {
                    saldo = 0;//jos myydään kaikki
                    return limiittitili += this.saldo * this.markkinaArvo;
                    //return pankintili-=this.saldo*this.markkinaArvo;
                    //return voitotTappiot+=this.saldo*markkinaArvo-this.saldo*this.ostohinta;}

                }
                return 0;
            }

            public String toString() {
                return "Osakkeita myytiin " + saldot.values() + "hävittiin vuoden aikana ";
            }
        }
    }
}
