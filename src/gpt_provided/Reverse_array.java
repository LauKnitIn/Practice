package gpt_provided;
import java.util.Scanner;//Import scanner to make use of
public class Reverse_array {

	public static void main(String[] args) {

		Scanner arrayInput = new Scanner(System.in); //Creating scanner
		//Ask for the length of the array to be entered
		System.out.println("enter the amount of numbers contained in the list");
		//Assign the length to a variable  
		int len = arrayInput.nextInt();
		//Initializing the array
		int [] numList = new int [len];
		//Asking and assigning the numbers of the array
		int aux = 0;//Variable to use bubble sort to swap
		for(int position = 0; position < len; position++) {
			//Asking for the numbers contained in the array to re-arrange
			System.out.println("enter one by one the numbers of your list");
			numList[position] = arrayInput.nextInt();
		}
		for(int i = 0; i < len; i++) {	//To control repetition
			for(int j = len-1; j > i; j--) {//To swap elements in the array
				aux = numList[j];//Saves the desired element to swap to empty the "box"
				//In the emptied position adds the number before it emptying that "box"
				numList[j] = numList[j-1];
				numList[j-1] = aux;//The fills the position before the actual with the saved value 
			}
		}

		//Prints re-arranged array
		for(int i = 0; i < len; i++) {
			System.out.println(numList[i]);
		}
		arrayInput.close();
	}
}
