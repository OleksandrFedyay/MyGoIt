
public class Flower {

	private String flowerName;
	private String flowerColor;
	
	public Flower (String name, String color){
		
		flowerName = name;
		flowerColor = color;
	}
	
	public void displayFlower(){
		System.out.printf("The %s is %s\n", flowerName, flowerColor);
	}
}
