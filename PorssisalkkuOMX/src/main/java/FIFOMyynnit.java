
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
    public int myy(){
        if(osakkeennimi.vanhinosake&&((ostohinta / markkinaArvo) < 0.95) || ((ostohinta / markkinaArvo) == 1.1)) {
            saldot-=saldot.values(osakkeennimi);
        }
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
      //  Ostoja upm= new FIFOOstoja("UPM", 15,9,2014)
Olet saanut jo hyvin koodia projektiisi! Main-luokassa (eli maven projektissa nimeltään App.java) ei tosin tulisi olla juuri muuta koodia, kuin sen verran mikä vaaditaan ohjelman käynnistämiseen. Siellä nyt sijaitsevat metodit voisi siirtää omaan luokkaansa, vaikkapa PorssisalkkuOMX-nimiseen. Testejä olet myös kirjoitellut ihan hyvin, mutta niitä olisi saanut olla vielä pari lisää (olet kommentoinut osan pois). Muistathan pitää myös luokkakaavion ajan tasalla, nyt sieltä puuttuu mm. Paivamaara-luokka. Kaiken kaikkiaan projektissa ei kuitenkaan ole suurempia puutteita, jatka samaan malliin!
  //  }
