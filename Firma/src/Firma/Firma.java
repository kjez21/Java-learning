package Firma;

public class Firma {
    private String nazwaFirmy;
    private String NIP;
    private String REGON;
    private Double kapital;
    private String domena;

    public Firma(String nazwaFirmy, String NIP, String REGON, Double kapital, String domena) {
        this.nazwaFirmy = nazwaFirmy;
        this.NIP = NIP;
        this.REGON = REGON;
        this.kapital = kapital;
        this.domena = domena;
    }

    public String getNazwaFirmy() {
        return nazwaFirmy;
    }

    public void setNazwaFirmy(String nazwaFirmy) {
        this.nazwaFirmy = nazwaFirmy;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getREGON() {
        return REGON;
    }

    public void setREGON(String REGON) {
        this.REGON = REGON;
    }

    public Double getKapital() {
        return kapital;
    }

    public void setKapital(Double kapital) {
        this.kapital = kapital;
    }

    public String getDomena() {
        return domena;
    }

    public void setDomena(String domena) {
        this.domena = domena;
    }
}
