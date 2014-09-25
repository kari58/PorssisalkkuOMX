/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.porssisalkkuomx;

/**
 *
 * @author kromanow
 */
public class VoitotTappiot {
    private double voitotTappiot;
    private int saldo;
     private double limiittitili;
     private double ostohinta;
       private double markkinaArvo;

    public double getVoitotTappiot() {
        return voitotTappiot;
    }

    public double getLimiittitili() {
        return limiittitili;
    }

    public double getOstohinta() {
        return ostohinta;
    }

    public double getMarkkinaArvo() {
        return markkinaArvo;
    }

    public void setVoitotTappiot(double voitotTappiot) {
        this.voitotTappiot = voitotTappiot;
    }

    public void setLimiittitili(double limiittitili) {
        this.limiittitili = limiittitili;
    }

    public void setOstohinta(double ostohinta) {
        this.ostohinta = ostohinta;
    }

    public void setMarkkinaArvo(double markkinaArvo) {
        this.markkinaArvo = markkinaArvo;
    }
       public double ostotMyynnit(){
           return voitotTappiot+=this.saldo*markkinaArvo-this.saldo*this.ostohinta;
           
       }
    
}
