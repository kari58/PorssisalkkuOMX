package PorssisalkkuOMX;

import Kayttoliittyma.Tonnipaivassa;
import Kayttoliittyma.OstaKuuntelija;
import PorssisalkkuOMX.Kirjautuminen;
import PorssisalkkuOMX.Paivamaara;
import PorssisalkkuOMX.Pankintili;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Omatili> omattilit = new HashMap<String, Omatili>();
        omattilit.put("kari", new Omatili("kari", "ilma"));
        Tonnipaivassa tonni = new Tonnipaivassa(omattilit);

        SwingUtilities.invokeLater(tonni);

    }
}
