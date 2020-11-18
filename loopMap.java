package loopMap;
import java.util.Scanner;
import java.util.ArrayList;

public class LoopMap {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
	
		System.out.println("Enter 5 numbers");
		
		//Create array
		ArrayList<Integer> userNumbers = new ArrayList<Integer>();
		
		//Have user enter 5 numbers into array
		int userNum;
		for (int i = 1; i < 6; i++) { //sets parameters for 5 numbers
			userNum = Integer.parseInt(Input.nextLine()); //turns string into number from input on next line and sets it to variable defined earlier
			userNumbers.add(userNum); //adds these numbers to our array
		}
		
		System.out.println("Your array is: " + userNumbers);
		
		//Find max value in array
		int max = Integer.MIN_VALUE;	//gets the smallest possible number available in Java
		for (int i = 0; i < userNumbers.size(); i++) {
			if (userNumbers.get(i) > max) { //says if the number in userNumbers[i] is > the smallest number in Java
				max = userNumbers.get(i); //then set the new smallest number as userNumbers[i]
			}
		}
		
		System.out.println("The greatest number in your array is: " + max);
		
		//Find the min value in array
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < userNumbers.size(); i++) {
			if (userNumbers.get(i) < min) {
				min = userNumbers.get(i);
			}
		}
		
		System.out.println("The smallest number in your array is: " + min);
		
		//Find the sum of values in array
		int sum = 0; //defines variable sum with value of 0
		for (int i = 0; i < userNumbers.size(); i++) { //for loop i starts at 
			sum += userNumbers.get(i);
		}
		
		System.out.println("The sum of the numbers in your array is: " + sum);
		
		//Find the product of values in array
		int prod = 1; //can't make 0 because don't want to multiply by 0
		for (int i = 0; i < userNumbers.size(); i++) {
			prod *= userNumbers.get(i);
		}
		
		System.out.println("The product of the numbers in your array is: " + prod);
	}
}
