package pl.edu.pg.eti.ksg.po.lab1.transformacje;

import pl.edu.pg.eti.ksg.po.lab1.transformacje.*;

public class Main {
    public static void main(String[] args) {
        try {
            Translacja translacja = new Translacja(9, 3);
            Skalowanie skalowanie = new Skalowanie(4, 5);
            Obrot obrot = new Obrot(Math.PI / 3);

            Transformacja[] transformacje = {translacja, skalowanie, obrot};

            ZlozenieTransformacji zlozenie = new ZlozenieTransformacji(transformacje);
            System.out.println(zlozenie);

            Punkt p1 = new Punkt(2, 3);
            System.out.println("Punkt p1: " + p1);

            Punkt p2 = zlozenie.transformuj(p1);
            System.out.println("Punkt po zlozeniu transformacji: " + p2);

            Transformacja odwrotneZlozenie = zlozenie.getTransformacjaOdwrotna();
            System.out.println("Odwrotne zlozenie transformacji: " + odwrotneZlozenie);

            Punkt p3 = odwrotneZlozenie.transformuj(p2);
            System.out.println("Punkt po odwrotnym zlozeniu transformacji: " + p3);

        } catch (BrakTransformacjiOdwrotnejException e) {
            System.err.println("Błąd: " + e.getMessage());
        }
    }
}