package figura;

public class Trapez extends Figura{
    private double a, b, h;

    public Trapez(double x, double y, double a, double b, double h) {
        super(x, y);
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    void rysuj() {
        System.out.println("Rysujemy trapez o podstawach długości " + getA() + " i " + getB() + " oraz wysokości " + getH() + " na pozycji (" + getX() + ", " + getY() + ")");
    }

    @Override
    void pole() {
        double pole = ((getA() + getB()) * getH()) / 2;
        System.out.println("Pole trapezu o podstawach długości " + getA() + " i " + getB() + " oraz wysokości " + getH() + " wynosi " + pole);
    }
}
