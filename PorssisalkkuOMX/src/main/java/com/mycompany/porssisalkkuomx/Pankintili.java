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

    public Pankintili(Pankintili pankintili) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
    asiakkaan myydessä osaketta pankin arvo-osuustili kyseiselle asiakkaalle vähenee myynnin edestä. vuoden lopussa
    pankki tilittää voitoista ja osingoista 30% verottjalla
    */
    public double myy(String osakkeennimi,int saldo){
       return  pankintili-=markkinaArvot.get(osakkeennimi)*saldo;
    }
                           //joku haluaa ostaa
    /**
    asiakkaan ostaessa osakkeita pankin tili kasvaa ostolla
    */
    public double osta(String osakkeennimi,int saldo){
        return pankintili+=markkinaArvot.get(osakkeennimi)*saldo;
    }
}





