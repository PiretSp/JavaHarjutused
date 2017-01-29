
package Algoritm;

/**
 * Antud on kaks massiivi õhu temperatuuridega. Arvuta mõlema puhul mitu positiivset temperatuuri
 * on massiivis rohkem kui negatiivseid.
 */
public class Suusailm {
    public static void main(String[] args) {
        int[] kraadid1 = {11, 10, 5, 1, 3, -2, -6, 2, -13, -24, -9, 0};
        int[] kraadid2 = {-23, -25, -22, -18, -15, -19, -13};

        vastused(kraadid1);
        vastused(kraadid2);
    }

        // Leian negatiivsed arvud


    public static void vastused (int [] Kraadid){
        int negatiivsedArvud = 0;
        int positiivsedArvud = 0;
        for (int kraad : Kraadid){
            if (kraad < 0){
                negatiivsedArvud = negatiivsedArvud + 1;
            } else {
                positiivsedArvud = positiivsedArvud + 1;
            }
        }

        // Leian negatiivsete ja positiivsete summa vahe
        int temperatuurideVahe = positiivsedArvud - negatiivsedArvud;
        if (temperatuurideVahe > 0){
            System.out.println("Soojakraade on " + temperatuurideVahe + " võrra rohkem kui miinuskraade");
        } else {
            System.out.println("Miinuskraade on " + temperatuurideVahe*(-1) + " võrra rohkem kui soojakraade");
        }


    }

}