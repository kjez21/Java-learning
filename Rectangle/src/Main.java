public class Main {
    public static void main(String[] args) {
        Point pkt2 = new Point(1, 2);
        Rectangle rec1 = new Rectangle();
        System.out.println(rec1.toString());
        rec1.setTopRight(2, 3);
        rec1.setBottomLeft(0, 1);
        System.out.println(rec1.toString());
        System.out.println("Area of rec1: " + rec1.area());

        Rectangle rec2 = new Rectangle(0, 0, 6, 5);
        System.out.println(rec2.toString());
        rec2.setBottomLeft(pkt2.getX(), pkt2.getY());
        System.out.println(rec2.toString());
        System.out.println("Area of rec2: " + rec2.area());

    }
}
