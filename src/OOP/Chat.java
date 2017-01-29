package OOP;

import java.util.ArrayList;

/**
 * Created by piret on 28.01.17.
 */
public class Chat {

    private static String tuba;

    private static ArrayList<String> uusList = new ArrayList();

    public Chat(String toaNimi) {
        tuba = toaNimi;

    }

    //Sisesta sõnum
    public void sisestaSonum(String kasutajaNimi, String sõnum) {
        uusList.add(kasutajaNimi + ": " + sõnum);
    }

    //Prindi sõnumid koos kasutaja nimega
    public void prindiKoikSonumidKoosKasutajanimega() {
        System.out.println(uusList.toString());
    }

    //Admin kustutab sõnumi
    public void adminKustutabSonumi(String sõnumKustutamiseks) {

        for (int i = 0; i < uusList.size(); i++) {
            if (uusList.get(i).contains(sõnumKustutamiseks)){
                System.out.println(i);
                uusList.remove(i);

            }
        }
    }

    //Prindi toa nimi
    public void prindiToaNimi() {

        System.out.println(tuba);
    }

}
