package klassen;

import org.joda.time.Years;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;


public class Medewerker extends Gebruiker{

    private String geslacht;
    private LocalDate geboortedatum;

    public Medewerker(String nm, String ww, String mail, String gslcht, LocalDate gbdatum) {
        super(nm, ww, mail);
        geslacht = gslcht;
        geboortedatum = gbdatum;
    }

    public void setGeslacht(String gslcht){geslacht = gslcht;}
    public void setGeboortedatum(LocalDate gbdatum){geboortedatum = gbdatum;}
    public String getGeslacht(){return geslacht;}
    public LocalDate getGeboortedatum(){return geboortedatum;}


    public int getLeeftijd(){
        Period p = Period.between(geboortedatum, LocalDate.now());
        return p.getYears();
    }


    public String toString(){
       return  "medewerker " + naam + " is een " + geslacht + " en is " + geboortedatum + " jaar oud";
    }
}
