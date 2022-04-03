public class Main {
    public static void main(String[] args) {
        Point pkt2 = new Point(1, 2);

        Triangle tr1 = new Triangle();
        System.out.println(tr1);
        tr1.setA(pkt2);
        tr1.setB(new Point(5, 6));
        tr1.setC(new Point(3, 2));
        System.out.println(tr1);
        if (tr1.isPossible()) {
            System.out.println("Można utworzyć taki trójkąt");
        } else {
            System.out.println("Nie można utworzyć takiego trójkąta");
        }
        System.out.println("Pole tr1: " + tr1.area());
        Triangle tr2 = new Triangle(1, 1, 3, 1, 2, 3);
        System.out.println(tr2);
        if (tr2.isPossible()) {
            System.out.println("Można utworzyć taki trójkąt");
        } else {
            System.out.println("Nie można utworzyć takiego trójkąta");
        }
        System.out.println("Pole tr2: " + tr2.area());
        tr2.setB(new Point(1, 1));
        System.out.println(tr2);
        if (tr2.isPossible()) {
            System.out.println("Można utworzyć taki trójkąt");
        } else {
            System.out.println("Nie można utworzyć takiego trójkąta");
        }
    }
}
