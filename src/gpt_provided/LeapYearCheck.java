package gpt_provided;
import java.util.Scanner;
public class LeapYearCheck {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in); //Creating a scanner to make use of 
		System.out.println("Enter the year to verify");
		int year = input.nextInt();//Variable to save the year, user wants to verify

		/*list of divisors to
		 *verify leap year
		 *saved in variables*/
		
		int verifyFour = 4; // check divisible by four
		int verifyHundred = 100; // check divisible by one hundred
		int verifyFourHundred = 400; // check divisible by four-hundred
		
		if(year % verifyFour == 0) { // conditional to verify divisible by four
			if(year % verifyHundred != 0) { // if so, verifies that its no divisible by one-hundred
				//prints
				System.out.println("it is a leap year");
			}else { // otherwise prints
				System.out.println("It is not a leap year");
			}
		//in case not, checks divisible by four-hundred	
		}else {
			if(year % verifyFourHundred == 0) { //if so prints 
				System.out.println("It is a leap year");
			}else { // otherwise
				System.out.println("It is not a leap year");
			}
		}
		input.close(); //closing Scanner
	}
}

