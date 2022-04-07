package Firma;

public class KierownikSerwisu {
    private String imie;
    private String nazwisko;
    private String pesel;
    private String login;
    private String haslo;

    public KierownikSerwisu(String imie, String nazwisko, String pesel, String login, String haslo) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.login = login;
        this.haslo = haslo;
    }

    public void ukaraj() {
        System.out.println("Kierownik serwisu karze pracownika");
    }

    public void pochwal() {
        System.out.println("Kierownik serwisu pochwala pracownika");
    }

    public void wydajRaport() {
        System.out.println("Kierownik serwisu wydaje raport");
    }

    public void przydzielObszar() {
        System.out.println("Kierownik serwisu przydziela obszar");
    }

    public void wydajTerminal() {
        System.out.println("Kierownik serwisu wydaje terminal");
    }

    public void skontroluj() {
        System.out.println("Kierownik serwisu przeprowadza kontrolę");
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }
}
