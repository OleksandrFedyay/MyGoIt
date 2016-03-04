
public class File {

	private String fileType;
	
	public File (String name){
		fileType=name;
	}
	
	public void displayFile(){
		
		System.out.printf("This is file of %s type.\n", fileType);
	}
	
}
