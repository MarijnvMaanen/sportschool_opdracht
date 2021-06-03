package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import klassen.*;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void LesZondeMedewerkerTest(){
        LocalDate lesdatum1 = LocalDate.of(2021, 10, 10);
        LocalTime stijd1 = LocalTime.of(10, 0, 0);
        LocalTime etijd1 = LocalTime.of(11, 0, 0);
        Les les1 = new Les(lesdatum1, 100, 17, stijd1, etijd1);
        assertEquals(17, les1.getMaxAantalPersonen());
        assertEquals(stijd1 , les1.getStarttijd());
        assertEquals(etijd1, les1.getEindtijd());
        assertEquals(lesdatum1, les1.getDatum());
    }

    @Test
    public void LesMetMedewerkerTest(){
        LocalDate lesdatum1 = LocalDate.of(2021, 10, 10);
        LocalTime stijd1 = LocalTime.of(10, 0, 0);
        LocalTime etijd1 = LocalTime.of(11, 0, 0);
        LocalDate gbdatum1 = LocalDate.of(2002, 9, 10);
        Medewerker m1 = new Medewerker("Sjaak", "wachtwoord", "s@gmail.com", "man", gbdatum1);
        Les les1 = new Les(lesdatum1, 100, 17, stijd1, etijd1, m1);
        les1.setMedewerker(m1);
        assertEquals("Sjaak", les1.getMedewerker().getNaam());
    }

    @Test
    public void reserveringTest(){
        Reservering reservering = new Reservering("Dit is een bericht", 3000) ;
        assertEquals("Dit is een bericht", reservering.getOpmerking());
        assertEquals(3000, reservering.getReserveringsnummer());
    }

    @Test
    public void lidTest(){
        Gebruiker l1 = new Lid("Marijn", "appelsap456", "m@gmail.com", 11);
        assertEquals("Marijn", l1.getNaam());
        assertEquals("appelsap456", l1.getWachtwoord());
        assertEquals("m@gmail.com", l1.getEmail());
        assertEquals(11, ((Lid) l1).getLidNummer());
    }

    @Test
    public void medewerkerTest(){
        LocalDate gbdatum1 = LocalDate.of(2002, 9, 10);//LocalDate nu = LocalDate.now();
        Gebruiker m1 = new Medewerker("Marijn", "appelsap456", "m@gmail.com", "man", gbdatum1);
        assertEquals("Marijn", m1.getNaam());
        assertEquals("appelsap456", m1.getWachtwoord());
        assertEquals("m@gmail.com", m1.getEmail());
        assertEquals("man", ((Medewerker) m1).getGeslacht());
        assertEquals(gbdatum1, ((Medewerker) m1).getGeboortedatum());
        assertEquals(18, ((Medewerker) m1).getLeeftijd());

    }
    @Test
    public void schrikkeljaarTest(){
        LocalDate gbdatum1 = LocalDate.of(2012, 2, 29);//LocalDate nu = LocalDate.now();
        Gebruiker m1 = new Medewerker("Marijn", "appelsap456", "m@gmail.com", "man", gbdatum1);
        assertEquals(9, ((Medewerker) m1).getLeeftijd());
    }
}
