package numbers;

public class ComplexNumber {
    double x, y;
    ComplexNumber(double a, double b) {
        this.setX(a);
        this.setY(b);
    }

    ComplexNumber(double a) {
        this.setX(a);
        this.setY(0.0);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double mod() {
        double result = Math.sqrt(this.x * this.x + this.y * this.y);
        return result;
    }

    public double arg() {
        return Math.atan2(this.y, this.x);
    }

    public ComplexNumber conjugate() {
        return new ComplexNumber(this.x,-this.y);
    }

    public boolean ifEquals(ComplexNumber n) {
        return this.x == n.getX() && this.y == n.getY();
    }

    public ComplexNumber add(ComplexNumber n) {
        return new ComplexNumber(this.x + n.getX(), this.y + n.getY());
    }

    public ComplexNumber add(double n) {
        return new ComplexNumber(this.x + n, this.y);
    }

    public ComplexNumber substract(ComplexNumber n) {
        return new ComplexNumber(this.x - n.getX(), this.y - n.getY());
    }

    public ComplexNumber substract(double n) {
        return new ComplexNumber(this.x - n, this.y);
    }

    public ComplexNumber multiply(ComplexNumber n) {
        double real = this.x * n.getX() - this.y * n.getY();
        double imaginary = this.x * n.getY() + this.y * n.getX();
        return new ComplexNumber(real,imaginary);
    }

    public ComplexNumber multiply(double n) {
        double real = this.x * n;
        double imaginary = this.y * n;
        return new ComplexNumber(real,imaginary);
    }

    public double toDouble() {
        return this.getX();
    }



    @Override
    public String toString() {
        return "ComplexNumber{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
