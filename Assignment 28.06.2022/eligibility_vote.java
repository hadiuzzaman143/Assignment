 /*
@Author Hadiuzzaman
*/

// Find eligible for vote or not.  (age>=18)


import java.util.Scanner;       // scanner package
public class eligibility_vote 
{

	public static void main(String[] args) 
    {   // main method
		
		Scanner scanner = new Scanner(System.in);   // create a scanner object
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();        // read user input
		if(age>=18) 
        {           // 1st condition
			System.out.println("You are eligible for vote.");
		}
		else 
        {                 // last condition
			System.out.println("You are not eligible for vote.");
		}

	}

}