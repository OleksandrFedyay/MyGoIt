
public class Application {
	
public static void main (String[] args){
	
	Rose rose = new Rose("Rose", "Red");
	Camomile camomile = new Camomile ("Camomile", "White");
	Astra astra = new Astra ("Astra", "Pink");
	RoseBush rosebush = new RoseBush ("Rosebush", "Red");
	Tulip tulip = new Tulip ("Tulip", "Yellow");
	Bouquet bouquet = new Bouquet ();
	
	rose.displayFlower();
	camomile.displayFlower();
	astra.displayFlower();
	rosebush.displayFlower();
	tulip.displayFlower();
	bouquet.displayContent();
}
}
