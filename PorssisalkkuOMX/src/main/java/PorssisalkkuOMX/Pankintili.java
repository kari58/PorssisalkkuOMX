/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PorssisalkkuOMX;

/**
 *   protected HashMap<String, Integer> saldot;
   protected HashMap<String, ArrayList<Integer>> samaaOstettuUseammin;
 * Pankintili kasvaa ja vähenee, kun ostetaan tai myydään
 * Pankintili toimii välittäjänä ostolle, jossa myyjä voi olla 
 * myös joku muu kuin tämä pankki eli siis toinen pankki
 * Sax-järjestelmään tuodaan myytävät osakkeet eri välittäjilta
 * osto() tehdään kun ostokurssitarjous osuu haarukan sisään
 *
 * @author kromanow
 */
public class Pankintili extends PorssisalkkuOMX{
    private double Isotili;
    private Object Osake;
    private int saldo;
    public Pankintili(double Isotili){
        super();
        this.Isotili=Isotili;
        this.saldo=100;
    }

    public Pankintili(Pankintili pankintili) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
    asiakkaan myydessä osaketta pankin arvo-osuustili kyseiselle asiakkaalle vähenee myynnin edestä. vuoden lopussa
    pankki tilittää voitoista ja osingoista 30% verottjalla
    */
    public double myy(String osakkeennimi,int saldo){
       return Isotili-=markkinaArvot.get(osakkeennimi)*saldo;
    }
                          
    /**
     *  this.markkinaArvot.put(osake, markkinaArvo);
    asiakkaan ostaessa osakkeita pankin tili kasvaa ostoll
    */
    public double osta(String osakkeennimi,int saldo){
        saldot.put(osakkeennimi, saldo);
        
        markkinaArvot.put(osakkeennimi,markkinaArvot.get(Osake));
       return Isotili+=markkinaArvot.get(osakkeennimi)*saldo;
     //  return Isotili+= markkinaArvot.get(Osake).doubleValue()*saldo;
        
    }
}





