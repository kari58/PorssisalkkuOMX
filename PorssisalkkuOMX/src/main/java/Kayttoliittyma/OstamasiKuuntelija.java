/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kayttoliittyma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author kromanow@cs
 */
public class OstamasiKuuntelija implements ActionListener {
    private JButton ostamasiNappi;
    private JLabel nimi;
    private Tonnipaivassa tonnipaivassa;

    public OstamasiKuuntelija(JButton ostamasiNappi, JLabel nimi,Tonnipaivassa tonnipaivassa) {
        this.ostamasiNappi=ostamasiNappi;
        this.nimi=nimi;
        this.tonnipaivassa=tonnipaivassa;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tonnipaivassa.lisaaOstamasiOsakkeet();
        
       
    }
    
}
