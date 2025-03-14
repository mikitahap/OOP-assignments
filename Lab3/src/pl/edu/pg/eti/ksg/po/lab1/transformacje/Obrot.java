package pl.edu.pg.eti.ksg.po.lab1.transformacje;

public class Obrot implements Transformacja {
    private final double angle;

    public Obrot(double angle) {
        this.angle = angle;
    }

    @Override
    public Punkt transformuj(Punkt p) {
        double x = p.getX();
        double y = p.getY();
        double cos = Math.cos(angle);
        double sin = Math.sin(angle);
        return new Punkt(x * cos - y * sin, x * sin + y * cos);
    }

    @Override
    public Transformacja getTransformacjaOdwrotna() {
        return new Obrot(-angle); // Обратный поворот
    }

    public double getAngle() {
        return angle;
    }

    @Override
    public String toString() {
        return "Obrot o kat " + angle + " radianow";
    }
}