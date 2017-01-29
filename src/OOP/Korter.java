package OOP;

/**
 * Created by piret on 28.01.17.
 */
public class Korter {
    private static int mahub;
    private static int kylalisi;

    public Korter(int mahutab) {
        mahub = mahutab;
    }


    public void saabus(String peoline) {
        if (kylalisi < mahub) {
            kylalisi++;
        }else {
            System.out.println("Rohkem ei mahu");
        }
    }

    public void prindiKylalisteArv() {
        System.out.println("Külalisi on " + kylalisi);
    }

    public void prindiPaljuVeelMahub() {
        System.out.println("Veel mahub " + (mahub - kylalisi));
    }

    public void lahkus(String peoline) {
        kylalisi--;
    }
}
