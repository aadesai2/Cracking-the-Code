import java.util.Scanner;


public class Test5 {
	public static void main(String[] args)  {
		
		System.out.println("Enter 2 numbers"); // 19967 and 1000
		Scanner sc1 = new Scanner(System.in);
		int num1 = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		int num2 = sc1.nextInt();
		
		maxHalves(num1,num2);
		
	}
	
	public static void maxHalves(int i, int j) {
		int firstValue, secondValue;

		int iLength = String.valueOf(i).length();
		int jLength = String.valueOf(j).length();

		if (iLength - jLength == 1) {
			firstValue = i / j;
			secondValue = i - firstValue * j;
			System.out.println("First Value:- " + firstValue
					+ " second Value:- " + secondValue);
		} else {
			System.out.println("Invalid Input");
		}

	}
	
}
