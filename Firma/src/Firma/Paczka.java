package Firma;

public class Paczka {
    private Double waga;
    private Double wysokosc;
    private Double szerokosc;
    private Double dlugosc;

    public Paczka(Double waga, Double wysokosc, Double szerokosc, Double dlugosc) {
        this.waga = waga;
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
        this.dlugosc = dlugosc;
    }

    public Double getWaga() {
        return waga;
    }

    public void setWaga(Double waga) {
        this.waga = waga;
    }

    public Double getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(Double wysokosc) {
        this.wysokosc = wysokosc;
    }

    public Double getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(Double szerokosc) {
        this.szerokosc = szerokosc;
    }

    public Double getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(Double dlugosc) {
        this.dlugosc = dlugosc;
    }

}
