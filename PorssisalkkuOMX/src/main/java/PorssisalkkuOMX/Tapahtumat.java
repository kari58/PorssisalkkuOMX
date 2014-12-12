package PorssisalkkuOMX;

import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Koko luokka toimii ainoastaan FIFO-myyntiä varten
 * jossa siis myydään vanhin osake ensin.
 * Ostop'ivat ja ostoajat tallennetaan
 *
 * @author kromanow
 */
public class Tapahtumat implements Comparable<Tapahtumat> {

    private String osakkeennimi;
    private Paivamaara ostopaiva;

    public Tapahtumat(String osakkeennimi, int paiva, int kuukausi, int vuosi) {
        this.osakkeennimi = osakkeennimi;
        this.ostopaiva = new Paivamaara(paiva, kuukausi, vuosi);
    }

    public Tapahtumat(String osakkeennimi) {
        this.osakkeennimi = osakkeennimi;

        Calendar nyt = Calendar.getInstance();
        int vuosi = nyt.get(Calendar.YEAR);
        int kuukausi = nyt.get(Calendar.MONTH);
        int paiva = nyt.get(Calendar.DATE);
        this.ostopaiva = new Paivamaara(paiva, kuukausi, vuosi);

    }

    public int vanhinosake() {
        Calendar nyt = Calendar.getInstance();
        int vuosi = nyt.get(Calendar.YEAR);
        int kuukausi = nyt.get(Calendar.MONTH);
        int paiva = nyt.get(Calendar.DATE);
        /**
         * FIFO-säännön mukaan myydessä vanhin osake pitää myydä ekana
         */
        Paivamaara tamaPaiva = new Paivamaara(paiva, kuukausi, vuosi);

        return ostopaiva.erotusVuosissa(tamaPaiva);

    }
/**
 * Kuten metodin nimestä voi päätellä, se ilmoittaa kahdesta päivämäärästä vanhimman
 * @param verrattava
 * @return 
 */
    public boolean vanhempiKuin(Tapahtumat verrattava) {
        return this.ostopaiva.aiemmin(verrattava.ostopaiva);
    }

    public String getOsakkeennimi() {
        return this.osakkeennimi;
    }

    public String toString() {
        return this.osakkeennimi;
    }

    /**
     * palauttaa kok.lukuna, joka on määritelty Paivamaara luokassa
     *
     * @param o=koskee compareTo, joka toimii vain EInegatiivisilla kokluvuilla
     * @return
     */
    @Override
    public int compareTo(Tapahtumat o) {
        return this.ostopaiva.palautakokolukuna() - o.ostopaiva.palautakokolukuna();

    }
}
