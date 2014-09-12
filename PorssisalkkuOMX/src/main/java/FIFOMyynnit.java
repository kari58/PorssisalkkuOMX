
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kromanow
 */
public class FIFOMyynnit {
    private String osakkeennimi;
    private Paivamaara ostopaiva;
    
    public FIFOMyynnit(String osakkeennimi,int paiva,int kuukausi,int vuosi){
        this.osakkeennimi=osakkeennimi;
        this.ostopaiva=new Paivamaara(paiva,kuukausi, vuosi);
    }
    public FIFOMyynnit(String osakkeennimi,Paivamaara ostopaiva){
        this.osakkeennimi=osakkeennimi;
        this.ostopaiva=ostopaiva;
    }
    public FIFOMyynnit(String osakkeennimi){
        this.osakkeennimi=osakkeennimi;
    
    Calendar nyt=Calendar.getInstance();
    int vuosi=nyt.get(Calendar.YEAR);
    int kuukausi=nyt.get(Calendar.MONTH)+1;
    int paiva=nyt.get(Calendar.DATE);
    this.ostopaiva=new Paivamaara(paiva, kuukausi, vuosi);
    
}
    public int vanhinosake(){   
        Calendar nyt=Calendar.getInstance();
    int vuosi=nyt.get(Calendar.YEAR);
    int kuukausi=nyt.get(Calendar.MONTH)+1;
    int paiva=nyt.get(Calendar.DATE);
    Paivamaara tamaPaiva=new Paivamaara(paiva,kuukausi, vuosi);
    return ostopaiva.erotusVuosissa(tamaPaiva);
        
    }
    public boolean vanhempiKuin(FIFOMyynnit verrattava){
        return this.ostopaiva.aiemmin(verrattava.ostopaiva);
    }
    public String getOsakkeennimi(){
        return this.osakkeennimi;
    }
    public String toString(){
        return this.osakkeennimi+",ostopäivä "+this.ostopaiva;
    }
}
//public class Main{
   // public static void main(String[]args){
      //  FIFOOstoja upm= new FIFOOstoja("UPM", 15,9,2014)
  //  }
