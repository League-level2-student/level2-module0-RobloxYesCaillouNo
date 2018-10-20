package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] arai = { "get", "adis", "adidos", "like", "bloxcon" };
		// 2. print the third element in the array
		System.out.println(arai[2]);
		// 3. set the third element to a different value
		arai[2] = "nope";
		// 4. print the third element again
		System.out.println(arai[2]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < arai.length; i++) {
			System.out.println(arai[i]);
		}
		// 6. make an array of 50 integers
		int[] num = new int[50];
		// 7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < num.length; i++) {
			int random = new Random().nextInt(50);
			num[i] = random;

		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
		int smallestNum = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] < smallestNum) {
				smallestNum = num[i];
			}
		}
		System.out.println(smallestNum);
		// 9 print the entire array to see if step 8 was correct
for (int i = 0; i < num.length; i++) {
	System.out.println(num[i]);
}
		// 10. print the largest number in the array.
		int largestNum = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > largestNum) {
				largestNum = num[i];
			}
	}
}
}