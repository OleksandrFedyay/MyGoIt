
public class File {

	private String fileName;
	
	public File (String name){
		fileName=name;
	}
	
	public String getFileName(){
		return fileName;
	}
	public void display(){
		
		System.out.printf("Это файл типа - %s", fileName);
	}
	
}
