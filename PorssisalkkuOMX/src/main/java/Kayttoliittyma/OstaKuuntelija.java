
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kayttoliittyma;

import PorssisalkkuOMX.Omatili;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 KORVAA  aloitettu 21.11 korvaamaan saldot
 * 
 *   protected HashMap<String, Integer> saldot;
   protected HashMap<String, ArrayList<Integer>> samaaOstettuUseammin;
   * UPM 22 kpl 10 eur ,UPM 300 kpl , 11 eur   näin pitää mennä eli omatiliin myös ostohinnat ja porssisalkkuOMX MYÖS
 *ÄLÄ KORVAA LIIAN USEIN ETTEI TILT
 * @author kromanow
 */
public class OstaKuuntelija implements ActionListener {

   
  
    private Omatili omatili;
    private JButton osta;

    private JTextField nimiKentta;
    JTextField ostoKentta;
    JTextField ostohintaKentta;
    private HashMap<String, Omatili> omattilit;
 

    OstaKuuntelija(JButton osta, JTextField nimiKentta, JTextField ostoKentta, JTextField ostohintaKentta,
            Omatili omatili, HashMap<String, Omatili> omattilit) {
        this.osta = osta;
        this.nimiKentta = nimiKentta;
        this.ostoKentta = ostoKentta;
        this.ostohintaKentta = ostohintaKentta;
        this.omatili = omatili;
        this.omattilit = omattilit;

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        double ostohinta = Double.parseDouble(ostohintaKentta.getText());
        int saldo = Integer.parseInt(ostoKentta.getText());
     

        try {
            saldo = Integer.parseInt(ostoKentta.getText());
        } catch (Exception ex) {
        }
        if (ae.getSource() == this.osta) {

            omatili.osta(nimiKentta.getText(), saldo, ostohinta);
           omatili.getsaldot().put(nimiKentta.getText(), saldo);//HALOOOOOO
            omatili.getostohinnat().put(nimiKentta.getText(),ostohinta);
      
          
         

             
            JOptionPane.showMessageDialog(null, "ONNISTUI", "OSTO", JOptionPane.ERROR_MESSAGE);

        }

    }
}
/*
public void actionPerformed(ActionEvent ae) {
        int arvo = 0;
 
        try {
            arvo = Integer.parseInt(syotekentta.getText());
        } catch (Exception e) {
        }
 
        if (ae.getSource() == plus) {
            sovellus.plus(arvo);
        } else if (ae.getSource() == miinus) {
            sovellus.miinus(arvo);
        } else {
            sovellus.nollaa();
        }
        int laskunTulos = sovellus.tulos();
         
        syotekentta.setText("");
        tuloskentta.setText("" + laskunTulos);
        if ( laskunTulos==0) {
            nollaa.setEnabled(false);
        } else {
            nollaa.setEnabled(true);
        }
    }
 
}
*/

/*
huomio olen kopioinut 148 laskin systeemin ja siinä graafisessa AIKA PALJON TAPAHTUMIA 

Käyttöliittymän koodista selkeyden vuoksi olisi hyvä saada kaikki logiikka eroteltua logiikka luokkiin
esim. PorssisalkkuOMX tai Omatili. 
Tällä hetkellä esim. OstaKuuntelija-luokan metodissa actionPerformed tehdään kutsu 
omatili.getsaldot().put(nimiKentta.getText(), saldo);, joka tulisi toteuttaa logiikan puolella käyttöliittymän sijaan. 
Käyttöliittymän tulisi vain kertoa logiikalle minkä osakkeen saldoa korotetaan ja kuinka paljon. 
Tällä hetkellä joitakin toimintoja tehdäänkin sekä logiikan että käyttöliittymän puolella niin osa toiminnoista tuplaantuu. 
Tämän saa karsittua siirtämällä kaiken ohjelmalogiikan toiminnot logiikan puolelle.
*/