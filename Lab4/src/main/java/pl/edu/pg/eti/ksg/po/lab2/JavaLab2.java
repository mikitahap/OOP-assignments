package pl.edu.pg.eti.ksg.po.lab2;

import java.util.HashSet;
import java.util.Set;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Grupa;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.SymulatorWycieczki;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Uczestnik;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wycieczka;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.Droga;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.Las;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy.DrewnianaCerkiew;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie.*;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.SluchaczPostepow;

public class JavaLab2 {
    public static void main(String[] args) {
        Wycieczka w = mojaWycieczka();

        PrzewodnikStudencki przewodnik = new PrzewodnikStudencki("Stefan", "Długonogi", Czlowiek.Plec.MEZCZYZNA);
        Set<Uczestnik> uczestnicy = new HashSet<>();
        uczestnicy.add(new Student("Alojzy", "Mechanik", Czlowiek.Plec.MEZCZYZNA));
        uczestnicy.add(new Student("Ada", "Lovelace", Czlowiek.Plec.KOBIETA));
        uczestnicy.add(new Student("Jan", "Elektronik", Czlowiek.Plec.MEZCZYZNA));
        uczestnicy.add(new StudentKSG("Piotr", "Teledetekcyjny", Czlowiek.Plec.MEZCZYZNA));
        uczestnicy.add(new Biegacz("Marek", "Biegacz", Czlowiek.Plec.MEZCZYZNA));
        uczestnicy.add(new Grubas("Janusz", "Gruby", Czlowiek.Plec.MEZCZYZNA));
        uczestnicy.add(new Fotograf("Anna", "Fotograf", Czlowiek.Plec.KOBIETA));
        uczestnicy.add(new Dziecko("Kasia", "Mała", Czlowiek.Plec.KOBIETA));

        Grupa g = new Grupa(przewodnik, uczestnicy);

        SymulatorWycieczki symulator = new SymulatorWycieczki(g, w);

        symulator.dodajSłuchacza((element, lp, liczbaElementow) -> {
            System.out.println("Postęp: " + lp + "/" + liczbaElementow + " - " + element.getNazwa());
        });

        symulator.symuluj();
    }

    public static Wycieczka mojaWycieczka() {
        Wycieczka ret = new Wycieczka("Moja ulubiona wycieczka");

        ret.dodajElementWycieczki(new Droga(2.0));
        ret.dodajElementWycieczki(new Las(3.0)); 
        ret.dodajElementWycieczki(new Droga(1.5)); 
        ret.dodajElementWycieczki(new DrewnianaCerkiew("Smolnik")); 
        ret.dodajElementWycieczki(new Droga(1.0)); 
        ret.dodajElementWycieczki(new Las(2.0)); 
        ret.dodajElementWycieczki(new Droga(4.0)); 
        ret.dodajElementWycieczki(new Las(2.0)); 

        return ret;
    }
}