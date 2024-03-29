package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
	String[] s =new String[5];
		//2. print the third element in the array
		System.out.println(s[2]);
		//3. set the third element to a different value
		s[2]="f";
		//4. print the third element again
		System.out.println(s[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		//6. make an array of 50 integers
		int[] in = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < in.length; i++) {
			Random r = new Random();
			
			in[i]=r.nextInt();
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest =Integer.MAX_VALUE;
		for (int i = 0; i <in.length; i++) {
			if(in[i]<smallest) {
				smallest=in[i];
			}
			
		}
		System.out.println(smallest);
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i <in.length; i++) {
			System.out.println(i);
			}
		//10. print the largest number in the array.
		int biggest =Integer.MIN_VALUE;
		for (int i = 0; i <in.length; i++) {
			if(in[i]>biggest) {
				biggest=in[i];
			}
			
		}
		System.out.println(biggest);
	}
}
