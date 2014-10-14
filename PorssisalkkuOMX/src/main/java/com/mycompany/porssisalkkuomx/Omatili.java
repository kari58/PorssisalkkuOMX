/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.porssisalkkuomx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
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
private Paivamaara ostopaiva;
    private String tunnus;
    private String salasana;

    private double limiittitili;
    private PorssisalkkuOMX porssisalkkuOMX;

    private String osakkeennimi;

    private double VoitotTappiot;

    private int saldo;
    private int PE; //   P/E
    private int F;
    private double ostohinta;
    private double markkinaArvo;

    public Omatili(String tunnus, String salasana) {
        this.tunnus = tunnus;
        this.salasana = salasana;

        this.limiittitili = 1000.0;
        this.saldot = new HashMap<String, Integer>();
        VoitotTappiot = 0;
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
    public ArrayList getOsakkeet(){
        return osakkeet;
    }

    public double myy(String osake, int saldo) {

        Collections.sort(super.osakkeet);

        if (saldot.containsKey(osake)) {
            if (((ostohinnat.get(osakkeennimi) / markkinaArvot.get(osakkeennimi)) == 0.95)
                    && ((ostohinnat.get(osakkeennimi) / markkinaArvot.get(osakkeennimi)) >= 1.1)) {
            } else {
                limiittitili += markkinaArvo * saldo;
            }
        }
        for (Double osake1 : markkinaArvot.values()) {
            for (Double osake2 : ostohinnat.values()) {
                for (Integer osake3 : saldot.values()) {

                    VoitotTappiot += saldo * markkinaArvo - saldo * ostohinta;
                }
            }
        }
        saldot.put(osake, saldo);
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
     * @return
     */
    public double osta(String osake, double ostohinta, int saldo) {
        if ((7 < PE) && (PE < 16) && (F <= 5) && (F >= 2)) {
            return limiittitili -= this.saldo * ostohinta;

        }
        lisaaOsake(osake, (double) ostohinta, saldo, (double) ostohinta);
       
        super.osakkeet.add(new Tapahtumat(osakkeennimi,14,10,2014));
         return limiittitili -= ostohinta * saldo;
    }

    public String toString() {
        System.out.println("Tappiota tuli vuonna 2013" + VoitotTappiot);
        return "" + VoitotTappiot;

    }
}
