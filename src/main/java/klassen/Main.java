package klassen;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args){

    LocalDate gbdatum1 = LocalDate.of(2002, 9, 10);
    LocalDate lesdatum1 = LocalDate.of(2021, 10, 10);
    LocalTime stijd1 = LocalTime.of(10, 0, 0);
    LocalTime etijd1 = LocalTime.of(11, 0, 0);

    Gebruiker l1 = new Lid("Marijn", "wachtwoord", "m@gmail.com", 11);
    Gebruiker l2 = new Lid("Tim", "wachtwoord", "t@gmail.com", 22);
    Gebruiker m1 = new Medewerker("Sjaak", "wachtwoord", "s@gmail.com", "man", gbdatum1);
    //koppel m1 aan les
    Les les1 = new Les(lesdatum1, 100, 17, stijd1, etijd1);
    Reservering r1 = new Reservering("hoi meneer", 1001);

System.out.println(l1.toString());
System.out.println(m1.toString());
System.out.println(les1.toString());
System.out.println(r1.toString());
    }
}
