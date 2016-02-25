import java.util.Scanner;

public class Analisys {

	public static void main (String [] args) {
		
		int studentCounter = 1;
		int passes = 0;
		int failures = 0;
		int result;
		
		Scanner input = new Scanner (System.in);
		
		while (studentCounter <= 10)
		
		{
			System.out.println("Enter result 1 = passes, 2 = failures: ");
			
			result = input.nextInt();
			
			if (result == 1) 
				
				passes = passes + 1;	
		
			else
				
				failures = failures + 1;
			
			studentCounter = studentCounter + 1;
		}
		
		System.out.printf("Total passes %d\nTotal failures %d\n",passes, failures);
		
		if (passes >= 8)
			
			System.out.println("Bonus to instructor");
		input.close();
	} 
}
