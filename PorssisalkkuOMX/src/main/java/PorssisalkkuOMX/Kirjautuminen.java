/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PorssisalkkuOMX;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author kromanow
 */
/**
 * Kirjaurtumisessa pitää tietää oikea salasana ja tunnus jotta voi päästä
 * käyttämään Omatili
 *
 * @param annetaan parametrina oikea tunnus ja parametri tässä vaiheessa ei
 * tehdä JUNIT testiä
 * @return palauttaa oikean salasanan ja tunnuksen
 * @author kromanow
 */
/**
 * koska salasana ja tunnus on otettu luokasta Omatili, niin ohjelma luokka
 * Kirjautuminen antaa luvan käyttää Omatilia, kun tunnus ja salasana oli oikein
 *
 * @param annataan tunnus ja salasana
 * @return palauttaa tunnuksen ja salasanan //tunnus on avaimena ja Omatili
 * sisältää salasanan
 * @author kromanow
 */
public class Kirjautuminen {

    HashMap<String, Omatili> omattilit;
    Scanner lukija;

    public Kirjautuminen(String tunnus, String salasana) {
    }

    @Override
    public String toString() {
        return "Kirjautuminen";
    }

    /**
     * Asetetaan salasana=kari ja tunnus =ilma
     *
     * @param lukija
     */
    public Kirjautuminen(Scanner lukija) {
        this.omattilit = new HashMap<String, Omatili>();
        omattilit.put("kari", new Omatili("kari", "ilma"));
        this.lukija = lukija;

    }
}
