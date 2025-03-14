package pl.edu.pg.eti.ksg.po.lab1.transformacje;
public class Punkt {
    private final double x,y;
    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Punkt) {
            Punkt other = (Punkt) obj;
            return this.x == other.x && this.y == other.y;
        }
        return false;
    }
    @Override
    public int hashCode() {
        return 59 * Double.hashCode(x) + 7 * Double.hashCode(y);
    }
    @Override
    public String toString() {
        return "Punkt(" + x + ", " + y + ")";
    }

    public static final Punkt O = new Punkt(0, 0);
    public static final Punkt E_X = new Punkt(1, 0);
    public static final Punkt E_Y = new Punkt(0, 1);
}