/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kayttoliittyma;

import PorssisalkkuOMX.Kirjautuminen;
import PorssisalkkuOMX.Omatili;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *MITÄ V TEKEE OMATTILIT?????,VOISIKO SEN POISTAA JOKAPUOLELTA
 * @author kromanow@cs
 */
public class SalasanaKuuntelija implements ActionListener{
    private JTextField syoteTextField;
    private JLabel tulostusLabel;
    private Omatili omatili;
    private JButton AnnaTunnusJaSalasana;
    private JTextField tunnusKentta;
            JTextField salasanaKentta;
            private HashMap<String,Omatili>omattilit;
            
            public SalasanaKuuntelija(JTextField syoteTextField,JLabel tulostusLabel,Omatili omatili,JButton AnnaTunnusJaSalasana,JTextField tunnusKentta,
                    JTextField salasanaKentta,HashMap<String,Omatili>omattilit){
                this.syoteTextField=syoteTextField;
                this.tulostusLabel=tulostusLabel;
                this.omatili=omatili;
                this.AnnaTunnusJaSalasana=AnnaTunnusJaSalasana;
                this.tunnusKentta=tunnusKentta;
                this.salasanaKentta=salasanaKentta;
                this.omattilit=omattilit;
            }
    @Override
    public void actionPerformed(ActionEvent e) {
       
        
 
        
        String tunnus = tunnusKentta.getText();
        if (!omattilit.containsKey(tunnus)){
             JOptionPane.showMessageDialog(null, "VÄÄRÄ", "TUNNUStaiSALASANA", JOptionPane.ERROR_MESSAGE);
} else {
            System.out.print("Anna salasana: ");
            String salasana = salasanaKentta.getText();
            
            if (tunnus.equals(omattilit.get(tunnus).getTunnus() )&& (salasana.equals(omattilit.get(tunnus).getSalasana()))){
                JOptionPane.showMessageDialog(null, "Olet kirjautunut järjestelmään", "Saat käyttää omatiliä", JOptionPane.ERROR_MESSAGE);
               
            } else {
                 JOptionPane.showMessageDialog(null, "VÄÄRÄ", "TUNNUStaiSALASANA", JOptionPane.ERROR_MESSAGE);
                
            }
        }
    }
    }
    

