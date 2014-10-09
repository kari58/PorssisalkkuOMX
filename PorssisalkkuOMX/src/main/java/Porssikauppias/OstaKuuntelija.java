/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Porssikauppias;

import com.mycompany.porssisalkkuomx.Omatili;
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
public class OstaKuuntelija implements ActionListener {

    private JTextField syoteTextField;
    private JLabel tulostusLabel;
    private Omatili sovellus;
    private JButton osta;
  
    private JTextField nimiKentta ;
      JTextField ostoKentta;
   

 
    OstaKuuntelija(JButton osta,JTextField nimiKentta,  JTextField ostoKentta, Omatili sovellus) {
        this.osta=osta;
        this.nimiKentta=nimiKentta;
        this.ostoKentta=ostoKentta;
        this.sovellus = sovellus;

    }


    @Override
    public void actionPerformed(ActionEvent ae)  {
        //tulostusLabel.setText(syoteTextField.getText());
        double ostohinta=0;
        int saldo;saldo = 0;
        double arvo=ostohinta*saldo;
        
      //  double markkinaArvo=0;
     //   int saldo2;saldo2=0;
       // double arvo2=saldo2*markkinaArvo;
         try {
            saldo = Integer.parseInt(ostoKentta.getText());
        } catch (Exception ex) {
        }
         if(ae.getSource()==this.osta){
            sovellus.osta(nimiKentta.getName(), ostohinta,saldo);
             System.out.println("Ostettu!");
        } 
    }

}


