package numbers;

public class Main {
    public static void main(String[] args) {
        ComplexNumber x = new ComplexNumber(2.0, 5.0);
        ComplexNumber y = new ComplexNumber(3.0, 1.0);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("po dodaniu: " +  x.add(y));
        System.out.println("po odejmowaniu: " + x.substract(y));
        System.out.println("Mnożenie: " + x.multiply(y));
        System.out.println("x.toDouble(): " + x.toDouble());
        System.out.println("x.getX(): " + x.getX());
        System.out.println("x.getY(): " + x.getY());
        System.out.println("If x equals y: " + x.ifEquals(y));
        System.out.println("x.arg(): " + x.arg());
        System.out.println("x.mod(): " + x.mod());
        System.out.println("x.conjugate(): " + x.conjugate());
    }
}
