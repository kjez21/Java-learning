package Firma;

public class SerwisKurierski {
    private Integer iloscDostepnychTerminali;
    private Integer liczbaPracownikowSerwisu;
    private Double fundusze;

    public SerwisKurierski(Integer iloscDostepnychTerminali, Integer liczbaPracownikowSerwisu, Double fundusze) {
        this.iloscDostepnychTerminali = iloscDostepnychTerminali;
        this.liczbaPracownikowSerwisu = liczbaPracownikowSerwisu;
        this.fundusze = fundusze;
    }

    public Integer getIloscDostepnychTerminali() {
        return iloscDostepnychTerminali;
    }

    public void setIloscDostepnychTerminali(Integer iloscDostepnychTerminali) {
        this.iloscDostepnychTerminali = iloscDostepnychTerminali;
    }

    public Integer getLiczbaPracownikowSerwisu() {
        return liczbaPracownikowSerwisu;
    }

    public void setLiczbaPracownikowSerwisu(Integer liczbaPracownikowSerwisu) {
        this.liczbaPracownikowSerwisu = liczbaPracownikowSerwisu;
    }

    public Double getFundusze() {
        return fundusze;
    }

    public void setFundusze(Double fundusze) {
        this.fundusze = fundusze;
    }
}
