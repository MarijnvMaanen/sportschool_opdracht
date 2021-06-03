package klassen;

public class Reservering {

    private String opmerking;
    private int reserveringsnummer;

    public Reservering(String opm, int rn){
        opmerking = opm;
        reserveringsnummer = rn;
    }

    public Reservering(int rn){
        reserveringsnummer = rn;
    }

    public String getOpmerking(){return opmerking;}
    public int getReserveringsnummer(){return reserveringsnummer;}

    public void setReserveringsnummer(int rn){reserveringsnummer = rn;}
    public void setOpmerking(String opm){opmerking = opm;}


    public String toString(){
        return "opmerking " + opmerking + " bij lesnummer " + reserveringsnummer;
    }
}
