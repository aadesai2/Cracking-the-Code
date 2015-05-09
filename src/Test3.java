
import java.util.LinkedList;
import java.util.Scanner;

/* In a single pass, find Nth node from last in a Linked List. 
{ N can be any value. }*/

public class Test3 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		LinkedList l1 = new LinkedList();
		for(int i=0;i<=19;i++)
			l1.add(i);
		
		System.out.println(l1);
		System.out.println("--------------------");
		
		System.out.println("Enter value of n");

		Scanner sc1 = new Scanner(System.in);
		int valueOfN = sc1.nextInt();
	
		int a = l1.lastIndexOf(l1.getLast()) - l1.lastIndexOf(l1.get(valueOfN)) ;
		System.out.println(a);

	}

}
