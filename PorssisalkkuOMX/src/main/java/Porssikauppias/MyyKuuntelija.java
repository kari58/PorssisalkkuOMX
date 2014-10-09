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
import javax.swing.JTextField;

/**
 *
 * @author kromanow
 */
public class MyyKuuntelija implements ActionListener {
          private JTextField nimiKenttaMyy;
          private JTextField myyntiKentta;
          private JButton myy;
          private Omatili sovellus;
          
        MyyKuuntelija(JButton myy,  JTextField nimiKenttaMyy, JTextField myyntiKentta, Omatili sovellus){
         this.nimiKenttaMyy = nimiKenttaMyy;
        this.myyntiKentta = myyntiKentta;
        this.sovellus = sovellus;
        this.myy=myy;
        this.nimiKenttaMyy=nimiKenttaMyy;
        
    }
        
    @Override
    public void actionPerformed(ActionEvent ae)  {
    double markkinaArvo=0;
    int saldo2;saldo2=0;
    double arvo2=saldo2*markkinaArvo;
        try {
            arvo2 = Integer.parseInt(myyntiKentta.getText());
        } catch (Exception ex) {
        }
        sovellus.myy(nimiKenttaMyy.getName(), (int) arvo2); 
        System.out.println("Myyty !");
    }
        
}
