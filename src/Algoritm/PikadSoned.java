package Algoritm;

import java.util.Arrays;

/**
 * Antud on massiiv. Mitu sõne on massiivis keskmisest pikemad?
 */
public class PikadSoned {
    public static void main(String[] args) {

        String[] naide = {"kaalikas", "joonas", "maakera", "homeros", "mandel"}; // vastus on 3

        // Leian kõikide sõnade tähemärkide summa
        int summa = 0;
        for (String sõna : naide){
            summa = summa + sõna.length();
        }
        System.out.println("Massiivis on tähemärke kokku " + summa);


        // Leian sõnade keskmise pikkuse
        double KP = (double)summa / naide.length;
        System.out.println("Keskmine sõnade pikkus on " + KP);


        // Leian sõnad mille tähemärkide arv on suurem kui sõnade keskmine pikkus
        int pikadSõnad = 0;
        for (String sõna : naide){
            if (sõna.length() > KP){
                pikadSõnad = pikadSõnad + 1;
            }
        }
        System.out.println("Keskmisest pikemaid sõnu on lauses " + pikadSõnad);

    }
}