/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kromanow
 */

    
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
    
}
