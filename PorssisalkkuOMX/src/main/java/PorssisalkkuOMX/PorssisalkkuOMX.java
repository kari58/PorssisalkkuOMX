                 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PorssisalkkuOMX;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Objects;

/**
 * KORVAA tutki erityisesti TORSTAINA SALDOT GRAAFISESSSA JA POISTA VAIHE
 * VAIHEELTA protected HashMap<String, Integer> saldot; protected
 * HashMap<String, ArrayList<Integer>> samaaOstettuUseammin;
 *
 * MYYDYT SAMA HOMMA Luokka toimii arkistona ostohinnoille
 * ,paivamaarille,tapahtumille, ja saldoille
 *
 * @author kromanow
 */
public class PorssisalkkuOMX {

    protected HashMap<String, Double> ostohinnat;
    protected HashMap<String, Integer> saldot;

    protected HashMap<String, Double> markkinaArvot;
    protected HashMap<String, Integer> myydytOsakkeet;
   
   
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        final PorssisalkkuOMX other = (PorssisalkkuOMX) obj;

        if (!Objects.equals(this.ostohinnat, other.ostohinnat)) {
            return false;
        }
        if (!Objects.equals(this.saldot, other.saldot)) {
            return false;
        }
        if (!Objects.equals(this.markkinaArvot, other.markkinaArvot)) {
            return false;
        }
        return true;
    }

    ArrayList<Tapahtumat> osakkeet = new ArrayList<>();

    /**
     * arralist osakkeet käytetään FIFO:ssa vanhimman osakkeen myynnissä
     */
    public PorssisalkkuOMX() {
        this.ostohinnat = new HashMap<>();
        this.saldot = new HashMap<>();
        this.markkinaArvot = new HashMap<>();
        this.myydytOsakkeet = new HashMap<>();

    }

    public HashMap<String, Integer> getMyydytOsakkeet() {
        return myydytOsakkeet;
    }

    /**
     * ostohinta kuvaa osakkeen hinnan ostossa, saldot oston määrän saldot
     * salkussa markkinahinta on tämän päivän kurssi ja sitä käytetään myyntiä
     * arvioitaessa ostohetken kurssi on tietysti myyjälle markkinahinta
     *
     * @return
     */
    public HashMap<String, Double> getostohinnat() {
        return ostohinnat;
    }

    public HashMap<String, Integer> getsaldot() {
        return saldot;
    }

    public HashMap<String, Double> getmarkkinaArvot() {
        return markkinaArvot;
    }

    /**
     * ostossa kuhunkin sarakkeeseen lisätäään ostohinta ja määrä markkina-arvot
     * myyntiä tehtäessä LISÄÄ OSAKE MARKKINAARVOT JA OSTOHINNAT VAATII SIIS 4
     * PARAMETRIA VOISI EHKÄ MARKKINA-ARVON YHDISTÄÄ MYYNTIHINTAAN, ei onnisti
     * koska rakenne rikkoutuu muualla graafisesasa
     *
     * @param osake= tietyn osakkeen nimi
     * @param ostohinta=ostohetkellä maksettu hinta
     * @param saldo =kaikkien tietyn osakkeen lukumäärä
     * @param markkinaArvo =porssin määrittämä sen hetkinen kurssi osakkeelle
     */
    public void lisaaOsake(String osake, int saldo, double ostohinta, double markkinaArvo) {
        this.ostohinnat.put(osake, ostohinta);
        if (this.saldot.containsKey(osake)) {
            saldo += saldot.get(osake);
        }
        this.saldot.put(osake, saldo);
        this.markkinaArvot.put(osake, markkinaArvo);
        
    }

    public void vahennaOsake(String osake, int saldo, double markkinaArvo) {

        this.saldot.put(osake, saldot.get(osake) - saldo);
        this.markkinaArvot.put(osake, markkinaArvo);

        if (this.getMyydytOsakkeet().containsKey(osake)) {
            saldo += this.getMyydytOsakkeet().get(osake);
        }

        this.myydytOsakkeet.put(osake, saldo);

    }

}
