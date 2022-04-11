package figura;

public abstract class Figura {
    private Double x, y;
    Figura(double x, double y) {
        setX(x);
        setY(y);
    }

    public void przesun(double dx, double xy) {
        setX(getX() + dx);
        setY(getY() + xy);
    }

    abstract void rysuj();

    abstract void pole();

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }
}
