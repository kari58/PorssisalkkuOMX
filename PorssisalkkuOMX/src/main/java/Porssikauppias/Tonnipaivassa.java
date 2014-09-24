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
        JCheckBox kysymys1vastausEi= new JCheckBox("Satanen riittää");
        
        JLabel kysymys3=new JLabel("Ostetaanko tänään Componentaa ?");
       
        JCheckBox kysymys3vastausEI=new JCheckBox("Ei, kyllä annin jälkeen putoaa reilusti");
       JRadioButton kysymys3vastaus1=new JRadioButton("10000 kpl riittää");
        JRadioButton kysymys3vastaus2=new JRadioButton("Ei ,putoaa vielä");
        
        JLabel kysymys2=new JLabel("Miten meni eilen");
        ButtonGroup kysymys2vastaukset=new ButtonGroup();
        JRadioButton kysymys2vastaus1=new JRadioButton("Ketuille");
        JRadioButton kysymys2vastaus2=new JRadioButton("Baissea");
        
        kysymys2vastaukset.add(kysymys2vastaus1);
        kysymys2vastaukset.add(kysymys2vastaus1);
        
        JButton valmis=new JButton("Varma hausse huomenna, Ukrainassa sopu !");
        
        BoxLayout layout=new BoxLayout(container,BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
        container.add(kysymys1);
        container.add(kysymys1vastausKylla);  
        container.add(kysymys1vastausEi);
        container.add(kysymys2);
        container.add(kysymys2vastaus1);
        container.add(kysymys2vastaus2);
        
        container.add(kysymys3);
        
        container.add(kysymys3vastaus1);
        container.add(kysymys3vastaus2);
        container.add(valmis);
    }
        public JFrame getFrame(){
            return frame;
        }
    }
    



