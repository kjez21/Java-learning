package mpk;

public class TypBiletu {
    private String nazwa;
    private double cena;

    public TypBiletu(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }
}
