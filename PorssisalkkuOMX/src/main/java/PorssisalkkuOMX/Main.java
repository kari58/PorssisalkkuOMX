package PorssisalkkuOMX;

import Kayttoliittyma.Tonnipaivassa;
import Kayttoliittyma.OstaKuuntelija;
import PorssisalkkuOMX.Kirjautuminen;
import PorssisalkkuOMX.Paivamaara;
import PorssisalkkuOMX.Pankintili;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.SwingUtilities;
/*
 Projektista löytyy paljon turhaa koodia ja moni asia on tehty monimutkaisemmin kuin on tarve. 
 Ohjelma kuitenkin toimii ainakin pinnallisella tasolla ja käyttöliittymä on jossain määrin saatu integroitua ohjelmalogiikkaan. 
 Testien tekeminen vaikuttaisi olevan hieman haastavaa, 
 todennäköisesti osittain johtuen siitä syystä että itse ohjelmakoodi on paikoittain hyvinkin sekavaa
 eikä näin ole helppoa saada syvällistä ymmärrystä siitä, miten ohjelma oikeastaan toimii.
 Suosittelisin vahvasti että projektin tekemisen ohella kertaisit perusasioita 
 ja etenkin sitä miten ohjelmasi eri osa-alueet toimivat keskenään.
 Oman ohjelman koodaus perustuu hyvin vahvasti soveltamiseen, joka vaatii syvää ymmärrystä perusasioista. Mikäli mahdollista,
 github -repositorion siivoaminen olisi myös aiheellistä, joskaan ei tärkeysjärjestyksessä ensimmäisenä.

 */

/*

 * testitesti
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// * @author kromanow
// * Kirjautuminen onnistuu, mutta ohjelman olisi syytä toimia kokonaan graafisena, 
// * on hämäävää kun osan syötteestä voi antaa graafisen käyttöliittymän kautta 
// * ja osa taas on annettava komentoriviltä.
//
//Osakkeiden ostaminen vaikuttaa toimivalta, ohjelma ei kuitenkaan näytä mitenkään omistuksessa olevia osakkeita. 
//* Osakkeiden myynti- ja ostohinnat eivät nyt näy käyttäjälle mitenkään.
//
//Osakkeen myyntitoiminnallisuus toimii sikäli virheellisesti 
//* että jos osaa esim. yhden nokian osakkeen, voi sen myydä mielevaltaisen monta kertaa.
//
//Puutteelisen/virheellisen toiminnallisuuden lisäksi ohjelman dokumentaation,
//* erityisesti aihemäärittelyn ja käyttöohjeen tulisi olla selkeämpiä.
//
//Matti
// */
public class Main {

    public static void main(String[] args) {

        HashMap<String, Omatili> omattilit = new HashMap<String, Omatili>();
        omattilit.put("kari", new Omatili("kari", "ilma"));
        Tonnipaivassa tonni = new Tonnipaivassa(omattilit);

        SwingUtilities.invokeLater(tonni);

    }
}
