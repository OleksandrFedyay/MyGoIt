
public class Flower {
    private String flowerName;
    private String flowerColor;

    public Flower(String name, String color) {

        flowerName = name;
        flowerColor = color;
    }

    public String toString() {
        return flowerColor + " " + flowerName;
    }
    public String getFlowerName(){
        return flowerName;
    }

    public String getFlowerColor(){
        return flowerColor;
    }
}
