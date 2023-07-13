package gpt_provided;
import java.util.Scanner;//Importing Scanner
public class FizzBuzz {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);//Creating Scanner for data input
		System.out.println("Enter the number you want to see up to");//Instruction for user
		int num = input.nextInt();//To know when to stop
		for(int i = 1; i <= num; i++ ) {//To check each number up to the one given
			if(i%3 == 0&& i%5== 0) {//First check if divisible by both five and three
				System.out.println("FizzBuzz");//If so print FizzBuzz
			}
			else if(i%3==0) {//If not check if divisible only by three
				System.out.println("Fizz");//Print Fizz if so
			}
			else if(i%5==0) {//If not check if divisible by five
					System.out.println("Buzz");//If so print Buzz
			}else {//In last instance print the current number
				System.out.println(i);
			}
			input.close();//Closing Scanner
		}
	}

}
