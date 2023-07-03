package gpt_provided;
import java.util.Scanner;
public class Even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);//Create Scanner 
		/*Print message asking
		 for the number*/
		System.out.println("write the number you would like to check");
		int num = input.nextInt();//Save the number to check
		int numberBefore = num-1; //To know where to stop division
		
		//Actual program
		
		/* For cycle to know if a number is divisible
		 * by any number besides itself and one*/
		
		for (int divisor = 2; divisor <= numberBefore; divisor++) {
			int MODresult = num%divisor; //To know the remainder of the operation
			if (MODresult == 0) {//if the remainder is 0
				System.out.println("The number is even");//then the number is even
				break;//Breaks the cycle cause there is no need to check for the rest of numbers
			}else{ // else checks if the remainder is different of zero
				if(MODresult != 0) {
					System.out.println("The number is odd"); //If so the number is odd
					break;//Breaks the cycle cause there is no need to check for the rest of numbers
				}
			}
			
		}input.close();//Closing Scanner
	
	}

}
