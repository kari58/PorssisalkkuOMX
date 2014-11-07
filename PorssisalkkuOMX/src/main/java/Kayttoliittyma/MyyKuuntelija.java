/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kayttoliittyma;

import PorssisalkkuOMX.Omatili;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Olethan huomioinut tunnus salasana=ilma ja tunnus=kari muuten ei toimi
 *
 * testti testi MyyKuuntelija myydään osakkeita, joita PorsisalkkuOMX sisältää,
 * et voi myydä enempää kuin sinulla on. Jos et omista Lemminkäistä, et sitä
 * myöskään voi myydä
 *
 * @author kromanow
 */
public class MyyKuuntelija implements ActionListener {

    private JTextField nimiKenttaMyy;
    private JTextField myyntiKentta;
    private JTextField hintaKentta;

    private JButton myy;
    private Omatili omatili;

    MyyKuuntelija(JButton myy, JTextField nimiKenttaMyy, JTextField myyntiKentta, JTextField hintaKentta, Omatili sovellus) {
        this.nimiKenttaMyy = nimiKenttaMyy;
        this.myyntiKentta = myyntiKentta;
        this.omatili = sovellus;
        this.myy = myy;
        this.nimiKenttaMyy = nimiKenttaMyy;
        this.hintaKentta = hintaKentta;

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        double myyntihinta = Double.parseDouble(hintaKentta.getText());
        int kappaleMaara = Integer.parseInt(myyntiKentta.getText());
        double arvo = kappaleMaara;// tässä pitäisi olla saldo eli kpl  ei myynnin bruttoarvoa
        try {
            arvo = Integer.parseInt(myyntiKentta.getText());
        } catch (Exception ex) {
        }
        if (!omatili.getsaldot().containsKey(this.nimiKenttaMyy.getText())) {
            // System.out.println("Et voi myydä, et omista  yhtään  näitä");
            JOptionPane.showMessageDialog(null, "Ett omista yhtään näitä", "Et voi myydä", JOptionPane.ERROR_MESSAGE);
        } else {
            if (omatili.getsaldot().get(nimiKenttaMyy.getText()) >= Integer.parseInt(myyntiKentta.getText())) {

                String osake = nimiKenttaMyy.getText();
                omatili.myy(osake, kappaleMaara);

                if (omatili.getMyydytOsakkeet().containsKey(osake)) {
                    kappaleMaara += omatili.getMyydytOsakkeet().get(osake);
                }

                omatili.getMyydytOsakkeet().put(osake, kappaleMaara);

           // saldot.put(osake,saldot.get(osake)- saldo);
//            sovellus.vahennaOsake(nimiKenttaMyy.getText(), saldo2, markkinaArvo);
                //TÄHÄN PITÄÄ SAADA sovellus.getsaldot().get(nimiKenttaMyy.getText())-sovellus.myy(nimiKenttaMyy.getName(), (int) arvo2);
                System.out.println("Myyty !");//tähän pitää saada hinta
            } else {
//                if(sovellus.getsaldot().get(nimiKenttaMyy.getText())<Integer.parseInt(myyntiKentta.getText()))
                JOptionPane.showMessageDialog(null, "Et voi myydä", "Et omista noin paljon !", JOptionPane.ERROR_MESSAGE);
            }
          //  else{
            //  JOptionPane.showMessageDialog(null, "Et omista noin monta tarkista määräsi", "Et voi myydä", JOptionPane.ERROR_MESSAGE); 
            //  System.out.println("Et voi myydä");//tässä yritetään myydä enemmän kuin on
        }
    }
}
