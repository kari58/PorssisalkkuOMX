/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PorssisalkkuOMX;

/**
 * protected HashMap<String, Integer> saldot; protected HashMap<String,
 * ArrayList<Integer>> samaaOstettuUseammin; Pankintili kasvaa ja vähenee, kun
 * ostetaan tai myydään Pankintili toimii välittäjänä ostolle, jossa myyjä voi
 * olla myös joku muu kuin tämä pankki eli siis toinen pankki Sax-järjestelmään
 * tuodaan myytävät osakkeet eri välittäjilta osto() tehdään kun
 * ostokurssitarjous osuu haarukan sisään
 *
 * @author kromanow
 */
public class Pankintili extends PorssisalkkuOMX {

    private double Isotili;
   

    public Pankintili(double Isotili) {
        super();
        this.Isotili = Isotili;
        
    }


    /**
     * asiakkaan myydessä osaketta pankin arvo-osuustili kyseiselle asiakkaalle
     * vähenee myynnin edestä. vuoden lopussa pankki tilittää voitoista ja
     * osingoista 30% verottjalla
     */
    public double myy(String osakkeennimi, int saldo) {

        return Isotili -= markkinaArvot.get(osakkeennimi) * saldo;
    }

    /**
     * this.markkinaArvot.put(osake, markkinaArvo); asiakkaan ostaessa osakkeita
     * pankin tili kasvaa ostoll
     */
    public double osta(String osakkeennimi, int saldo) {

        return Isotili += markkinaArvot.get(osakkeennimi) * saldo;

    }
}
