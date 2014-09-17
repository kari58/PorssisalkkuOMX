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
public class Limiittitili extends PorssisalkkuOMX{
    private double limiittitili;
    private Object osake;
    private int saldo;
    public Limiittitili(){
        this.limiittitili=100000;
    }
    public double myy(){
        if(saldot.containsKey(osake)){
            limiittitili+=markkinaArvo*saldo;
        }
        return limiittitili;
    }
    public double osta(String osake){
        
       
       // return osakkeet.get(osake);
        
        return limiittitili-=markkinaArvo*saldo;
        
    }
    puclic lisaaOsake(String osake){
        osakkeet.add(osakkeet.)
    }
}
