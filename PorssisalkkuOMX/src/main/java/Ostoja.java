/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kromanow
 */
public class Ostoja {
   private String osake;
   private int saldo;
   private double ostohinta;
   private double limiittitili;
   private double pankintili;
   private int PE;
   private int F;
        public Ostoja(String osake, int saldo, double ostohinta, double limiittitili, double pankintili, int PE, int F) {
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
    
}
