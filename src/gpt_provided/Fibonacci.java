package gpt_provided;
import java.util.Scanner;//Import Scanner
public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);//Creating Scanner
		//Instruction for input
		System.out.println("enter the term you wanna see the fibonacci succession up to");
		int [] succession = new int [input.nextInt()];//Creating and initializing array
		succession[0]=0;//Assigning default values of succession to start adding up
		succession[1]=1;
		/*Loop to add the numbers to the desired term
		 *of succession and add the to the array*/
		for(int i = 2; i < succession.length; i++) {
			succession[i] = succession[i-1] + succession [i-2];//Adding up the last two numbers in the array
		}
		for(int j = 0; j < succession.length; j++) {//Printing succession array
			System.out.println(succession[j]);
		}
		
		input.close();
	}

}
