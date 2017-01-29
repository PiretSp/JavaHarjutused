package OOP;

/**
 * Created by piret on 28.01.17.
 */
public class Pastakas {

    private static int kogus;

    public Pastakas(int tindiKogus) {
        kogus = tindiKogus;
    }

    public void kirjuta(String tekst) {
        int pikkus = tekst.length();
        if (pikkus < kogus){
            kogus = kogus - pikkus;
            System.out.println(tekst);
        } else{
            System.out.println(tekst.substring(0, kogus));
            kogus = 0;
        }
    }

    public void prindiPaljuTintiAlles() {
        System.out.println(kogus);
    }
}
