public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    Rectangle() {
        setBottomLeft(0, 0);
        setTopRight(1, 1);
    }
    Rectangle(Point p1, Point p2) {
        setBottomLeft(p1.getX(), p1.getY());
        setTopRight(p2.getX(), p2.getY());
    }
    Rectangle(double x1, double y1, double x2, double y2) {
        setBottomLeft(x1, y1);
        setTopRight(x2, y2);
    }
    public void setBottomLeft(double x, double y){
        bottomLeft = new Point(x, y);
    }
    public void setTopRight(double x, double y){
        topRight = new Point(x, y);
    }
    public Point getBottomLeft() {
        return this.bottomLeft;
    }
    public Point getTopRight() {
        return this.topRight;
    }
    public double area() {
        double a = this.getTopRight().getX() - this.getBottomLeft().getX();
        double b = this.getTopRight().getY() - this.getBottomLeft().getY();
        return Math.abs(a * b);
    }
    public String toString() {
        return "[" + this.getBottomLeft().toString() + "," + this.getTopRight().toString() + "]";
    }
}
