
import Porssikauppias.Tonnipaivassa;
import com.mycompany.porssisalkkuomx.Paivamaara;
import javax.swing.SwingUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kromanow
 */
public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Tonnipaivassa());

        
            Paivamaara eka = new Paivamaara(24, 9, 2009);
            Paivamaara toka = new Paivamaara(24, 9, 2014);
            System.out.println(eka + " ja" + toka + " ero vuosissa on "+ eka.erotusVuosissa(toka));
        }
    }

  