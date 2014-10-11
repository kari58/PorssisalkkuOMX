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
       
        double ostohinta=0;
        int saldo;saldo = 0;
        double arvo=ostohinta*saldo;
        
    
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

/*
KUNNOSTETAAN TALLETUS THIS.SALDOT.PUT("upm",100)
ArrayList<Tapahtumat>osakkeet =new ArrayList<Tapahtumat>();
 public void lisaaOsake(String osake, double ostohinta, int saldo,double markkinaArvo) {
        this.ostohinnat.put(osake, ostohinta);
        this.saldot.put(osake, saldo);
        this.markkinaArvot.put(osake, markkinaArvo);
Testailin ohjelmaa hieman, ja huomasin, että olemattomiakin osakkeita voi myydä (ts. osakkeita, 
joita ei ole käyttöliittymän kautta ostettu). Myös ostettuja osakkeita voi myydä enemmän kuin niitä on olemassa.
Ohjelman olisi hyvä ilmoittaa, mikäli olematonta osaketta yritetään myydä, 
tai sitä yritetään myydä enemmän kuin sitä omistetaan. 
Käyttöliittymässä voitaisiin myöskin näyttää Omatilin saldo ja osakkeet.
*/

    

