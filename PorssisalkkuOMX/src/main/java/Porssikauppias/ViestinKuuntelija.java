/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Porssikauppias;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author kromanow
 */
public class  ViestinKuuntelija implements ActionListener{
            private JTextField syoteTextField;
            private JLabel tulostusLabel;
            
            ViestinKuuntelija(JTextField syoteTextField,JLabel tulostusLabel){
                this.syoteTextField=syoteTextField;
                this.tulostusLabel=tulostusLabel;
                
                
                
            }

    ViestinKuuntelija() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
             

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
