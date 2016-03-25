import java.util.ArrayList;

public class Sort {


    public static ArrayList sortBouquet(ArrayList <Flower> bouquet){

        ArrayList<Flower> sortedBouquet = new ArrayList<>();
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

        sortedBouquet.addAll(astras);
        sortedBouquet.addAll(camomiles);
        sortedBouquet.addAll(roses);
        sortedBouquet.addAll(rosebushes);
        sortedBouquet.addAll(tulips);

        return sortedBouquet;
    }
}
