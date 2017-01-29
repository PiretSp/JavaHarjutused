package OOP;

import java.util.ArrayList;

/**
 * Created by piret on 28.01.17.
 */
public class Sonaraamat {

    private static String keel;
    private static ArrayList<String> raamatuSisu = new ArrayList();

    public Sonaraamat(String raamatuKeel) {
        keel = raamatuKeel;
    }

    public void sisestaSona(String sõna) {
        raamatuSisu.add(sõna);
    }

    public String[] otsiEsimeseTaheJargi(String täht) {
        ArrayList<String> leitud = new ArrayList();
        for (String sõna : raamatuSisu){
            if (sõna.startsWith(täht)){
                leitud.add(sõna);
            }
        }
        //Arrayllistist saab massiv
        String[] vastus = new String[leitud.size()];
        vastus = leitud.toArray(vastus);

        return vastus;
    }

    public void eemaldaSona(String sõna) {
        for (int i = 0; i < raamatuSisu.size(); i++) {
            if (raamatuSisu.get(i).equals(sõna)){
                raamatuSisu.remove(i);
            }
        }
    }

    public void misKeelesRaamatOn() {
        System.out.println("Raamat on " + keel + " keeles.");
    }

    public void naitaSisu(){
        System.out.println(raamatuSisu.toString());
    }
}
