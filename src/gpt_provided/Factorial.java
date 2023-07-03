package gpt_provided;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number you wanna know the factorial of");//Print instruction
		int num = input.nextInt();//Save given number
		int result = 1;//Initializing variable in 1 to multiply properly
		
		//Loop that goes from one to target number
		for(int multiplier = 1; multiplier <= num; multiplier++ ) {
			result = result * multiplier;//Multiplying result by each number on the iteration
		}
		System.out.println(num + "!" + " ---> " + result);//Printing result
		
		input.close();//Closing Scanner
	}

}
