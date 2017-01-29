package OOP;

/**
 * Created by piret on 28.01.17.
 */
public class Zelda {
    private static int ZeldaElud;

    public Zelda(int elusid) {
        ZeldaElud = elusid;
    }

    public void kaklusKolliga(int kollilElusid) {
        ZeldaElud = ZeldaElud - kollilElusid;
        System.out.println("Zelda kakles kolliga. Ta kaotas " + kollilElusid + " elu.");
    }

    public void prindiMituEluAlles() {
        System.out.println("Zeldal on " + ZeldaElud + " elu.");
    }

    public void prindiKasOnElus() {
        if (ZeldaElud > 0){
            System.out.println("Zelda on elus. Tal on " + ZeldaElud + " elu.");
        }
        else{
            System.out.println("Zelda pole elus");
        }
    }
}
