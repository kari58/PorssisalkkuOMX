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
     this.hintaKentta = hintaKentta;

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        double markkinaArvo = Double.parseDouble(hintaKentta.getText());
        int kappaleMaara = Integer.parseInt(myyntiKentta.getText());
        double arvo = kappaleMaara;
        try {
            arvo = Integer.parseInt(myyntiKentta.getText());
        } catch (Exception ex) {
        }
        if (!omatili.getsaldot().containsKey(this.nimiKenttaMyy.getText())) {

            JOptionPane.showMessageDialog(null, "Ett omista yhtään näitä", "Et voi myydä", JOptionPane.ERROR_MESSAGE);
        } else {
            if (omatili.getsaldot().get(nimiKenttaMyy.getText()) >= Integer.parseInt(myyntiKentta.getText())) {

                String osake = nimiKenttaMyy.getText();
                omatili.myy(osake, kappaleMaara,markkinaArvo);
//omatili.myy(osake,kappaleMaara,markkinaHinnat)    OMATILI  ei sisällä markkinaArvo myy metodiussa
                //  public double myy(String osake, int saldo) {
                // double markkinaArvo = markkinaArvot.get(osake);
              //  omatili.getmarkkinaArvot().put(hintaKentta.getText(),markkinaArvot);
                if (omatili.getMyydytOsakkeet().containsKey(osake)) {
                    kappaleMaara += omatili.getMyydytOsakkeet().get(osake);
                }

                omatili.getMyydytOsakkeet().put(osake, kappaleMaara);
                JOptionPane.showMessageDialog(null, "ONNISTUI", "MYYNTI", JOptionPane.ERROR_MESSAGE);

            } else {

                JOptionPane.showMessageDialog(null, "Et voi myydä", "Et omista noin paljon !", JOptionPane.ERROR_MESSAGE);
            }

        }
    }
}
/*
omatili.lisaaOsake(osake, saldo, ostohinta, arvo);

            omatili.osta(nimiKentta.getText(), saldo, ostohinta);
     omatili.osta(nimiKentta.getText(), saldo, ostohinta);
            omatili.getsaldot().put(nimiKentta.getText(), saldo);
            omatili.getostohinnat().put(nimiKentta.getText(),ostohinta);
           
            omatili.getsaldot();
            omattilit.put(nimiKentta.getText(), omatili);
*/