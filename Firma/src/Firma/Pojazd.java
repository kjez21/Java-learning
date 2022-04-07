package Firma;

public class Pojazd {
    private String model;
    private String marka;
    private Double spalanie;
    private Integer rocznik;
    private String rodzajPaliwa;

    public Pojazd(String model, String marka, Double spalanie, Integer rocznik, String rodzajPaliwa) {
        this.model = model;
        this.marka = marka;
        this.spalanie = spalanie;
        this.rocznik = rocznik;
        this.rodzajPaliwa = rodzajPaliwa;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Double getSpalanie() {
        return spalanie;
    }

    public void setSpalanie(Double spalanie) {
        this.spalanie = spalanie;
    }

    public Integer getRocznik() {
        return rocznik;
    }

    public void setRocznik(Integer rocznik) {
        this.rocznik = rocznik;
    }

    public String getRodzajPaliwa() {
        return rodzajPaliwa;
    }

    public void setRodzajPaliwa(String rodzajPaliwa) {
        this.rodzajPaliwa = rodzajPaliwa;
    }
}
