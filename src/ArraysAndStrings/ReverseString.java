//Implement a function void reverse(char* str) in C or C++ which reverses a null-terminated string.
package ArraysAndStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the sentence");	
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String sentence_string = in.readLine();
		
		StringBuilder sentence = new StringBuilder();
		sentence.append(sentence_string);
		
		System.out.println(reverse(sentence));
			

	}
	
	public static StringBuilder reverse(StringBuilder sentence){
		StringBuilder newSentence = new StringBuilder();
		for(int i=sentence.length()-1;i>=0;i--)			//Start from the end of the orignal string and fill the new StringBuilder.
			newSentence.append(sentence.charAt(i));
			
		return newSentence;
	}

}
