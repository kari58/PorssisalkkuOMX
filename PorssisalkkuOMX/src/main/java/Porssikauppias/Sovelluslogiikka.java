/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Porssikauppias;

import com.mycompany.porssisalkkuomx.Omatili;

/**
 *
 * @author kromanow
 */
public class Sovelluslogiikka extends Omatili{
    
 
    private double  limiittitili;
    Object osta;
    Object myy;

    public Sovelluslogiikka(String tunnus, String salasana) {
        super(tunnus, salasana);
    }

  
   
 
    public double osta(String osake,double ostohinta, int saldo) {
     return  limiittitili += ostohinta*saldo;
    }
     
    public double myy(String osake,double markkinaArvo, int saldo) {
     return  limiittitili-= markkinaArvo*saldo;
    }
}

   
 
   
    

    

