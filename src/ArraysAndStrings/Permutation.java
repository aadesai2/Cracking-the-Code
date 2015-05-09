//Given two strings, write a method to decide if one is a permutation of the other.
//Assumption blank spaces and case sensitive characters not included
package ArraysAndStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Permutation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Enter String 1");	
		BufferedReader in1 = new BufferedReader(new InputStreamReader(System.in));
		String string1 = in1.readLine();
		
		System.out.println("Enter String 2");	
		BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));
		String string2 = in2.readLine();
		
		
		if(checkPermutation(string1,string2) == true)
			System.out.println("String 1 is a permutation of string 2");
		else
			System.out.println("String 1 is not a permutation of string 2");
	}

		public static boolean checkPermutation(String string1, String string2){
			if(string1.length() != string2.length())  //If length of both strings are not equal, they are not permutations of each other
				return false;
			else
			{
				//Convert Strings to character arrays
				char [] char_1 = string1.toCharArray(); 
				char [] char_2 = string2.toCharArray();
				
				//Sort the character arrays
				Arrays.sort(char_1);
				Arrays.sort(char_2);
				
				//Convert the character arrays back to strings
				String newString1 = new String(char_1);
				String newString2 = new String(char_2);
				
				//Compare the sorted strings
				if(newString1.equals(newString2))
					return true;
				else 
					return false;
			}
		}
}
