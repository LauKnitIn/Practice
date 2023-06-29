package gpt_provided;
import java.util.Scanner;
public class Array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner (System.in);//Creating Scanner
		//Print instruction to user
		System.out.println("-----Enter the amount of numbers to add up-----");
		
		int numAmount = keyboard.nextInt();//To know initialize the array
		
		int [] num = new int [numAmount];//Creating array and initializing it
		
		int len = num.length;//length of the array
		
		int total = 0;//To add the numbers in the array
		
		for(int position = 0; position < len; position++) {//To fill up the array
			System.out.println(" *Enter a desired number");//Print instruction
			int newNum = keyboard.nextInt();//Save the entered number 
			num[position]= newNum;//Save the number in the array
		}
		//Accessing array
		for(int access = 0; access < len; access++) {
			total+=num[access];//Accessing each position in the array and add it up to total 
		}
		//Print total
		System.out.println("Your total is -> " + total);
		
		keyboard.close();
	}

}

	