
public class Application {

	public static void main (String[] args){
		
		Guitar myGuitar = new Guitar ("Guitar", "Bruun!");
		Piano myPiano = new Piano ("Piano", "Tralala!");
		Trumpet myTrumpet = new Trumpet ("Trumpet", "Tutututu!");
		MusicShop shop = new MusicShop ();
		
		myGuitar.displayMessage();
		myPiano.displayMessage();
		myTrumpet.displayMessage();
		shop.displaySale();
		
	}
}
