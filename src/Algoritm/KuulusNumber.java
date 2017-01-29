package Algoritm;

import java.util.ArrayList;

/**
 * Antud on int[] massiiv. Eemalda kõik nr 3 väärtused ja leia millist numbrit esineb kõige siis rohkem?
 * Mitte siis number, mis on kolmandal indeksil, vaid nr kolm ise.
 */
public class KuulusNumber {

    public static void main(String[] args) {

        int[] naide = {1, 5, 3, 3, 6, 3, 7, 7}; // vastus on 7
        ArrayList<Integer> uusList = new ArrayList();

        for (int arvud : naide) {
            if (arvud != 3){
                uusList.add(arvud); // ilma 3-deta list
            }
        }
        System.out.println(uusList);

        int summa = 0;
        int populaarseim_arv = 0;
        for (int arv : uusList) {

            int loendur = 0;
            for (int ajutine_arv : uusList) {
                if (ajutine_arv == arv){
                    loendur++;
                }
            }
            if (loendur > summa) {
                populaarseim_arv = arv;
                summa = loendur;
            }

        }
        System.out.println(populaarseim_arv);

    }
}