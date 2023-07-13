package gpt_provided;
import java.util.Scanner;
public class Maximum_number {
public static void main(String[] args) {
		
		Scanner numInput = new Scanner (System.in);//Creating Scanner
		
		System.out.println("Enter the amount of numbers to compare");
		
		int compareAmount = numInput.nextInt();
		
		int [] numArray = new int [compareAmount];//Initializing int Array
		
		//Filling in array
		for (int arrayPos = 0; arrayPos < numArray.length; arrayPos++) {
			
			 System.out.println("Enter the desired value");//Print instruction
			 int toAdd = numInput.nextInt();//Save entered value
			 numArray[arrayPos] = toAdd;//Adding entered value to array
		}
		
		//Arranging the list
		int aux = 0; //Will help to empty and save one number on the array to swap numbers
		
		//For loop to array all elements not only the consequent ones
		for(int repetition = 0; repetition < numArray.length; repetition++) {
			//For loop to compare positions and swap numbers in the array
			for(int position = 0; position < numArray.length; position++) {
				if(position+1<=numArray.length-1) {//Making sure to access an existing position
					if(numArray[position]<numArray[position+1]) {//To sort by greatest to smallest
						aux = numArray[position];//Save the actual value to empty that position
						/*The emptied position takes the
						 *value of next position and empties it*/
						numArray[position]= numArray[position+1];
						numArray[position+1] = aux;//The empty position takes the value saved
					}
				}	
				
			}
		}
		System.out.println("The greatest number is -> " + numArray[0]);//Print greatest number	
		
		numInput.close();
	}

}