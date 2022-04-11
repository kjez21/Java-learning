package figura;

public class Kolo extends Figura{
    private double r;

    Kolo(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    void rysuj() {
        System.out.println("Rysujemy koło o promieniu " + getR() + " na pozycji: (" + getX() + ", " + getY() + ")");
    }

    @Override
    void pole() {
        double pole = Math.PI * getR() * getR();
        System.out.println("Pole koła o promieniu " + getR() + " wynosi " + pole);
    }
}
