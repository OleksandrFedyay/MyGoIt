
public class MusicInstrument {

	private String nameInstrument;
	
	
	public MusicInstrument(String name){
		
		nameInstrument=name;
	}

	
	interface Play{
		
	public void displayMessage();
	}
	
	
	 
	public static class Guitar extends MusicInstrument implements Play{
		
		String guitarSound;
		String name1;
		
		public Guitar (String name, String sound){
			super(name);
			name1 = super.nameInstrument;
		    guitarSound = sound;	
		}
		
		
		public void displayMessage(){
			
			System.out.printf("This instrument is %s and it sounds like %s\n", name1, guitarSound);
		}
			
		}
	
	
	
    public static class Piano extends MusicInstrument implements Play{
		
		String pianoSound;
		String name2;
		
		public Piano (String name, String sound){
			super(name);
			name2 = super.nameInstrument;
		    pianoSound = sound;	
		
		}

		public void displayMessage(){
			
			System.out.printf("This instrument is %s and it sounds like %s\n", name2, pianoSound);
		}
			
		}
 
    
    
    public static class Trumpet extends MusicInstrument implements Play{
		
		String trumpetSound;
		String name3;
		public Trumpet (String name, String sound){
			
		    super(name);
		    name3 = super.nameInstrument;
		    trumpetSound = sound;	
		
		}
		
		
		
		
		public void displayMessage(){
			
			System.out.printf("This instrument is %s and it sounds like %s\n", name3, trumpetSound);
		}
			
		}
    
    
    public static class MusicShop implements Sale{
    	
    	public void displaySale(){
    		
    		System.out.println("This Music Shop sales instruments.");
    	}
    	
    }
    
    
    interface Sale{
    	public void displaySale();
    } 
    
    
    public static void main (String[] args){
    
    	Guitar myGuitar = new Guitar ("Guitar", "Bruuuun!"); 
    	myGuitar.displayMessage();
    	
    	Piano myPiano = new Piano ("Piano", "Tralala!");
    	myPiano.displayMessage();
    	
    	Trumpet myTrumpet = new Trumpet ("Trumpet", "Tututu!");
    	myTrumpet.displayMessage();
    	
    	MusicShop shop = new MusicShop();
    	shop.displaySale();
    	
    	
    }
	}


