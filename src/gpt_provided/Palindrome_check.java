package gpt_provided;
import java.util.Scanner;
public class Palindrome_check {

	public static void main(String[] args) {
		
		Scanner  textInput = new Scanner(System.in);// Create Scanner to input data
		
		System.out.println("Enter the text you would like to check");//Print instruction
		String originalWord = textInput.nextLine();//To save the text
		int letterCount = originalWord.length();//To know the amount of characters in text
		String newWord = ""; //Will save the formed word when putting the letters backwards
		
		while(letterCount != 0) {//While cycle to take out of the text each letter
			//Variable saving letters subtracted from last to first one by one
			String letter = originalWord.substring(letterCount-1, letterCount);
			letterCount= letterCount-1;//Subtract to letterCount variable to later break cycle
			newWord = newWord + letter;//Adds the letter subtracted to the new word being formed
		}
		if(newWord.equals(originalWord)) {//Compares the formed word with the entered one 
			System.out.println("It is a palindrome!!");//If they're the same prints
		}else {//If they're not the same prints
			System.out.println("It is not a palindrome =(");
		}
		textInput.close(); //Closing Scanner
	}	
}
