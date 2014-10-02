/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Porssikauppias;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author kromanow
 */
public class ViestinKuuntelija implements ActionListener {

    private JTextField syoteTextField;
    private JLabel tulostusLabel;
    private Sovelluslogiikka sovellus;
    private JButton osta;
    private JButton myy;

    ViestinKuuntelija(JTextField syoteTextField, JLabel tulostusLabel, Sovelluslogiikka sovellus,JButton osta,JButton myy) {
        this.syoteTextField = syoteTextField;
        this.tulostusLabel = tulostusLabel;
        this.osta=osta;
        this.myy=myy;
        //this.sovellus = new Sovelluslogiikka();

    }

    ViestinKuuntelija() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent ae)  {
        //tulostusLabel.setText(syoteTextField.getText());
        double ostohinta=0;
        int saldo;saldo = 0;
        double arvo=ostohinta*saldo;
        
        double markkinaArvo=0;
        int saldo2;saldo2=0;
        double arvo2=saldo2*markkinaArvo;
         try {
            arvo = Integer.parseInt(syoteTextField.getText());
        } catch (Exception ex) {
        }
         if(ae.getSource()==sovellus.osta){
             sovellus.osta(null, ostohinta, saldo2);
         } else if(ae.getSource()==sovellus.myy){
             sovellus.myy(null, arvo2, saldo2);
         }
    }

}

/*
 @Override
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
*/
