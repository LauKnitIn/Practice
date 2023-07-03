package gpt_provided;
import java.util.Scanner;//Importing Scanner
public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner input= new Scanner (System.in);//Creating scanner
		System.out.println("Enter the number you'd like to check");//Instruction message
		int checkNum = input.nextInt();//Saving the number to verify 
		int result = 1;//initializing result variable at the common divisor
		
		//To know the divisors of a number
		for(int divisors = 2; divisors < checkNum; divisors++) {
			int remainder = checkNum % divisors;//To know if a number is divisor or not
			if(remainder == 0) {//If so
				result += divisors;//Add them up
			}
		}
		//If the sum of the divisors equals the entered number
		if(result == checkNum) {
			System.out.println("The input number is perfect");
		}else {//If it doesn't
			System.out.println("The input number is not perfect");
		}
		input.close();
	}
}
