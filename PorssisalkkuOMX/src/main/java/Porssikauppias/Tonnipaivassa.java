/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Porssikauppias;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
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
        JLabel kysymys1=new JLabel("Anna tunnus ja salasana?");  //kun nämä ovat oikein , voit ostaa ja myydä
        JRadioButton kysymys1vastausKylla=new JRadioButton("Tunnus ja salasana oli oikein ");
        JRadioButton kysymys1vastausEi= new JRadioButton("Yritä uudelleen");
        
        JLabel kysymys3=new JLabel("Mitä myydään tänään ?");
       
        JRadioButton kysymys3vastausEI=new JRadioButton("Componentaa");//tämä ei näy missää?EI NÄY
        
       JRadioButton kysymys3vastaus1=new JRadioButton("Componentaa 1000 kpl ");
        JRadioButton kysymys3vastaus2=new JRadioButton("Ei ,nousee vielä");
        
        
        JLabel kysymys2=new JLabel("Mitä ostetaan tänään");
        ButtonGroup kysymys2vastaukset=new ButtonGroup();
        JRadioButton kysymys2vastaus1=new JRadioButton("Talvivaaraa 100000 kpl");
        JRadioButton kysymys2vastaus2=new JRadioButton("Ei mitään");
        
        
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
        
        kysymys1vastausKylla.addActionListener(new ViestinKuuntelija());//jatka tästtä kysy1 vastaEI
        container.add(kysymys1vastausKylla);
        kysymys1vastausEi.addActionListener(new ViestinKuuntelija());
        container.add(kysymys1vastausEi);
        
        kysymys2vastaus1.addActionListener(new ViestinKuuntelija());
        container.add(kysymys2vastaus1);
        kysymys2vastaus2.addActionListener(new ViestinKuuntelija());
        container.add(kysymys2vastaus2);
        
        kysymys3vastaus1.addActionListener(new ViestinKuuntelija());
        container.add(kysymys3vastaus1);
        kysymys3vastaus2.addActionListener(new ViestinKuuntelija());
        container.add(kysymys3vastaus2);
        
        
    }
        public JFrame getFrame(){
            return frame;
        }
         

        }
  
    



