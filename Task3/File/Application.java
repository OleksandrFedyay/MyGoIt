
public class Application {
public static void main (String[] args){
	Audio audioFile = new Audio ("Audio");
	Image imageFile = new Image ("Image");
	Text textFile = new Text ("Text");
	Directory dir = new Directory();
	
	audioFile.displayFile();
	imageFile.displayFile();
	textFile.displayFile();
	dir.displayDir();
}
}
