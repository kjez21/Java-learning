package mpk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Historia {
    private ArrayList<Biletomat.Bilet> listaBiletow = new ArrayList<>();

    public ArrayList<Biletomat.Bilet> getHistoria() {
        return listaBiletow;
    }

    public void dodajBilet(Biletomat.Bilet bilet) {
        //System.out.println("Dodaj bilet");

    }

    public void dodajBilety(ArrayList<Biletomat.Bilet> lista) {
        listaBiletow.addAll(lista);
    }

    @Override
    public String toString() {
        /*return "Historia { " +
                "listaBiletow=" + listaBiletow +
                '}';*/
        String output = "\nPodsumowanie:\n";
        HashMap<TypBiletu, Integer> mapa = new HashMap<TypBiletu, Integer>();
        for (Biletomat.Bilet el:listaBiletow) {
            mapa.merge(el.getRodzaj(), 1, Integer::sum);
        }
        for (Map.Entry<TypBiletu, Integer> x : mapa.entrySet()) {
            output += x.getKey().getNazwa() + " : " + x.getValue() + " : " + (x.getValue() * x.getKey().getCena()) + "\n";
        }
        return output;
    }
}
