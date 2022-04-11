package figura;

public class Kwadrat extends Figura {

    private Double a;

    Kwadrat(double x, double y, double a) {
        super(x, y);
        setA(a);
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    @Override
    void rysuj() {
        System.out.println("Rysujemy kwadrat o boku długości " + getA() + " na pozycji: (" + getX() + ", " + getY() + ")");
    }

    @Override
    void pole() {
        double pole = this.a * this.a;
        System.out.println("Pole kwadratu o boku " + getA() + " wynosi " + pole);
    }
}
