import java.util.Scanner;

/*One classic method for composing secret message is called a Square code. 
 * The spacesare removed from the english text and the characters are written into a square or rectangle. 
For example the sentence "If man was meant to stay on the ground god would have given us roots" 
is 54 characters long. So it is written into a rectangle with 7 rows and 8 columns. 

ifmanwas 
meanttos 
tayonthe 
groundgo 
dwouldha 
vegivenu 
sroots

 */

import java.io.*;

public class Test2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	System.out.println("Enter the sentence");	
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String sentence = in.readLine();	
	
	sentence = sentence.toLowerCase();
	sentence = sentence.replaceAll(" ", "");
	
	int stringLength = sentence.length();
	
	String sentence1 = null;
	
	for(int i = 0 ; i< stringLength; i=i+8){
			if(stringLength-i >= 8)
				{
					sentence1 = sentence.substring(i, i+8);
				}
			else
			{
				sentence1 = sentence.substring(i, stringLength);
			}
			
			System.out.println(sentence1);
		}
	
	
	}

}
