
public class Piano {

public static void main (String[] args){
		
		String pianoSound = "Tralala!";
		
		MusicInstrument piano = new MusicInstrument ("Piano");
		
		piano.setSound(pianoSound);
		piano.displayMessage();
	}

}