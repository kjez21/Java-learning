package figura;

public class Trojkat extends Figura{
    private double a, h;

    public Trojkat(double x, double y, double a, double h) {
        super(x, y);
        this.a = a;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    void rysuj() {
        System.out.println("Rysujemy trójkąt o boku długości " + getA() + " na pozycji (" + getX() + ", " + getY() + ")" );
    }

    @Override
    void pole() {
        double pole = getA() * getH() / 2;
        System.out.println("Pole trójkąta o boku długości " + getA() + " i wysokości " + getH() + " wynosi " + pole);
    }
}
