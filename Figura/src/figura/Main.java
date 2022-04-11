package figura;

public class Main {
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(0, 0, 4);
        kwadrat.pole();
        kwadrat.rysuj();
        kwadrat.przesun(1, 2);
        System.out.println("Współrzędne kwadratu: (" + kwadrat.getX() + ", " + kwadrat.getY() + ")");

        Trojkat trojkat = new Trojkat(1, 1, 3, 2);
        trojkat.pole();
        trojkat.rysuj();
        trojkat.przesun(3, 1);
        trojkat.rysuj();

        Kolo kolo = new Kolo(2, 2, 4);
        kolo.pole();
        kolo.rysuj();
        kolo.przesun(2, 2);
        kolo.rysuj();

        Trapez trapez = new Trapez(3, 3, 3, 5, 2);
        trapez.pole();
        trapez.rysuj();
        trapez.przesun(3, 3);
        trapez.rysuj();

    }
}
