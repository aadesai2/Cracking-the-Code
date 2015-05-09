/*Write a method to replace all spaces in a string with'%20'. You may assume that
the string has sufficient space at the end of the string to hold the additional
characters, and that you are given the "true" length of the string. (Note: if implementing
in Java, please use a character array so that you can perform this operation
in place.)
EXAMPLE
Input: "Mr John Smith
Output: "Mr%20Dohn%20Smith"*/

package ArraysAndStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReplacer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Enter String");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String string1 = in.readLine();
		System.out.println(spaceReplacer(string1));
	}

	public static StringBuilder spaceReplacer(String string1) {
		StringBuilder newString = new StringBuilder();
		for (int i = string1.length() - 1; i >= 0; i--) // Enter the characters
														// of the string in a
														// new string in reverse
		{
			if (string1.charAt(i) == ' ') // if a space is found substitute it
											// by a "02%"
				newString.append("02%");
			if (string1.charAt(i) != ' ') // only add the characters to the new
											// String unless you find a space
				newString.append(string1.charAt(i));
		}
		newString.reverse(); // reverse the new String to get the result
		return newString;
	}
}
