package com.mycompany.porssisalkkuomx;


import Porssikauppias.Tonnipaivassa;
import Porssikauppias.ViestinKuuntelija;
import com.mycompany.porssisalkkuomx.Kirjautuminen;
import com.mycompany.porssisalkkuomx.Paivamaara;
import com.mycompany.porssisalkkuomx.Pankintili;
import java.util.Scanner;
import javax.swing.SwingUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kromanow
 */
public class Main {

    public static void main(String[] args) {
        Tonnipaivassa tonni = new Tonnipaivassa();

        SwingUtilities.invokeLater(tonni);
        
       // SwingUtilities.invokeLater(new ViestinKuuntelija());

        
            Paivamaara eka = new Paivamaara(24, 9, 2009);
            Paivamaara toka = new Paivamaara(24, 9, 2014);
            Kirjautuminen kirjautuminen=new Kirjautuminen(new Scanner(System.in));
            eka.aiemmin(toka);
            Pankintili pankintili=new Pankintili( 100000);
            //pankintili.myy();
            pankintili.getostohinnat();
            pankintili.getmarkkinaArvot();
            pankintili.getsaldot();
            kirjautuminen.kirjautuminen();
            
            PorssisalkkuOMX salkku=new PorssisalkkuOMX();
            Omatili omatili=new Omatili("String tunnus","String salasana");
            
            salkku.ostohinnat.put("Talvivaara",0.05);
            salkku.osakkeet.add(new Tapahtumat("Talvivaara", 29, 9, 2014));
            salkku.saldot.put("Talvivaara", 1000);
            
            salkku.ostohinnat.put("Talvivaara", 0.035);
            salkku.osakkeet.add(new Tapahtumat("Talvivaara", 30, 9, 2014));
             salkku.saldot.put("Talvivaara", salkku.saldot.get("Talvivaara") + 30000);
            
            
            
           
           
            
            salkku.markkinaArvot.put("Talvivaara", 0.07);
            salkku.osakkeet.add(new Tapahtumat("Talvivaara",31,9,2014));
           
                    omatili.myy("Talvivaara", 1000);// tässä pitää olla FIFO eli 29.9 ostettuja
            
            System.out.println(eka + " ja" + toka + " ero vuosissa on "+ eka.erotusVuosissa(toka));
            System.out.println("Ostettiin 30.9"+salkku.osakkeet);
        }
    }
