
public class NumberOfFlowersException extends Exception {

    private int flowersInBouquet;

    public NumberOfFlowersException(int flowersInBouquet) {
        this.flowersInBouquet = flowersInBouquet;
    }

    public int getFlowersInBouquet() {
        return flowersInBouquet;
    }
}
