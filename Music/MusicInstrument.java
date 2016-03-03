
public class MusicInstrument {

	private String nameInstrument;
	private String sound;
	
	public MusicInstrument(String name){
		
		nameInstrument=name;
	}
	
	public void setSound (String instrumentSound){
		
		sound = instrumentSound;
	}
	
	public String getSound(){
		
		return sound;
	}
	public String getNameInstrument(){
		
		return nameInstrument;
	}
	public void displayMessage(){
		
		System.out.printf("This instrument is %s and it sounds like %s", nameInstrument, sound);
	}
}
