package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;

public class Grubas extends Czlowiek {

    public Grubas(String imie, String nazwisko, Plec plec) {
        super(imie, nazwisko, plec, 2.5);
    }

    @Override
    public int getUmiejetnosciNawigacyjne() {
        return 2;
    }

    @Override
    public void reagujNaWedrowke(Wedrowka w, double czas) {
        poziomZmeczenia += (czas / 12.0);
        System.out.println(getImie() + " " + getNazwisko() + " mówi: Hmm, wędrówka: " + w.getNazwa());
    }

    @Override
    public void reagujNaAtrakcje(Atrakcja atrakcja, double czas) {
 
        poziomZmeczenia -= czas / 18.0;
        if (poziomZmeczenia < 0) {
            poziomZmeczenia = 0;
        }
        System.out.println(getImie() + " " + getNazwisko() + " regeneruje siły na atrakcji: " + atrakcja.getNazwa());
    }
}