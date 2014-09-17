/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.porssisalkkuomx;

import java.util.Calendar;

/**
 *
 * @author kromanow
 */
public class Limiittitili extends PorssisalkkuOMX{
    private double limiittitili;
    private String osake;
    private String osakkeennimi;
    private int saldo;
    public Limiittitili(){
        this.limiittitili=100000;
    }
    
    
    public double myy(String osake,int saldo){
        if(saldot.containsKey(osake)){//  if saldot.get(osake)>saldo 
             if(osakkeennimi.vanhinosake()&&((ostohinnat.get(osakkeennimi) / markkinaArvot.get(osakkeennimi)) < 0.95) ||
            ((ostohinnat.get(osakkeennimi)/ markkinaArvot.get(osakkeennimi)) == 1.1))
            limiittitili+=markkinaArvo*saldo;
        }
        return limiittitili;
    }
    public double osta(String osake,int saldo){
        if ((7 < PE) && (PE < 16) && (F <= 5) && (F >= 2)) {  //  if limiittitili>=markkinaArvot*saldo 
                return limiittitili -= this.saldo * ostohinta;
                //return    pankintili+=this.saldo*ostohinta; //pankin provisiota ei huomioida, voi ottaa *1,005
            }
         
        
        return limiittitili-=markkinaArvo*saldo;
        
    }
    
}
