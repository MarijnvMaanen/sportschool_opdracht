package klassen;

import java.util.ArrayList;

public class Lid extends Gebruiker{

    private int lidNummer;
    private ArrayList<Reservering> Sportmomenten = new ArrayList<>();
    public static ArrayList<Lid> alleLeden = new ArrayList<>();
    public Lid(String nm, String ww, String mail, int lidNr) {
        super(nm, ww, mail);
        lidNummer = lidNr;
    }


    public int getLidNummer(){return lidNummer;}

    public void setLidNummer(int lidNr){lidNummer = lidNr;}


    public void reserveerEenLes(Reservering r){
            Sportmomenten.add(r);
    }


    public String toString(){
        return "lid: " + naam + " heeft lidnummer: " + lidNummer;
    }
}
