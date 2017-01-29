package OOP;

import java.util.ArrayList;

/**
 * Created by piret on 28.01.17.
 */
public class Kassa {

    private static String kassapidajaNimi;
    private static ArrayList<String> toodeteNimekiri = new ArrayList();

    public Kassa(String kassapidaja) {
        kassapidajaNimi = kassapidaja;
    }

    public void lisaToode(String toode) {
        toodeteNimekiri.add(toode);
    }

    public void eemaldaToode(String toode) {
        for (int i = 0; i < toodeteNimekiri.size(); i++) {
            if (toodeteNimekiri.get(i).equals(toode)){
                toodeteNimekiri.remove(i);
            }
        }
    }

    public void prindiOstutsekk() {
        //System.out.println(toodeteNimekiri.toString());
        for ( String toode: toodeteNimekiri) {
            System.out.println(" Ostetud toode: " + toode);
        }
    }

    public void prindiKassapidajaNimi() {
        System.out.println("Teid teenindas: " + kassapidajaNimi);
    }
}
