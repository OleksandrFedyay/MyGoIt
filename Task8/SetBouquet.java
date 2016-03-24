import java.util.ArrayList;

public class SetBouquet {

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
        mixedBouquet.add(pinkTulip);
        mixedBouquet.add(redAstra);
        mixedBouquet.add(yellowAstra);
        mixedBouquet.add(redRosebush);
        mixedBouquet.add(whiteRosebush);
        mixedBouquet.add(whiteCamomile);
        mixedBouquet.add(yellowRose);

        for (Flower f : mixedBouquet)
            System.out.printf("\n%-8s %-8s %-8s",
                    f.getClass().getSimpleName(), f.getFlowerName(), f.getFlowerColor());//Prints table of objects and their fields

        System.out.println();//Makes indention from the previous line

        sortBouquet(mixedBouquet);//Sorts flowers by name

    }

        public static void sortBouquet(ArrayList <Flower> bouquet){

            ArrayList<Flower>astras = new ArrayList<>();
            ArrayList<Flower>roses = new ArrayList<>();
            ArrayList<Flower>camomiles = new ArrayList<>();
            ArrayList<Flower>rosebushes = new ArrayList<>();
            ArrayList<Flower>tulips = new ArrayList<>();

            for (Flower flower : bouquet ) {
                if (flower.getFlowerName().equals("Astra")) {
                    astras.add(flower);
                }
                if (flower.getFlowerName().equals("Tulip")) {
                    tulips.add(flower);
                }
                if (flower.getFlowerName().equals("Rose")) {
                    roses.add(flower);
                }
                if(flower.getFlowerName().equals("Rosebush")) {
                    rosebushes.add(flower);
                }
                if(flower.getFlowerName().equals("Camomile")) {
                    camomiles.add(flower);
                }
            }

            ArrayList<Flower> sortedBouquet = new ArrayList<>();
            sortedBouquet.addAll(astras);
            sortedBouquet.addAll(camomiles);
            sortedBouquet.addAll(roses);
            sortedBouquet.addAll(rosebushes);
            sortedBouquet.addAll(tulips);

            sortedBouquet.forEach(flower -> System.out.printf("\n%s",flower));
    }
}