package com.mycompany.porssisalkkuomx;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Luokan tarkoitus on säilöä oston päivä.Myynnissä FIFO-periaatteella tarvitaan
 * vanhin päivä
 *
 * @author kromanow
 * 
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

    Paivamaara(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String toString() {
        return this.paiva + "." + this.kuukausi + "." + this.vuosi;
    }
    /**
    vanhinosake metodissa tarvitsee olla 
    public int compareTo(Tapahtumat o) {
        return this.ostopaiva.palautakokolukuna()-o.ostopaiva.palautakokolukuna();
    public double myy(String osake,int saldo){
       // vanhinosake()
        Collections.sort(super.osakkeet);
    FIFO säännön mukaan ensin pitää myydä, jos osakkeitta on ostettu useampana aikakaidella:vanhin osake
     * @return 
    */
    public int palautakokolukuna(){
        int l = vuosi+kuukausi*10000+paiva*1000000;
        return l;
    }
    
    /**
     * Kuvaus metodista aiemmin.etsii aikaisimman eli vanhimman
     * @param verrattava vertaa vanhinta ostoa
     * @return 
     */
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
    /**
     * etsii vanhimman kun ostopäivät selvilla
     * @param verrattava=vertaa eri päivämääriä ja etsii vanhimman
     * @return 
     * 
     */

    public int erotusVuosissa(Paivamaara verrattava) {  
        if (aiemmin(verrattava)) {
            return verrattava.erotusVuosissa(this); 
        }
        return laskeErotus(verrattava);
    }

    private int laskeErotus(Paivamaara verrattava) {
        System.out.println("Vuodet: " + vuosi + " " + verrattava.vuosi);
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



