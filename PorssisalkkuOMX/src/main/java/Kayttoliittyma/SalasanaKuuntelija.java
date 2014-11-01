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
import javax.swing.JTextField;

/**
 *
 * @author kromanow@cs
 */
public class SalasanaKuuntelija implements ActionListener{
    private JTextField syoteTextField;
    private JLabel tulostusLabel;
    private Omatili omatili;
    private JButton AnnaTunnusJaSalasana;
    private JTextField tunnusKentta;
            JTextField salasanaKentta;
            public SalasanaKuuntelija(JTextField syoteTextField,JLabel tulostusLabel,Omatili omatili,JButton AnnaTunnusJaSalasana,JTextField tunnusKentta,JTextField salasanaKentta){
                this.syoteTextField=syoteTextField;
                this.tulostusLabel=tulostusLabel;
                this.omatili=omatili;
                this.AnnaTunnusJaSalasana=AnnaTunnusJaSalasana;
                this.tunnusKentta=tunnusKentta;
                this.salasanaKentta=salasanaKentta;
                
            }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
/*
 private String tunnus;
    private String salasana;
    Omatili omatili = new Omatili(tunnus, salasana);


    }

*/