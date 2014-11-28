/*
 *Projektista löytyy paljon turhaa koodia ja moni asia on tehty monimutkaisemmin kuin on tarve. 
Ohjelma kuitenkin toimii ainakin pinnallisella tasolla ja käyttöliittymä on jossain määrin saatu integroitua ohjelmalogiikkaan. 
Testien tekeminen vaikuttaisi olevan hieman haastavaa, 
todennäköisesti osittain johtuen siitä syystä että itse ohjelmakoodi on paikoittain hyvinkin sekavaa
eikä näin ole helppoa saada syvällistä ymmärrystä siitä, miten ohjelma oikeastaan toimii.
Suosittelisin vahvasti että projektin tekemisen ohella kertaisit perusasioita 
ja etenkin sitä miten ohjelmasi eri osa-alueet toimivat keskenään.
Oman ohjelman koodaus perustuu hyvin vahvasti soveltamiseen, joka vaatii syvää ymmärrystä perusasioista. Mikäli mahdollista,
github -repositorion siivoaminen olisi myös aiheellistä, joskaan ei tärkeysjärjestyksessä ensimmäisenä.
 */

package Kayttoliittyma;

import PorssisalkkuOMX.Omatili;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * KORVAA
 *   protected HashMap<String, Integer> saldot;
   protected HashMap<String, ArrayList<Integer>> samaaOstettuUseammin;
 * Olethan huomioinut tunnus salasana=ilma ja tunnus=kari muuten ei toimi
 *
 * testti testi MyyKuuntelija myydään osakkeita, joita PorsisalkkuOMX sisältää,
 * et voi myydä enempää kuin sinulla on. Jos et omista Lemminkäistä, et sitä
 * myöskään voi myydä
 *
 * @author kromanow
 */
public class MyyKuuntelija implements ActionListener {

    private JTextField nimiKenttaMyy;
    private JTextField myyntiKentta;
    private JTextField hintaKentta;

    private JButton myy;
    private Omatili omatili;

    MyyKuuntelija(JButton myy, JTextField nimiKenttaMyy, JTextField myyntiKentta, JTextField hintaKentta, Omatili omatili) {
        this.nimiKenttaMyy = nimiKenttaMyy;
        this.myyntiKentta = myyntiKentta;
        this.omatili = omatili;
        this.myy = myy;
     this.hintaKentta = hintaKentta;

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        double markkinaArvo = Double.parseDouble(hintaKentta.getText());
        int kappaleMaara = Integer.parseInt(myyntiKentta.getText());

        if (!omatili.getsaldot().containsKey(this.nimiKenttaMyy.getText())) {

            JOptionPane.showMessageDialog(null, "Ett omista yhtään näitä", "Et voi myydä", JOptionPane.ERROR_MESSAGE);
        } else {
            if (omatili.getsaldot().get(nimiKenttaMyy.getText()) >= Integer.parseInt(myyntiKentta.getText())) {

                String osake = nimiKenttaMyy.getText();
                omatili.myy(osake, kappaleMaara,markkinaArvo);

             
                JOptionPane.showMessageDialog(null, "ONNISTUI", "MYYNTI", JOptionPane.ERROR_MESSAGE);

            } else {

                JOptionPane.showMessageDialog(null, "Et voi myydä", "Et omista noin paljon !", JOptionPane.ERROR_MESSAGE);
            }

        }
    }
}
