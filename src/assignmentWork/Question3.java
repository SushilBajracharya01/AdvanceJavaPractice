package assignmentWork;

import java.util.*;

/*
 * Question 3: 
 * An array is defined to be inertial if the following conditions hold:
	 a. it contains at least one odd value
	 b. the maximum value in the array is even
	 c. every odd value is greater than every even value that is not the maximum value. 

	So {11, 4, 20, 9, 2, 8} is inertial because 
	 a. it contains at least one odd value
	 b. the maximum value in the array is 20 which is even
	 c. the two odd values (11 and 9) are greater than all the      
	    even values that are not equal to 20 (the maximum), i.e., (4, 2, 8}. 
	 Write a function called isIntertial that accepts an integer array and returns 1 if the array is inertial; otherwise it returns 0.
		The function signature is 
			int isInertial(int[ ] a) 

 * @author Sushil
*/

public class Question3 {

	// maxValArray returns maximun value item of the array.
	static int maxValArray(int[] a) {
		int temp;

		for (int i = 0; i < a.length; i++) {
			if (a[0] < a[i]) {
				temp = a[i];
				a[i] = a[0];
				a[0] = temp;
			}
		}

		return a[0];
	}

	// isEven function returns 1 is the number is even else it returns 0.
	static int isEven(int num) {
		if (num % 2 == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	// oddValArray makes an ArrayList of odd numbers and returns the ArrayList.
	static ArrayList<String> oddValArray(int[] a) {
		ArrayList<String> odd = new ArrayList<String>();
		for (int i = 0; i < a.length; i++) {
			if (isEven(a[i]) == 0) {
				odd.add(Integer.toString(a[i]));
			}
		}
		return odd;
	}

	
	static int oddEvenCompare(ArrayList<String> oddArr, int[] Arr) {
		// counter is increased by 1 if the odd number is less than even numbers.
		// odd number can only be less than even number once, i.e the max number.
		// if counter is greater than 1 than odd number is not greater than every even value.
		int counter=0; 
		for (int i=0; i < oddArr.size(); i++) {
			counter = 0;
			for(int j=0; j < Arr.length; j++ ) {	
				if( isEven(Arr[j])==1 ) {
					if ( Integer.parseInt(oddArr.get(i)) < Arr[j] ) {
						counter++;
					}
				}
				
			}
		}
		if(counter == 1) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	// isInertial checks 
	// 			if the max number is even
	// 				if there is >= 1 odd number
	// 					if the odd number is greater than other even number except max number.
	//
	static int isInertial(int[] a) {
		int oddEven;
		ArrayList<String> oddAr = new ArrayList<String>();
		
		int max = maxValArray(a);
		
		if (isEven(max)==1) {
			oddAr = oddValArray(a);
			if(oddAr.size() > 0) {
				oddEven= oddEvenCompare(oddAr, a);
				if(oddEven == 1) {
					System.out.println("The array is inertial");
					return 1;
				}
				else {
					System.out.println("The array is not inertial because array consist odd numbers that is less than other even numbers");
					return 0;
				}
			}
			else {
				System.out.println("The array is not inertial because array doesnot have any odd numbers.");
				return 0;
			}
		}
		else {
			System.out.println("The array is not inertial because the greatest number in array is odd.");
			return 0;
		}
	}

	public static void main(String[] args) {
		int[] testArr = {11, 4, 20, 9, 2, 8};
		isInertial(testArr);
	}

}
