import java.util.Scanner;
public class Bouquet implements BouquetContent {

    final Scanner scanner = new Scanner(System.in);
    private int flowersInBouquet;
    private String flowerName;

    public Bouquet(String flowerName, int flowersInBouquet) {

        this.flowerName = flowerName;
        this.flowersInBouquet = flowersInBouquet;
        }

    public void setBouquet() {

        System.out.println("Enter the type of flower you'd like:");
        flowerName= scanner.next();

        System.out.println("Enter the number of flowers in bouquet: ");
        final String numberOfFlowers = scanner.next();

        try {
            flowersInBouquet = Integer.parseInt(numberOfFlowers);
            if (flowersInBouquet <= 0) {
                throw new NumberOfFlowersException(flowersInBouquet);
            }
        } catch (NumberOfFlowersException e) {
            System.out.printf("[ERROR]: The number of flowers in bouquet should be more then 0. " +
                    "You entered '%d'\n", e.getFlowersInBouquet());
        } catch (NumberFormatException e){
            System.out.println("[ERROR]: The number of flowers you enter should be an integer number");
        }
    }

    public void displayContent(){
        if (flowersInBouquet > 0)
        System.out.printf("Bouquet consists of %d of %s", flowersInBouquet, flowerName);
    }
}
