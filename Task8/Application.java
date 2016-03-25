import java.util.ArrayList;

public class Application  {

        public static void main(String[] args) {

            ArrayList<Rose> roseBouquet = new ArrayList<>();

            Rose yellowRose = new Rose("Rose", "Yellow");
            Rose redRose = new Rose("Rose", "Red");
            Rose whiteRose = new Rose("Rose", "White");

            roseBouquet.add(yellowRose);
            roseBouquet.add(redRose);
            roseBouquet.add(whiteRose);

            roseBouquet
                    .stream()
                    .forEach(System.out::println);


            ArrayList<Flower> mixedBouquet = new ArrayList<>();

            Tulip whiteTulip = new Tulip("Tulip", "White");
            Tulip pinkTulip = new Tulip("Tulip", "Pink");
            Astra redAstra = new Astra("Astra", "Red");
            Astra yellowAstra = new Astra("Astra", "Yellow");
            Rosebush redRosebush = new Rosebush("Rosebush", "Red");
            Rosebush whiteRosebush = new Rosebush("Rosebush", "White");
            Camomile whiteCamomile = new Camomile("Camomile", "White");

            mixedBouquet.add(whiteTulip);
            mixedBouquet.add(redAstra);
            mixedBouquet.add(pinkTulip);
            mixedBouquet.add(redRosebush);
            mixedBouquet.add(yellowAstra);
            mixedBouquet.add(whiteRosebush);
            mixedBouquet.add(whiteCamomile);
            mixedBouquet.add(yellowRose);

            PrintBouquet.printBouquet(mixedBouquet);
            PrintBouquet.printBouquet(Sort.sortBouquet(mixedBouquet));

        }
    }



