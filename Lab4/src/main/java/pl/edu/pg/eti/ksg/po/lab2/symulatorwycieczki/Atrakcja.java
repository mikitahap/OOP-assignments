package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki;

public abstract class Atrakcja implements ElementWycieczki {
    private final double czasZwiedzania;

    public Atrakcja(double czasZwiedzania) {
        this.czasZwiedzania = czasZwiedzania;
    }

    public double getCzasZwiedzania() {
        return czasZwiedzania;
    }

    @Override
    public String getNazwa() {
        return this.getClass().getSimpleName();
    }
}