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
import java.util.Iterator;
import java.util.Map.Entry;
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
 toinen versio lisaaMyymasiosakkeet()
        
//        int saldot = 0;
//        for (int saldo : omatili.getsaldot().values()) {
//            saldot += saldo;
//        }
//        String teksti = ""+saldot + " ";
//
//        
//        for(String avain : omatili.getsaldot().keySet()){
//           teksti += avain + " ,";
//        }
*/

/**
 
 *
 * @author kromanow
 */
/*

*/
public class Tonnipaivassa implements Runnable {

    private String tunnus;
    private String salasana;
    private Omatili omatili;
   private HashMap<String,Omatili>omattilit;
   private JTextField ostamasi;
   private JTextField myymasi;
   public Tonnipaivassa(){
       this.omatili = new Omatili(tunnus, salasana);
       this.omattilit=new HashMap<String,Omatili>();
   }

    private JFrame frame;

    public Tonnipaivassa(HashMap<String, Omatili> omattilit) {
        this.omatili = new Omatili(tunnus, salasana);
       this.omattilit= omattilit;
    }

    @Override
    public void run() {
        System.out.println("Tonnipaivassa");
        frame = new JFrame("Ikkuna");
        frame.setPreferredSize(new Dimension(300, 500));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }
    public void lisaaOstamasiOsakkeet() {
        
    String teksti = "";
    Iterator entries = omatili.getsaldot().entrySet().iterator();
    while (entries.hasNext()) {
      Entry thisEntry = (Entry) entries.next();
      Object key = thisEntry.getKey();
      Object value = thisEntry.getValue();
      teksti += value + " " + key  +", " + omatili.getostohinnat().get(key.toString())+" €  ";
        
 
    }
     ostamasi.setText(teksti);
    }
    public void lisaaMyymasiOsakkeet(){
           String teksti = "";
    Iterator entries = omatili.getMyydytOsakkeet().entrySet().iterator();
    while (entries.hasNext()) {
      Entry thisEntry = (Entry) entries.next();
      Object key = thisEntry.getKey();
      Object value = thisEntry.getValue();
    
     //teksti += value + " " + key  +", "+omatili.getMyydytOsakkeet().get(key.toString())+" €  ";
        teksti += value + " " + key  +", "+omatili.getmarkkinaArvot().get(key.toString())+" €  ";
     
    }
    myymasi.setText(teksti);
        
    }

       
        


    /**
     *  public void lisaaMyymasiOsakkeet(){
String teksti = "";
Iterator entries = omatili.getMyydytOsakkeet().entrySet().iterator();
while (entries.hasNext()) {
Entry thisEntry = (Entry) entries.next();
Object key = thisEntry.getKey();
Object value = thisEntry.getValue();
teksti += value + " " + key +", ";
//omatili.getostohinnat().get(key).doubleValue()
}
myymasi.setText(teksti);
}

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
        
        
       kysymys1.addActionListener(new SalasanaKuuntelija( syoteTextField,nimiTeksti,omatili,
               kysymys1,tunnusKentta,salasanaTekstiKentta,omattilit));
     
     

        JButton lisaaNappi = new JButton("Osta osake !");
        JLabel nimiTeksti1 = new JLabel("Anna osakkkeen nimi");
         container.add(lisaaNappi);
         container.add(nimiTeksti1);

        JLabel nimiTeksti2 = new JLabel("Ostohinta");
        JTextField ostohintaKentta = new JTextField();
        JTextField nimiKenttaOsto = new JTextField();
        JLabel osto = new JLabel("Osto, montako ?");
        JTextField ostoKentta = new JTextField();

        lisaaNappi.addActionListener(new OstaKuuntelija(lisaaNappi, nimiKenttaOsto, ostoKentta,
                ostohintaKentta, omatili,omattilit));

        JLabel nimiTekstiMyy = new JLabel("Mikä myydään ?");
        JTextField nimiKenttaMyy = new JTextField();

        JLabel myy = new JLabel("Myydään , montako ?");
        JTextField myyntiKentta = new JTextField();

        JLabel hinta = new JLabel("Myyntihinta");
        JTextField hintaKentta = new JTextField();

        JButton lisaaNappiMyy = new JButton("Myy osake ");
        lisaaNappiMyy.addActionListener(new MyyKuuntelija(lisaaNappiMyy, nimiKenttaMyy, myyntiKentta, 
                hintaKentta, omatili));

       

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
        ostamasiNappi.addActionListener(new OstamasiKuuntelija(ostamasiNappi,nimi, this,
                omatili,omattilit));
        BoxLayout layout1 = new BoxLayout(container, BoxLayout.Y_AXIS);
container.setLayout(layout1);


JButton myymasiNappi = new JButton("Myymäsi osakkeet löytyy tästä !");
        container.add(myymasiNappi);
      JLabel nimi1 = new JLabel("Myyty ");
        myymasi = new JTextField();
        container.add(myymasi);
        myymasiNappi.addActionListener(new MyymasiKuuntelija(myymasiNappi,nimi1, this,
                omatili,omattilit));
        BoxLayout layout12 = new BoxLayout(container, BoxLayout.Y_AXIS);
container.setLayout(layout1);


   


       
    }

    public JFrame getFrame() {
        return frame;
    }

}