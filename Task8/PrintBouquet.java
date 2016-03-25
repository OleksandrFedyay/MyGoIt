import java.util.ArrayList;

public class PrintBouquet {

    public static void printBouquet(ArrayList<Flower> bouquet) {

        for (Flower f : bouquet)

            System.out.printf("\n%-8s %-8s %-8s",
                    f.getClass().getSimpleName(), f.getFlowerName(), f.getFlowerColor());//Prints table of objects and their fields

        System.out.println();//Makes indention from the previous line
    }
}