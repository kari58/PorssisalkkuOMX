
package Kayttoliittyma;

import PorssisalkkuOMX.Omatili;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JLabel;


public class MyymasiKuuntelija implements ActionListener {

    private JButton myymasiNappi;
    private JLabel nimi;
    private Tonnipaivassa tonnipaivassa;
    private Omatili omatili;
    private HashMap<String, Omatili> omattilit;

    public MyymasiKuuntelija(JButton myymasiNappi, JLabel nimi, Tonnipaivassa tonnipaivassa,
            Omatili omatili, HashMap<String, Omatili> omattilit) {
        this.myymasiNappi = myymasiNappi;
        this.nimi = nimi;
        this.tonnipaivassa = tonnipaivassa;
        this.omatili = omatili;
        this.omattilit = omattilit;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tonnipaivassa.lisaaMyymasiOsakkeet();
        omatili.getmarkkinaArvot();

    }
}
