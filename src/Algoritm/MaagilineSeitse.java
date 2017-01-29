package Algoritm;

import java.util.ArrayList;

/**
 * Antud on int[] massiiv. Korruta kõik seitsmed kahega ja leia arvude keskmine.
 */
class MaagilineSeitse {

    public static void main(String[] args) {

        int[] naide = {7, 4, 324, 65, 4, 78, 7, 45, 4};

        int korrutamine = 0;
        for (int arvud : naide) {
            if (arvud == 7){
                korrutamine = korrutamine + arvud*2;
            }
        }
        System.out.println("Kui korrutada seitsmed kahega, on vastuseks " + korrutamine);

        int summa = 0;
        int loendur = 0;
        for (int arvud : naide) {
            if (arvud == 7){
                loendur = loendur + 1;
                summa = summa + arvud;
            }
        }

        System.out.println("Seitsmete keskmine on " + summa/loendur);

        int koikideSumma = 0;
        for (int arvud : naide){
            koikideSumma = koikideSumma + arvud;
        }
        System.out.println("Kõikide arvude keskmine on " + (double)koikideSumma/naide.length);
    }

}