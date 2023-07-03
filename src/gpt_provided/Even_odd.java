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
		//Actual program
		if(num%2 == 0) {
			System.out.println("the entered number is even");
		}else {
			System.out.println("the entered number is odd");
		}	
		input.close();//Closing Scanner
	
	}

}
