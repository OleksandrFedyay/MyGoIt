
public class Guitar {
	
	public static void main (String[] args){
		
		String guitarSound = "Bruuuuunnn!";
		
		MusicInstrument guitar = new MusicInstrument ("Guitar");
		
		guitar.setSound(guitarSound);
		guitar.displayMessage();
	}

}
