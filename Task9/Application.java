import java.util.ArrayList;

public class Application  {

        public static void main(String[] args) {

            ArrayList<Flower> mixedBouquet = new ArrayList<>();

            Rose yellowRose = new Rose("Rose", "Yellow");
            Tulip pinkTulip = new Tulip("Tulip", "Pink");
            Astra yellowAstra = new Astra("Astra", "Yellow");
            Rosebush whiteRosebush = new Rosebush("Rosebush", "White");
            Camomile whiteCamomile = new Camomile("Camomile", "White");

            mixedBouquet.add(pinkTulip);
            mixedBouquet.add(yellowAstra);
            mixedBouquet.add(whiteRosebush);
            mixedBouquet.add(whiteCamomile);
            mixedBouquet.add(yellowRose);

            System.out.println(mixedBouquet.toString());
            System.out.println(CesarCrypt.toCodeString(mixedBouquet));
            System.out.println(CesarCrypt.toUncodeString(CesarCrypt.toCodeString(mixedBouquet)));







        }
    }



