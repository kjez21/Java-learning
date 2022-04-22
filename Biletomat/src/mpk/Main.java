package mpk;

public class Main {
    public static void main(String[] args) {
        Biletomat biletomat = new Biletomat("Kraków");
        Biletomat.SesjaZakupu sesja = biletomat.rozpocznijSesje();
        String nazwa = "ulgowy20";
        sesja.dodaj(nazwa);
        sesja.dodaj("ulgowy40");
        sesja.kupIZaplac();
        System.out.println("Sprzedane bilety:\n" + biletomat);
        var serwis = biletomat.getSerwis();
        serwis.zmienIloscMonet(30);
        serwis.zmienIloscKartek(0);
        serwis.zglosAwarie();
        serwis.naprawAwarie();
        System.out.println(serwis);
        serwis.dodajNowyRodzajBiletu("super", 10.0);
        serwis.zablokujBiletomat();
        serwis.odblokujBiletomat();
        Biletomat.SesjaZakupu sesja2 = biletomat.rozpocznijSesje();
        sesja.dodaj("ulgowy40");
        sesja.dodaj("super");
        sesja.dodaj("ulgowy40");
        sesja.dodaj("normalny20");
        sesja.dodaj("normalny20");
        sesja.kupIZaplac();
        System.out.println("Sprzedane bilety:\n" + biletomat);
    }
}
