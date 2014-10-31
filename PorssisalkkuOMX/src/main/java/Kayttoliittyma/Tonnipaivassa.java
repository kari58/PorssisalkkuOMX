/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kayttoliittyma;

import PorssisalkkuOMX.Omatili;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
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
 * Ainoastaan luoKomponentit2 sisältää toimintaa, luoKomponentit sisältää vain
 * visuaalista ja hauskaaa kaupankäyntiä
 *
 * @author kromanow
 */
public class Tonnipaivassa implements Runnable {

    private String tunnus;
    private String salasana;
    Omatili omatili = new Omatili(tunnus, salasana);

    private JFrame frame;

    @Override
    public void run() {
        System.out.println("Tonnipaivassa");
        frame = new JFrame("Ikkuna");
        frame.setPreferredSize(new Dimension(300, 500));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit2(frame.getContentPane());
        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    public void lisaaOstamasiOsakkeet() {
        System.out.println("lisaaOstamasiOsakkeet -metodia kutsuttu");
        for (int i = 0; i < omatili.getOsakkeet().size(); i++) {
// tähän pitää lisätä ostot 31.10 eli sen pitää hakea JOSTAIN
            //MITÄ ON OSTETTU JA TULOSTAA NE 
            JRadioButton kysymys2vastaus1 = new JRadioButton("Osakkeen nimi");

            //kysymys2vastaukset.add(kysymys2vastaus1);
            // container.add(kysymys2vastaus1);
        }
    }

    /**
     * Vaikkakin luoKomponentit(tunnus, salasana, mitä ostetaan tänään ym)on
     * ilman metodin toimintaa, en niitä poista koska niiden tekemiseen meni
     * useampi päivä ja ovat mielestäni hyödyllista kehitettävää ja katseltavaa
     *
     * @param container
     */

    private void luoKomponentit(Container container) {

        JLabel kysymys1 = new JLabel("Anna tunnus ja salasana?");
        JRadioButton kysymys1vastausKylla = new JRadioButton("Tunnus ja salasana oli oikein ");
        JRadioButton kysymys1vastausEi = new JRadioButton("Yritä uudelleen");
        JButton lisaaNappi2 = new JButton("Anna tunnus ja salasana ");

        ButtonGroup kysymys2vastaukset = new ButtonGroup();

        JButton ostamasiNappi = new JButton("Ostamasi osakkeet löytyy tästä !");
        container.add(ostamasiNappi);
        JLabel nimi = new JLabel("ostettu");
        ostamasiNappi.addActionListener(new OstamasiKuuntelija(ostamasiNappi, nimi, this));

        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        container.add(kysymys1);

        container.add(kysymys1vastausKylla);

        container.add(kysymys1vastausEi);

    }

    public JFrame getFrame() {
        return frame;
    }

    private void luoKomponentit2(Container container) {
        GridLayout layout = new GridLayout(3, 2);
        container.setLayout(layout);

        JButton lisaaNappi = new JButton("Osta osake !");
        JLabel nimiTeksti = new JLabel("Anna osakkkeen nimi");

        JLabel nimiTeksti2 = new JLabel("Ostohinta");
        JTextField ostohintaKentta = new JTextField();
        JTextField nimiKenttaOsto = new JTextField();
        JLabel osto = new JLabel("Osto, montako ?");
        JTextField ostoKentta = new JTextField();

        Omatili omatili = new Omatili(tunnus, salasana);

        lisaaNappi.addActionListener(new OstaKuuntelija(lisaaNappi, nimiKenttaOsto, ostoKentta, ostohintaKentta, omatili));

        JLabel nimiTekstiMyy = new JLabel("Mikä myydään ?");
        JTextField nimiKenttaMyy = new JTextField();

        JLabel myy = new JLabel("Myydään , montako ?");
        JTextField myyntiKentta = new JTextField();

        JLabel hinta = new JLabel("Myyntihinta");
        JTextField hintaKentta = new JTextField();

        JButton lisaaNappiMyy = new JButton("Myy osake ");
        lisaaNappiMyy.addActionListener(new MyyKuuntelija(lisaaNappiMyy, nimiKenttaMyy, myyntiKentta, hintaKentta, omatili));

        container.add(lisaaNappi);

        container.add(nimiTeksti);
        container.add(nimiKenttaOsto);
        container.add(osto);
        container.add(ostoKentta);

        container.add(nimiTeksti2);
        container.add(ostohintaKentta);

        container.add(lisaaNappiMyy);
        container.add(nimiTekstiMyy);
        container.add(nimiKenttaMyy);
        container.add(myy);
        container.add(myyntiKentta);
        container.add(hinta);
        container.add(hintaKentta);

    }

}
