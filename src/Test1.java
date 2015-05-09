/*

Given a 1D array with integers,print vertical bars of # such that if a[i] = n, 
then print # n times from the bottom. 

For eg, {1,4,3,2} 

o/p : 
# 
# # 
# # # 
# # # #
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList inputArray = new ArrayList();
		
		System.out.println("Enter size of the integer array");
		Scanner sc1 = new Scanner(System.in);
		int sizeOfArray = sc1.nextInt();
		
		System.out.println("Enter the elements of the integer array");
		for(int i = 0;i<sizeOfArray;i++){
			Scanner sc2 = new Scanner(System.in);
			inputArray.add(sc2.nextInt());
			}
		
		Collections.sort(inputArray);
	
		//System.out.println(inputArray);
		for(int i = 0; i<sizeOfArray; i++)
		{
			int k = (int) inputArray.get(i);
			for(int j = 0; j<k; j++)
			{
				System.out.print("#");
			}
		System.out.println("");
		}
		
		}
}
