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
 *  Tärkeää olisi saada ohjelman ydin eli 
 * osakkeiden myynti ja osto toimimaan käyttöliittymän kautta. 
 * , johon voi syöttää osakkeen nimen, 
 *  jolloin ohjelma kertoo osakkeen hinnan. 
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
       // this.sovellus = new Sovelluslogiikka();

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
             System.out.println("Ostettu!");
         } else if(ae.getSource()==sovellus.myy){
            sovellus.myy(null, arvo2, saldo2);
        }
    }

}


