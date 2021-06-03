package klassen;

public class Gebruiker {

    protected String naam;
    protected String wachtwoord;
    protected String email;



    public  Gebruiker(String nm, String ww, String mail){
        naam = nm;
        wachtwoord = ww;
        email = mail;
    }

    public String getNaam() { return naam;}
    public String getWachtwoord() { return wachtwoord;}
    public String getEmail() { return email;}


    public void setNaam(String nm){naam = nm;}
    public void setWachtwoord(String ww){wachtwoord = ww;}
    public void setEmail(String mail){email = mail;}

}















