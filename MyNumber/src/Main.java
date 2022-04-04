public class Main {
    public static void main(String[] args) {
        MyNumber a = new MyNumber(3.0);
        System.out.println(a);
        if (a.isOdd()) {
            System.out.println("a jest liczbą nieparzystą");
        } else {
            System.out.println("a nie jest liczbą nieparzystą");
        }
        if (a.isEven()) {
            System.out.println("a jest liczbą parzystą");
        } else {
            System.out.println("a nie jest liczbą parzystą");
        }
        MyNumber b = new MyNumber(2.0);
        System.out.println("sqrt() " + a.sqrt());
        System.out.println("pow(b) " + a.pow(b));
        System.out.println("add(b) " + a.add(b).toString());
        System.out.println("substract(b) " + a.substract(b));


    }
}
