public class Point {
    private double x;
    private double y;

    Point() {
        setCoords(0, 0);
    }
    Point(double x, double y) {
        setCoords(x, y);
    }
    public double getX() {
        return this.x;
    };
    public double getY() {
        return this.y;
    };
    public void setCoords(double x, double y) {
        this.x = x;
        this.y = y;
    };
    public String toString() {
        return "(" + this.getX() + ", " + this.getY() + ")";
    }
}
