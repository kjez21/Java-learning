public class MyNumber {
    double x;

    MyNumber(Double n) {
        x = n;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public boolean isOdd() {
        if (this.x % 2 == 0) {
            return false;
        }
        return true;
    }

    public boolean isEven() {
        if (this.x % 2 == 0) {
            return true;
        }
        return false;
    }

    public double sqrt() {
        return Math.sqrt(this.getX());
    }

    public double pow(MyNumber y) {
        return Math.pow(this.x, y.getX());
    }

    public MyNumber add(MyNumber y) {
        MyNumber result = new MyNumber(this.getX() + y.getX());
        return result;    }

    public MyNumber substract(MyNumber y) {
        MyNumber result = new MyNumber(this.getX() - y.getX());
        return result;
    }

    @Override
    public String toString() {
        return "MyNumber{" +
                "x=" + x +
                '}';
    }
}
