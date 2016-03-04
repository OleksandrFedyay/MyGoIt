
public class MusicInstrument {

	private String nameInstrument;
	private String sound;
	
	public MusicInstrument(String name, String soundOfInstrument){
		
		nameInstrument = name;
		sound = soundOfInstrument;
	
	}
	
	public String getName(){
		
		return nameInstrument;
	}
	public void displayMessage(){
		
		System.out.printf("This instrument is %s and it sounds like %s\n", nameInstrument, sound);
	}
		
	}

	


