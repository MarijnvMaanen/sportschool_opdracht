package klassen;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class Les {

    private LocalDate datum;
    private int lesnummer;
    private int maxAantalPersonen;
    private LocalTime starttijd;
    private LocalTime eindtijd;
    private Medewerker medewerker;

    private ArrayList<Lid> Aanwezigen = new ArrayList<>();

    public Les(LocalDate dtm, int lesnr, int maxp, LocalTime start, LocalTime eind){
        datum = dtm;
        lesnummer = lesnr;
        maxAantalPersonen = maxp;
        starttijd = start;
        eindtijd = eind;
    }

    public Les(LocalDate dtm, int lesnr, int maxp, LocalTime start, LocalTime eind, Medewerker mwerker){
        datum = dtm;
        lesnummer = lesnr;
        maxAantalPersonen = maxp;
        starttijd = start;
        eindtijd = eind;
        medewerker = mwerker;
    }


    public LocalDate getDatum(){ return datum;}
    public int getLesnummer(){ return lesnummer;}
    public int getMaxAantalPersonen(){ return maxAantalPersonen;}
    public LocalTime getStarttijd(){ return starttijd;}
    public LocalTime getEindtijd(){ return eindtijd;}
    public Medewerker getMedewerker(){ return medewerker;}

    public void setDatum(LocalDate dtm){datum = dtm;}
    public void setLesnummer(int lesnr){lesnummer = lesnr;}
    public void setMaxAantalPersonen(int maxp){maxAantalPersonen = maxp;}
    public void setStarttijd(LocalTime start){starttijd = start;}
    public void setEindtijd(LocalTime eind){eindtijd = eind;}
    public void setAanwezigen(Lid l){Aanwezigen.add(l);}
    public void setMedewerker(Medewerker mwerker){medewerker = mwerker;}

    public String toString(){
        return "les: " + lesnummer + " op " + datum + " begint om " + starttijd + " met max " + maxAantalPersonen + " aantal personen";
    }
}
