package pl.edu.pg.eti.ksg.po.lab1.transformacje;

public class ZlozenieTransformacji implements Transformacja {
    private final Transformacja[] transformacje;

    public ZlozenieTransformacji(Transformacja[] transformacje) {
        this.transformacje = transformacje;
    }

    @Override
    public Punkt transformuj(Punkt p) {
        Punkt wynik = p;
        for (Transformacja t : transformacje) {
            wynik = t.transformuj(wynik);
        }
        return wynik;
    }

    @Override
    public Transformacja getTransformacjaOdwrotna() throws BrakTransformacjiOdwrotnejException {
        Transformacja[] odwrotneTransformacje = new Transformacja[transformacje.length];
        for (int i = 0; i < transformacje.length; i++) {
            odwrotneTransformacje[transformacje.length - 1 - i] = transformacje[i].getTransformacjaOdwrotna();
        }
        return new ZlozenieTransformacji(odwrotneTransformacje);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Zlozenie transformacji:\n");
        for (Transformacja t : transformacje) {
            sb.append(t.toString()).append("\n");
        }
        return sb.toString();
    }
}