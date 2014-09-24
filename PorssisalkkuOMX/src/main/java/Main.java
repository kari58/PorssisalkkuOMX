
import Porssikauppias.Tonnipaivassa;
import com.mycompany.porssisalkkuomx.Paivamaara;
import com.mycompany.porssisalkkuomx.Pankintili;
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
            eka.aiemmin(toka);
            Pankintili pankintili=new Pankintili( 100000);
            //pankintili.myy();
            pankintili.getostohinnat();
            pankintili.getmarkkinaArvot();
            pankintili.getsaldot();
            System.out.println(eka + " ja" + toka + " ero vuosissa on "+ eka.erotusVuosissa(toka));
        }
    }
