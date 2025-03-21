package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;

public class Dziecko extends Czlowiek {

    public Dziecko(String imie, String nazwisko, Plec plec) {
        super(imie, nazwisko, plec, 2.0); 
    }

    @Override
    public int getUmiejetnosciNawigacyjne() {
        return 1; 
    }

    @Override
    public void reagujNaWedrowke(Wedrowka w, double czas) {
 
        poziomZmeczenia += (czas / 12.0);
        System.out.println(getImie() + " " + getNazwisko() + " mówi: Hmm, wędrówka: " + w.getNazwa() + ". Jestem zmęczony!");
    }

    @Override
    public void reagujNaAtrakcje(Atrakcja atrakcja, double czas) {
 
        poziomZmeczenia -= czas / 12.0;
        if (poziomZmeczenia < 0) {
            poziomZmeczenia = 0;
        }
        System.out.println(getImie() + " " + getNazwisko() + " regeneruje siły na atrakcji: " + atrakcja.getNazwa() + ". To było fajne!");
    }
}