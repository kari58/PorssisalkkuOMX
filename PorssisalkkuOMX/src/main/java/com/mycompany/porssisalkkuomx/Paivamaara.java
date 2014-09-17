package com.mycompany.porssisalkkuomx;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kromanow
 */
public class Paivamaara {

    private int paiva;
    private int kuukausi;
    private int vuosi;
  

    public Paivamaara(int paiva,int kuukausi,int vuosi) {
        this.paiva = paiva;
        this.kuukausi = kuukausi;
        this.vuosi = vuosi;
    }

    public String toString() {
        return this.paiva + "." + this.kuukausi + "." + this.vuosi;
    }
    public int palautakokolukuna(){
        int l = vuosi+kuukausi*10000+paiva*1000000;
        return l;
    }

    public boolean aiemmin(Paivamaara verrattava) {
        if (this.vuosi < verrattava.vuosi) {
            return true;
        }
        if (this.vuosi == verrattava.vuosi && this.kuukausi < verrattava.kuukausi) {
            return true;
        }
        if (this.vuosi == verrattava.vuosi && this.kuukausi == verrattava.kuukausi && this.paiva < verrattava.paiva) {
            return true;
        }
        return false;

    }

    public int erotusVuosissa(Paivamaara verrattava) {  //vanhin ajassa pitäisi myös saada
        if (aiemmin(verrattava)) {
            return verrattava.erotusVuosissa(verrattava); // (this)
        }
        return laskeErotus(verrattava);
    }

    private int laskeErotus(Paivamaara verrattava) {
        int vuosiPois = 0;
        if (this.kuukausi < verrattava.kuukausi) {
            vuosiPois = 1;
        } else if (this.kuukausi ==verrattava.kuukausi 
             && this.paiva < verrattava.paiva)
        
        
            {
        vuosiPois = 1;
        }
            return this.vuosi-verrattava.vuosi-vuosiPois;
    }
    
}
