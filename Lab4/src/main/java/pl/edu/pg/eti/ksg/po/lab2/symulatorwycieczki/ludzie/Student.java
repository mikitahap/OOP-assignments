package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;

 
public class Student extends Czlowiek{

    public Student(String imie, String nazwisko, Plec plec) {
        super(imie, nazwisko, plec, 4.0);
    }

    protected Student(String imie, String nazwisko, Plec plec, double maksymalnaPredkosc) {
        super(imie, nazwisko, plec, maksymalnaPredkosc);
    }

    protected Student(String imie, String nazwisko, Plec plec, double maksymalnaPredkosc, double czasPelnejRegeneracji, double czasPelnegoZmeczenia) {
        super(imie, nazwisko, plec, maksymalnaPredkosc, czasPelnejRegeneracji, czasPelnegoZmeczenia);
    }
    
    

    @Override
    public int getUmiejetnosciNawigacyjne() {
        return 3;
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
