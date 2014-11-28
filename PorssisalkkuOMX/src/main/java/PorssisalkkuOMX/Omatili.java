/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PorssisalkkuOMX;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * protected HashMap<String, Integer> saldot; protected HashMap<String,
 * ArrayList<Integer>> samaaOstettuUseammin; KORVAA SALDOT
 *
 *
 *
 * Tässä ostetaan sakkeita ja myydään niitä FIFO-periaatteella Ostoista ja
 * myyneistä metodien kohdalla javadoc -kuvaukset FIFO:n ymmärtää parhaiten
 * :osto 9 eur 1' kpl, toinen osto samaa sarjaa 7 eur 1' kpl ja markkinaArvon
 * ollessa 8 eur ja halutessa/joutuessa myymään 1' kpl , tappiota tulee 8-9=
 * -1000 eur, siis ei voi myydä 8-7=+1000 1' kpl myynnissä, jos myy 2' kpl
 * voitto=0 eur Ennakkokäsitysten murtamiseen kaupankäyntiä voi alkaa
 * pienelläkin panoksella, siksi limiittitili eli omatilissä on rahaa 1000
 * euroa. Oikeassa kaupankäynnissä ohjelma tarkistaa että limiittitillä on rahaa
 * oston verran
 *
 * @author kromanow
 */
public class Omatili extends PorssisalkkuOMX {

    
    private String tunnus;
    private String salasana;
    private double limiittitili;
 
  

    public Omatili(String tunnus, String salasana) {
        this.tunnus = tunnus;
        this.salasana = salasana;
        this.limiittitili = limiittitili;
        this.saldot = new HashMap<String, Integer>();

    }

    public Omatili() {
        this.limiittitili = limiittitili;
    }

    /**
     *
     * myydään osake, kun se on vanhin ostosarjasta, jos osakkeen hinta putoaa
     * ostohinnasta 5% tai kurssi nousee ostohinnasta 10% lopussa tillee tulee
     * myynnin arvo, provisiota tai veroa ei huomioida tässä
     *
     */
    public double getLimiittitili() {
        return limiittitili;
    }

    public String getTunnus() {
        return tunnus;
    }

    public String setTunnus() {
        return tunnus;
    }

    public String getSalasana() {
        return salasana;
    }

    public String setSalasana() {
        return salasana;
    }

    public ArrayList getOsakkeet() {
        return osakkeet;
    }

    public double myy(String osake, int saldo, double markkinaArvo) {

        Collections.sort(super.osakkeet);

        if (saldot.containsKey(osake)) {

            limiittitili += markkinaArvo * saldo;

        }

        vahennaOsake(osake, saldo, (double) markkinaArvo);
        System.out.println("osake: " + osake);
        for (Tapahtumat osakkeet1 : new ArrayList<>(super.osakkeet)) {
            System.out.println(osakkeet1.getOsakkeennimi());
            System.out.println(osake);
            if (osakkeet1.getOsakkeennimi().equals(osake)) {
                super.osakkeet.remove(osakkeet1);
            }
        }
        markkinaArvot.put(osake, markkinaArvo);

        return limiittitili;

    }

    /**
     * ostetaan osakeita kun sen kurssin P/E -luku on välillä 7 ja 16 F
     * määritellään myöhemmin, kuitenkin syklisiä osakkeita ostetaan käyrän
     * minimissä ja sama periaate muutenkin muissa ostoissa,keskitytään
     * ainoastaan osinkoa maksaviin.Päälistan osuus >70%, small capin alle 10%
     * Ostoja tehdään kunkin osakkeen kohdalla aikaerissä esim kuukauden
     * välein,Kuitenkin sopivassa kriisissä ostoja voi tehdä reilumminostossa
     * limiittililtä lähetetään rahaa välittäjälle
     *
     * @param osake F on manuaalisesti määritelty desimaaliluku, jota nostaa
     * esim sopiva P/E luku, tulevaisuuden näkymät analyytikkojen suositukset,
     * kuitenkin jos on huumassa noussut kurssi noudatetaan varovaisuutta,
     * jolloin F saattaa saada arvoja >5;
     * @param saldo
     * @return   999
     */
    public double osta(String osake, int saldo, double ostohinta) {

        lisaaOsake(osake, saldo, (double) ostohinta, (double) ostohinta);//ostohinta ostohinta tuplana ÅÅÅÅÅÅÅÅ, poisto rikkooo graafista
        saldot.put(osake, saldot.get(osake) + saldo);
        super.osakkeet.add(new Tapahtumat(osake, 14, 10, 2014));

        return limiittitili -= ostohinta * saldo;
        
        // omatili.getsaldot().put(nimiKentta.getText(), saldo);/
    }

}
