/*Implement a method to perform basic string compression using the counts  of repeated characters. 
 * For example, the string aabcccccaaa would become a2blc5a3. 
 * If the "compressed" string would not become smaller than the original string, your method should return the original string.*/
		
package ArraysAndStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringCompressor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Enter String");	
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String string1 = in.readLine();
		System.out.println(basicStringCompressor(string1));
		
	}
	
	public static StringBuilder basicStringCompressor(String string1){
		StringBuilder newString = new StringBuilder();
		int count =1;
		for(int i=0;i<=string1.length()-2;i++){
			
			if(string1.charAt(i) == string1.charAt(i+1)){
				int count_repeated = 1;
				while(string1.charAt(i)==string1.charAt(i+1)){
					count_repeated++;
					i++;
				}
				newString.append(string1.charAt(i)+""+count_repeated);
			}
			
			newString.append(string1.charAt(i)+""+count);
		}
		return newString;
	}

}
