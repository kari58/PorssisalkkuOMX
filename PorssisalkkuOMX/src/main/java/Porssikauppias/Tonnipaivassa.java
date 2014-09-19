/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Porssikauppias;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

/**
 *
 * @author kromanow
 */
public class Tonnipaivassa implements Runnable{
    private JFrame frame;

    @Override
    public void run() {
        frame=new JFrame("Ikkuna");
        frame.setPreferredSize(new Dimension (300, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        luoKomponentit(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        JLabel kysymys1=new JLabel("Tonni tänään?");
        JCheckBox kysymys1vastausKylla=new JCheckBox("Tietysti");
        JCheckBox kysymys1vastausEi= new JCheckBox("Ei");
        
        JLabel kysymys2=new JLabel("Miten meni eilen");
        ButtonGroup kysymys2vastaukset=new ButtonGroup();
        JRadioButton kysymys2vastaus1=new JRadioButton("Ketuille");
        JRadioButton kysymys2vastaus2=new JRadioButton("Baissea");
        
        kysymys2vastaukset.add(kysymys2vastaus1);
        kysymys2vastaukset.add(kysymys2vastaus1);
        
        JButton valmis=new JButton("Valmis");
        
        BoxLayout layout=new BoxLayout(container,BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
        container.add(kysymys1);
        container.add(kysymys1vastausKylla);     //jatkuu sivu 2 rivi 44
    }
        public JFrame getFrame(){
            return frame;
        }
    }
    



