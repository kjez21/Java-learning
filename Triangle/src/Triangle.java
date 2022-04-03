public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    Triangle() {
        this.a = new Point();
        this.b = new Point(1,0);
        this.c = new Point(1,1);
    }
    Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.a = new Point(x1, y1);
        this.b = new Point(x2,y2);
        this.c = new Point(x3,y3);
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public double lengthOfSide(Point a, Point b) {
        return Math.sqrt(Math.abs((b.getX() - a.getX()) *  (b.getX() - a.getX()) + ((b.getY() - a.getY()) * (b.getY() - a.getY()))));
    }

    public boolean isPossible() {
        double d1 = lengthOfSide(getA(), getB());
        double d2 = lengthOfSide(getA(), getC());
        double d3 = lengthOfSide(getC(), getB());
        if ( d3 > d2 - d1 && d1 > d3- d2 && d2 > d3 - d1) return true;
        return false;
    };

    public double area() {
        double d1 = lengthOfSide(getA(), getB());
        double d2 = lengthOfSide(getA(), getC());
        double d3 = lengthOfSide(getC(), getB());

        double p = (d1 + d2 + d3) / 2;

        return Math.sqrt(p * (p - d1) * (p - d2) * (p - d3));

    };

    public String toString() {
        return "[" + this.getA().toString() + "," + this.getB().toString() + "," + this.getC().toString() + "]";
    };
}
