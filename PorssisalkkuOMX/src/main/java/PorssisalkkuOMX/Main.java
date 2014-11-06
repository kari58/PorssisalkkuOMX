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

* testitesti
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Aloittaa projektin, tässä on mukana muutama kokeilu ohjelman toimimisesta
 *
 * @author kromanow
 * Kirjautuminen onnistuu, mutta ohjelman olisi syytä toimia kokonaan graafisena, 
 * on hämäävää kun osan syötteestä voi antaa graafisen käyttöliittymän kautta 
 * ja osa taas on annettava komentoriviltä.

Osakkeiden ostaminen vaikuttaa toimivalta, ohjelma ei kuitenkaan näytä mitenkään omistuksessa olevia osakkeita. 
* Osakkeiden myynti- ja ostohinnat eivät nyt näy käyttäjälle mitenkään.

Osakkeen myyntitoiminnallisuus toimii sikäli virheellisesti 
* että jos osaa esim. yhden nokian osakkeen, voi sen myydä mielevaltaisen monta kertaa.

Puutteelisen/virheellisen toiminnallisuuden lisäksi ohjelman dokumentaation,
* erityisesti aihemäärittelyn ja käyttöohjeen tulisi olla selkeämpiä.

Matti
 */
public class Main {

    public static void main(String[] args) {
        
      HashMap<String,Omatili>omattilit=new HashMap<String,Omatili>();
        omattilit.put("kari", new Omatili("kari", "ilma"));
        Tonnipaivassa tonni = new Tonnipaivassa(omattilit);

        SwingUtilities.invokeLater(tonni);
       
        

        
            Paivamaara eka = new Paivamaara(24, 9, 2009);
            Paivamaara toka = new Paivamaara(24, 9, 2014);
            Kirjautuminen kirjautuminen=new Kirjautuminen(new Scanner(System.in));
            eka.aiemmin(toka);
            Pankintili pankintili=new Pankintili( 100000);
      
            pankintili.getostohinnat();
            pankintili.getmarkkinaArvot();
            pankintili.getsaldot();
            kirjautuminen.kirjautuminen();
            
           // PorssisalkkuOMX salkku=new PorssisalkkuOMX();
            
           // salkku.ostohinnat.put("Talvivaara",0.05);
           // salkku.osakkeet.add(new Tapahtumat("Talvivaara", 29, 9, 2014));
           // salkku.saldot.put("Talvivaara", 1000);
            
           // salkku.ostohinnat.put("Talvivaara", 0.035);
           // salkku.osakkeet.add(new Tapahtumat("Talvivaara", 30, 9, 2014));
             //salkku.saldot.put("Talvivaara", salkku.saldot.get("Talvivaara") + 30000);
            
            
            
           
           
            
            //salkku.markkinaArvot.put("Talvivaara", 0.07);
            //salkku.osakkeet.add(new Tapahtumat("Talvivaara",31,9,2014));
           
                  //  omatili.myy("Talvivaara", 1000);
            
            //System.out.println(eka + " ja " +  tokana + " ero vuosissa on "+ eka.erotusVuosissa(toka));
           // System.out.println("Ostettiin 30.9 "+salkku.osakkeet);
        }
    }
