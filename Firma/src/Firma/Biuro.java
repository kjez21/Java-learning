package Firma;

public class Biuro {
    private Integer liczbaPracownikowBiura;
    private Double fundusze;

    public Biuro(Integer liczbaPracownikowBiura, Double fundusze) {
        this.liczbaPracownikowBiura = liczbaPracownikowBiura;
        this.fundusze = fundusze;
    }

    public Integer getLiczbaPracownikowBiura() {
        return liczbaPracownikowBiura;
    }

    public void setLiczbaPracownikowBiura(Integer liczbaPracownikowBiura) {
        this.liczbaPracownikowBiura = liczbaPracownikowBiura;
    }

    public Double getFundusze() {
        return fundusze;
    }

    public void setFundusze(Double fundusze) {
        this.fundusze = fundusze;
    }
}
