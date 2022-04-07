package Firma;

public class Kurier {
    private String imie;
    private String nazwisko;
    private String pesel;
    private String login;
    private String haslo;

    public Kurier(String imie, String nazwisko, String pesel, String login, String haslo) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.login = login;
        this.haslo = haslo;
    }

    public void kopnijPaczke() {
        System.out.println("Kurier kopnął paczkę");
    }

    public void rzucPaczke() {
        System.out.println("Kurier rzucił paczkę");
    }

    public void wydaj() {
        System.out.println("Kurier wydaje paczkę");
    }

    public void odbierz() {
        System.out.println("Kurier odbiera paczkę");
    }

    public void zatankujPojazd() {
        System.out.println("Kurier tankuje pojazd");
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
