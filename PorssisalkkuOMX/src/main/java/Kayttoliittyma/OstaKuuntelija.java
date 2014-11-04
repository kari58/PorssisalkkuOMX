
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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *  Tärkeää olisi saada ohjelman ydin eli 
 * osakkeiden myynti ja osto toimimaan käyttöliittymän kautta. 
 * , johon voi syöttää osakkeen nimen, 
 *  jolloin ohjelma kertoo osakkeen hinnan. 
 * Tätä varten sovellus.lisaaOsake(osake, ostohinta, saldo, arvo);
 * kerää tiedot osakkeennimestä saldosta
 * @author kromanow
 */
public class OstaKuuntelija implements ActionListener {

    private JTextField syoteTextField;
    private JLabel tulostusLabel;
    private Omatili omatili; 
    private JButton osta;
  
    private JTextField nimiKentta ;
      JTextField ostoKentta;
     JTextField ostohintaKentta;
   

 
    OstaKuuntelija(JButton osta,JTextField nimiKentta,  JTextField ostoKentta,JTextField ostohintaKentta, Omatili omatili) {
        this.osta=osta;
        this.nimiKentta=nimiKentta;
        this.ostoKentta=ostoKentta;
        this.ostohintaKentta=ostohintaKentta;
          this.omatili = omatili;

    }


    @Override
    public void actionPerformed(ActionEvent ae)  {
       
        double ostohinta=0;
        int saldo;saldo = Integer.parseInt(ostoKentta.getText());
        String osake;osake=nimiKentta.getText();
        double arvo=ostohinta*saldo;
        
    
         try {
            saldo = Integer.parseInt(ostoKentta.getText());
        } catch (Exception ex) {
        }
         if(ae.getSource()==this.osta){
            omatili.lisaaOsake(osake, ostohinta, saldo, arvo);
            
         
            omatili.osta(nimiKentta.getName(), ostohinta,saldo);
            omatili.getsaldot().put(nimiKentta.getName(),saldo);
 omatili.getsaldot(); //tämä ei tallennu arraylist
         //  saldot.jatka huomenna
             System.out.println("Ostettu!");  //TÄHÄN PITÄÄ LISÄTÄ OSTETTU 100 KPL HINTAAN A 10EUR 
             JOptionPane.showMessageDialog(null, "ONNISTUI", "OSTO", JOptionPane.ERROR_MESSAGE);
            
    }

    }
}



    

