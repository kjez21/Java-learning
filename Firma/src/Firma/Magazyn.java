package Firma;

public class Magazyn {
    private Integer liczbaPracownikowMagazynu;
    private Double fundusze;

    public Magazyn(Integer liczbaPracownikowMagazynu, Double fundusze) {
        this.liczbaPracownikowMagazynu = liczbaPracownikowMagazynu;
        this.fundusze = fundusze;
    }

    public Integer getLiczbaPracownikowMagazynu() {
        return liczbaPracownikowMagazynu;
    }

    public void setLiczbaPracownikowMagazynu(Integer liczbaPracownikowMagazynu) {
        this.liczbaPracownikowMagazynu = liczbaPracownikowMagazynu;
    }

    public Double getFundusze() {
        return fundusze;
    }

    public void setFundusze(Double fundusze) {
        this.fundusze = fundusze;
    }
}
