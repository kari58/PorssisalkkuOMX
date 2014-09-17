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
public class Pankintili extends PorssisalkkuOMX{
    private double pankintili;
    private Object Osake;
    private int saldo;
    public Pankintili(double pankintili){
        this.pankintili=pankintili;
    }
    public double myy(){
       return  pankintili-=markkinaArvo*saldo;
    }
                           //joku haluaa ostaa
    
    public double osta(){
        return pankintili+=markkinaArvo*saldo;
    }
}





