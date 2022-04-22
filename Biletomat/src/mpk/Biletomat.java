package mpk;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Biletomat {
    private String location;
    private ArrayList<TypBiletu> listaBiletow = new ArrayList<>();
    private Historia zakupioneBilety = new Historia();
    private boolean czyMoznaKupicBilet;

    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    //System.out.println(formatter.format(date));

    private Date data = new Date();
    private int iloscKartek;
    private int iloscMonet;
    private Historia historia = new Historia();
    private Serwis serwis = new Serwis();



    public Biletomat(String location) {
        this.location = location;
        listaBiletow.add(new TypBiletu("ulgowy20", 2.0));
        listaBiletow.add(new TypBiletu("ulgowy40", 3.0));
        listaBiletow.add(new TypBiletu("ulgowy60", 4.0));
        listaBiletow.add(new TypBiletu("normalny20", 4.0));
        listaBiletow.add(new TypBiletu("normalny40", 6.0));
        listaBiletow.add(new TypBiletu("normalny60", 8.0));

        this.iloscKartek = 10;
        this.iloscMonet = 10;
        System.out.println("Utworzono biletomat! " + formatter.format(data));
        czyMoznaKupicBilet = true;


    }

    public Serwis getSerwis() {
        return serwis;
    }

    public SesjaZakupu rozpocznijSesje() {
        if (czyMoznaKupicBilet) {
            return new SesjaZakupu();
        } else {
            System.out.println("Biletomat zablokowany!");
            return null;
        }
    }

    public class SesjaZakupu {
        private ArrayList<Bilet> listaWybranychBiletow = new ArrayList<>();

        public void dodaj(String nazwa) {
            TypBiletu typBiletu = null;

            for (int i = 0; i < listaBiletow.size(); i++) {
                if(listaBiletow.get(i).getNazwa().equals(nazwa)) {
                    //cena = listaBiletow.get(i).getCena();
                    typBiletu = listaBiletow.get(i);
                }
            }
            if (typBiletu == null) return;
            Date dataZakupu = new Date();
            Bilet bilet = new Bilet(typBiletu, dataZakupu);
            listaWybranychBiletow.add(bilet);
        }

        public void kupIZaplac() {
            Double cena = 0.0;

            for (int i = 0; i < listaWybranychBiletow.size(); i++) {
                cena += listaWybranychBiletow.get(i).getRodzaj().getCena();
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("Suma: " + cena);
            System.out.println("Wybierz metode platnosci [g/k]:");
            String wybor = scanner.nextLine();
            if(wybor.equals("g")) {
                double doZaplaty = cena;
                while (doZaplaty > 0) {
                    System.out.println("Wrzuc monete [1/2/5]:");
                    String wrzucono = scanner.nextLine();
                    if (wrzucono.equals("1") || wrzucono.equals("2") || wrzucono.equals("5")) {
                        doZaplaty -= Double.parseDouble(wrzucono);
                        iloscMonet++;
                        System.out.println("Do zapłaty pozostało: " + doZaplaty);
                    } else {
                        System.out.println("Zła moneta!");
                        continue;
                    }
                }
                if(doZaplaty == 0.0) {
                    System.out.println("Płatność przyjęta");
                } else if(doZaplaty < 0.0) {
                    System.out.println("Poczekaj na resztę");
                    wyplacReszte(Math.abs(doZaplaty));
                }
                historia.dodajBilety(listaWybranychBiletow);
                listaWybranychBiletow.clear();

            } else if(wybor.equals("k")) {
                System.out.println("Przyłóż kartę [k]:");
                String czyZaplacono = scanner.nextLine();
                if (czyZaplacono.equals("k")) {
                    System.out.println("Płatność przyjęta");
                    historia.dodajBilety(listaWybranychBiletow);
                    listaWybranychBiletow.clear();
                } else {
                    System.out.println("Odrzucono");
                }
            } else {
                return;
            }
        }

        private void wyplacReszte(double v) {
            while (v > 0.0) {
                if (v >= 5.0) {
                    v -= 5.0;
                    System.out.println("Wydaję 5zł");
                    iloscMonet--;
                    continue;
                }
                if (v >= 2.0) {
                    v -= 2.0;
                    System.out.println("Wydaję 2zł");
                    iloscMonet--;
                    continue;
                }
                if (v >= 1.0) {
                    v -= 1.0;
                    System.out.println("Wydaję 1zł");
                    iloscMonet--;
                    continue;
                }
            }
        }
    }

    /*public Bilet sprzedajBilet(String rodzaj, Pieniadz rodzajPlatnosci) {
        //double cena = 0.0;
        TypBiletu typBiletu = null;
        Bilet bilet;

        for (int i = 0; i < listaBiletow.size(); i++) {
            if(listaBiletow.get(i).getNazwa().equals(rodzaj)) {
                //cena = listaBiletow.get(i).getCena();
                typBiletu = listaBiletow.get(i);
            }
        }
        if (typBiletu == null) return null;
        Date dataZakupu = new Date();
        bilet = new Bilet(typBiletu, dataZakupu);
        return bilet;
    }*/

    public class Bilet {
        private TypBiletu rodzaj;
        private Date dataZakupu;

        private Bilet(TypBiletu rodzaj, Date dataZakupu) {
            this.rodzaj = rodzaj;
            this.dataZakupu = dataZakupu;
        }

        public TypBiletu getRodzaj() {
            return rodzaj;
        }

        public void setRodzaj(TypBiletu rodzaj) {
            this.rodzaj = rodzaj;
        }

        public Date getDataZakupu() {
            return dataZakupu;
        }

        public void setDataZakupu(Date dataZakupu) {
            this.dataZakupu = dataZakupu;
        }

        @Override
        public String toString() {
            return "Bilet{" +
                    "rodzaj=" + rodzaj +
                    ", dataZakupu=" + dataZakupu +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Biletomat{" +
                "historia=" + historia +
                '}';
    }

    public class Serwis {
        private int licznik;

        public void zmienDate() {
            data = new Date();
            licznik++;
        }

        public void zmienIloscMonet(int x) {
            iloscMonet = x;
            System.out.println("Ilość monet w biletomacie: " + iloscMonet);
            licznik++;
        }

        public void zmienIloscKartek(int x) {
            iloscKartek = x;
            System.out.println("Ilość kartek w biletomacie: " + iloscKartek);
            licznik++;
        }

        public void  zablokujBiletomat() {
            czyMoznaKupicBilet = false;
            System.out.println("Biletomat został zablokowany!");
            licznik++;
        }

        public void  odblokujBiletomat() {
            czyMoznaKupicBilet = true;
            System.out.println("Biletomat został odblokowany!");
            licznik++;
        }

        public void zglosAwarie() {
            czyMoznaKupicBilet = false;
            licznik++;
            if (iloscKartek == 0) {
                System.out.println("Brak blankietów papieru!");
            } else if (iloscMonet == 0) {
                System.out.println("Brak monet w biletomacie!");
            } else {
                System.out.println("Brak zasilania!");
            }
        }

        public void naprawAwarie() {
            licznik++;
            czyMoznaKupicBilet = true;
            if (iloscKartek == 0) {
                zmienIloscKartek(20);
                System.out.println("Uzupełniono papier w biletomacie");
            } else if (iloscMonet == 0) {
                zmienIloscMonet(20);
                System.out.println("Uzupełniono zapas monet");
            } else {
                System.out.println("Naprawiono awarię");
            }
        }

        public void dodajNowyRodzajBiletu(String nazwa, double cena) {
            licznik++;
            listaBiletow.add(new TypBiletu(nazwa, cena));
            System.out.println("Dodano nowy rodzaj biletu");
        }

        @Override
        public String toString() {
            return "Serwis{\n" +
                    "Ilość wykonanych operacji serwisowych: " + licznik +
                    "\nStan biletomatu:\nilość blankietów papieru: " + iloscKartek + "\nilość monet: " + iloscMonet + "\n" +
                    '}';
        }
    }
}
