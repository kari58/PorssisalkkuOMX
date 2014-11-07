
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kayttoliittyma;

import PorssisalkkuOMX.Omatili;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Tärkeää olisi saada ohjelman ydin eli osakkeiden myynti ja osto toimimaan
 * käyttöliittymän kautta. , johon voi syöttää osakkeen nimen, jolloin ohjelma
 * kertoo osakkeen hinnan. Tätä varten sovellus.lisaaOsake(osake, ostohinta,
 * saldo, arvo); kerää tiedot osakkeennimestä saldosta
 *
 * @author kromanow
 */
public class OstaKuuntelija implements ActionListener {

    private JTextField syoteTextField;
    private JLabel tulostusLabel;
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
        String osake = nimiKentta.getText();
        double arvo = ostohinta * saldo;

        try {
            saldo = Integer.parseInt(ostoKentta.getText());
        } catch (Exception ex) {
        }
        if (ae.getSource() == this.osta) {
            omatili.lisaaOsake(osake, saldo, ostohinta, arvo);//saldo ja ostohinta vaihdettu paikkkaa

            omatili.osta(nimiKentta.getText(), saldo, ostohinta);
            omatili.getsaldot().put(nimiKentta.getText(), saldo);
            omatili.getostohinnat().put(nimiKentta.getText(),ostohinta);
            System.out.println(ostohinta);
            omatili.getsaldot(); //tämä ei tallennu arraylist
            omattilit.put(nimiKentta.getText(), omatili);

            System.out.println("Ostettu!");  //TÄHÄN PITÄÄ LISÄTÄ OSTETTU 100 KPL HINTAAN A 10EUR 
            JOptionPane.showMessageDialog(null, "ONNISTUI", "OSTO", JOptionPane.ERROR_MESSAGE);

        }

    }
}

/*
 MITÄ V TEKEE OMATTILIT?????,VOISIKO SEN POISTAA JOKAPUOLELTA
 */
