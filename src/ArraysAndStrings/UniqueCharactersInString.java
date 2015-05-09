//Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
package ArraysAndStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UniqueCharactersInString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Enter the sentence");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String sentence = in.readLine();
		if (uniqueChecker(sentence) == false)
			System.out
					.println("The string does not contain unique characters.");
		else
			System.out.println("The string contains unique characters.");

	}

	public static boolean uniqueChecker(String sentence) {
		if (sentence.length() > 256) // If length of array > 256 --> not unique
			return false;
		else if (sentence.length() == 1) // If length of array = 1 --> unique
			return true;
		else if (sentence.length() == 2) // If length of array = 2 --> check the
											// 1st and 2nd character for
											// uniqueness
		{
			if (sentence.charAt(0) == sentence.charAt(1))
				return false;
		} else {
			for (int i = 0; i < sentence.length() - 1; i++) // check each char
															// with it's next
															// list of
															// characters,
															// anywhere the same
															// character is
															// encountered, the
															// string is not
															// unique
			{

				for (int j = i + 1; j <= sentence.length() - 1; j++) {
					if (sentence.charAt(i) == sentence.charAt(j))
						return false;
				}

			}
		}
		return true;
	}

}
