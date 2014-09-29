/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.porssisalkkuomx;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author kromanow
 */



/**
 * Kirjaurtumisessa pitää tietää oikea salasana ja tunnus jotta voi päästä käyttämään 
 * Omatili 
 * @param   annetaan parametrina oikea tunnus ja parametri
 * tässä vaiheessa ei tehdä JUNIT testiä
 * @return palauttaa oikean salasanan ja tunnuksen
 * @author kromanow
 */
/**
 * koska salasana ja tunnus on otettu luokasta Omatili, niin ohjelma luokka Kirjautuminen antaa luvan käyttää
 * Omatilia, kun tunnus ja salasana oli oikein
 * @param annataan tunnus ja salasana
 * @return palauttaa tunnuksen ja salasanan
 * @author kromanow
 */
 
public class Kirjautuminen {
    private HashMap<String,Omatili>omattilit;//tunnus on avaimena ja Omatili sisältää salasanan
 
    public void kirjautuminen(){
        Scanner lukija = new Scanner(System.in);
 
        System.out.print("Anna tunnus: ");
        String tunnus = lukija.nextLine();
        if (!omattilit.containsKey(tunnus)){
} else {
            System.out.print("Anna salasana: ");
            String salasana = lukija.nextLine();
            
            if (tunnus.equals(omattilit.get(tunnus).getTunnus() )&& (salasana.equals(omattilit.get(salasana).getSalasana()))){
                
                System.out.println("Olet kirjautunut järjestelmään ja saat käyttää Omatili");
            } else {
                System.out.println("Virheellinen tunnus tai salasana!");
            }
        }
    }

    @Override
    public String toString() {
        return "Kirjautuminen{" + '}';
    }

    public Kirjautuminen() {
        this.omattilit=new HashMap<String,Omatili>();
    }
}


