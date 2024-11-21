import java.util.Scanner;

public class IT24104377Lab5Q2{

	public static void main(String[] args){

		// Declare variables
		int numMembers;
		
		// Create a scanner object to read input
		Scanner scanner = new Scanner(System.in);
		
		// Prompt user for input
		System.out.print("Enter the number of new members introduced: ");
		numMembers = scanner.nextInt();
		
		// Determine the price based on the number of new members 
		switch (numMembers) {
			
			case 0:
			System.out.println();
			System.out.println("No prize.");
			
					break;
			
			case 1:
			System.out.println();
			System.out.println("Prize is a : Pen.");
					 
					 break;
					 
			case 2:
			System.out.println();
			System.out.println("Prize is a : Umbrella.");
			
					break;
			
			case 3:
			System.out.println();
			System.out.println("Prize is a : Bag.");
			
					break;
			
			case 4:
			System.out.println();
			System.out.println("Prize is a : Travelling Chair.");
				
					break;
			
			default:
			if (numMembers >= 5){
				System.out.println();
				System.out.println("Prize is a : Headphone.");	
			}
			
			else {
				// Invalid input (Negative Number) 
				System.out.println(" Input must be a number 0 or greater.");				
			}
		
					break;
		}
		
	}
	
}