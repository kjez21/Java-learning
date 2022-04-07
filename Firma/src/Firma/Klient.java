package Firma;

public class Klient {
    private String imie;
    private String nazwisko;
    private String telefon;
    private String adres;

    public Klient(String imie, String nazwisko, String telefon, String adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.telefon = telefon;
        this.adres = adres;
    }

    public void nadaj() {
        System.out.println("Klient nadaje paczkę");
    }

    public void odbierz() {
        System.out.println("Klient odbiera paczkę");
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

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}
