                 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PorssisalkkuOMX;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Objects;

/**
 * KORVAA
 * tutki erityisesti TORSTAINA SALDOT GRAAFISESSSA JA POISTA  VAIHE VAIHEELTA
 *   protected HashMap<String, Integer> saldot;
   protected HashMap<String, ArrayList<Integer>> samaaOstettuUseammin;
   * 
   * MYYDYT SAMA HOMMA  
 * Luokka toimii arkistona ostohinnoille ,paivamaarille,tapahtumille, ja
 * saldoille
 *
 * @author kromanow
 */
public class PorssisalkkuOMX {

   protected HashMap<String, Double> ostohinnat;
    protected HashMap<String, Integer> saldot;
   protected HashMap<String, ArrayList<Integer>> samaaOstettuUseammin; //lisätty 18.11
    protected HashMap<String, Double> markkinaArvot;
    protected HashMap<String, Integer> myydytOsakkeet;
     //lisätty 18.11  a ja a ei tulostu oamlle riville

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.ostohinnat);
        hash = 73 * hash + Objects.hashCode(this.saldot);
        hash = 73 * hash + Objects.hashCode(this.markkinaArvot);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PorssisalkkuOMX other = (PorssisalkkuOMX) obj;
        if (!Objects.equals(this.ostohinnat, other.ostohinnat)) {
           return false;
        }
        if (!Objects.equals(this.saldot, other.saldot)) {
            return false;
        }
        if (!Objects.equals(this.markkinaArvot, other.markkinaArvot)) {
            return false;
        }
        return true;
    }

    ArrayList<Tapahtumat> osakkeet = new ArrayList<Tapahtumat>();

    /**
     * arralist osakkeet käytetään FIFO:ssa vanhimman osakkeen myynnissä
     */
    public PorssisalkkuOMX() {
      this.ostohinnat = new HashMap<>();
        this.saldot = new HashMap<>();
        this.markkinaArvot = new HashMap<>();
        this.myydytOsakkeet = new HashMap<>();
        this.samaaOstettuUseammin=new HashMap<>();
        ostohinnat.put("UPM", 11.0);   //näitä käytetty JUNITest
        markkinaArvot.put("UPM", 12.0);
        saldot.put("UPM", 100);
    }

    public HashMap<String, Integer> getMyydytOsakkeet() {
        return myydytOsakkeet;
    }

    /**
     * ostohinta kuvaa osakkeen hinnan ostossa, saldot oston määrän saldot
     * salkussa markkinahinta on tämän päivän kurssi ja sitä käytetään myyntiä
     * arvioitaessa ostohetken kurssi on tietysti myyjälle markkinahinta
     *
     * @return
     */
    public HashMap<String, Double> getostohinnat() {
        return ostohinnat;
    }

    public HashMap<String, Integer> getsaldot() {
        return saldot;
    }

    public HashMap<String, Double> getmarkkinaArvot() {
        return markkinaArvot;
    }
    public HashMap<String, ArrayList<Integer>> getsamaaOstettuUseammin(){
   return samaaOstettuUseammin;
}

    /**
     * ostossa kuhunkin sarakkeeseen lisätäään ostohinta ja määrä markkina-arvot
     * myyntiä tehtäessä
     *LISÄÄ OSAKE MARKKINAARVOT JA  OSTOHINNAT VAATII SIIS 4 PARAMETRIA
     * VOISI EHKÄ MARKKINA-ARVON YHDISTÄÄ MYYNTIHINTAAN, ei onnisti koska rakenne rikkoutuu muualla graafisesasa
     * @param osake= tietyn osakkeen nimi
     * @param ostohinta=ostohetkellä maksettu hinta
     * @param saldo =kaikkien tietyn osakkeen lukumäärä
     * @param markkinaArvo =porssin määrittämä sen hetkinen kurssi osakkeelle
     */
    public void lisaaOsake(String osake, int saldo, double ostohinta,double markkinaArvo) {
        this.ostohinnat.put(osake, ostohinta);
     
       
      
           this.saldot.put(osake, saldo); 
        
        
        this.markkinaArvot.put(osake, markkinaArvo);    
    
       if (!samaaOstettuUseammin.isEmpty()&&samaaOstettuUseammin.containsKey(osake)) {  //lisätty 18.11 tässä toisen kerran tai useammin

            ArrayList<Integer> aikaisemmatOstot = samaaOstettuUseammin.get(osake);
            
            aikaisemmatOstot.add(saldo);
            this.samaaOstettuUseammin.put(osake, aikaisemmatOstot);

        }
        else{
            ArrayList<Integer>ostot=new ArrayList<Integer>();
            ostot.add(saldo);
            this.samaaOstettuUseammin.put(osake, ostot);  
           //lisätty 18.11 tässä ekaa kertaa 
        }
    }
  

    public double ostohinta(String osake) {
        if (!this.ostohinnat.containsKey(osake)) {
            return ostohinnat.get(osake);
        }
        return this.ostohinnat.get(osake);
    }

    public int saldo(String osake) {
        if (!this.saldot.containsKey(osake)) {
            return this.saldot.get(osake);
        }
        return this.saldot.get(osake);
    }

    public double markkinaArvo(String osake) {
        if (!this.markkinaArvot.containsKey(osake)) {
            return this.markkinaArvot.get(osake);
        }
        return this.markkinaArvot.get(osake);
    }

    public void vahennaOsake(String osake, int saldo, double markkinaArvo) { 
       
        this.saldot.put(osake, saldot.get(osake) - saldo);
        this.markkinaArvot.put(osake, markkinaArvo);
        this.myydytOsakkeet.put(osake, saldo);
      
    }

   

}

