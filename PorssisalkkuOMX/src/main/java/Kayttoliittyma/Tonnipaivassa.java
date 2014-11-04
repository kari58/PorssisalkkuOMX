/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kayttoliittyma;

import PorssisalkkuOMX.Kirjautuminen;
import PorssisalkkuOMX.Omatili;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.HashMap;
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
/*
ILMEISESTI LUOKOMPONENTIT PITÄÄ POISTAA JA KAIKKI KAMA LUOKOMNPONENTIT2 ALLE
*/
public class Tonnipaivassa implements Runnable {

    private String tunnus;
    private String salasana;
    Omatili omatili = new Omatili(tunnus, salasana);
   private HashMap<String,Omatili>omattilit;
   private JTextField ostamasi;
   public Tonnipaivassa(){
       this.omattilit=new HashMap<String,Omatili>();
   }
//omattilit ei tallenna ostoa tutkittu debuger
    private JFrame frame;

    public Tonnipaivassa(HashMap<String, Omatili> omattilit) {
       this.omattilit= omattilit;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        System.out.println("Tonnipaivassa");
        frame = new JFrame("Ikkuna");
        frame.setPreferredSize(new Dimension(300, 500));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

       // luoKomponentit2(frame.getContentPane());
        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }
// omatilit ei sisällä ostettuja osakkeita tutkittu debuggerilla
    public void lisaaOstamasiOsakkeet() {
        System.out.println("lisaaOstamasiOsakkeet -metodia kutsuttu");
        String teksti = ""+omatili.getsaldot().keySet().size() + " ";
        // omattilit.get("simo");
        for(String avain : omatili.getsaldot().keySet()){
           teksti += avain + " ";
        }
//eikö tässä pitäisi ///getOsakkeet() vaihtoolla omatili.getsaldot().size()????
//       for (int i = 0; i < omatili.getsaldot().size(); i++) {//omatili.getOsakkeet() ei toimi
//            teksti += omatili.getsaldot().get(i) + "\n";
//       }
        ostamasi.setText(teksti);
    }

    /**
     * Vaikkakin luoKomponentit(tunnus, salasana, mitä ostetaan tänään ym)on
     * ilman metodin toimintaa, en niitä poista koska niiden tekemiseen meni
     * useampi päivä ja ovat mielestäni hyödyllista kehitettävää ja katseltavaa
     *
     * @param container
     */

    private void luoKomponentit(Container container) {
           GridLayout layout = new GridLayout(3, 2);
        container.setLayout(layout);

       
        JButton kysymys1=new JButton("AnnaTunnusJaSalasana");
        container.add(kysymys1);
        
        JLabel nimiTeksti = new JLabel("Anna tunnus");
        container.add(nimiTeksti);
       
        JTextField tunnusKentta=new JTextField();
        container.add(tunnusKentta);
        
        JLabel salasanaTeksti=new JLabel("Anna salasana");
        container.add(salasanaTeksti);
        JTextField salasanaTekstiKentta=new JTextField();
        container.add(salasanaTekstiKentta);
        JTextField syoteTextField=new JTextField();
        
        
       kysymys1.addActionListener(new SalasanaKuuntelija( syoteTextField,nimiTeksti,omatili,kysymys1,tunnusKentta,salasanaTekstiKentta,omattilit));
     
     

        JButton lisaaNappi = new JButton("Osta osake !");
        JLabel nimiTeksti1 = new JLabel("Anna osakkkeen nimi");
         container.add(lisaaNappi);
         container.add(nimiTeksti1);

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

    
   
       


        JButton ostamasiNappi = new JButton("Ostamasi osakkeet löytyy tästä !");
        container.add(ostamasiNappi);
      JLabel nimi = new JLabel("ostettu");
        ostamasi = new JTextField();
        container.add(ostamasi);
        ostamasiNappi.addActionListener(new OstamasiKuuntelija(ostamasiNappi,nimi, this,omatili));
        BoxLayout layout1 = new BoxLayout(container, BoxLayout.Y_AXIS);
container.setLayout(layout1);

   


       
    }

    public JFrame getFrame() {
        return frame;
    }

}