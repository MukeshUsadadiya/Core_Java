//scanner class using utility package 
import java.util.*;
class A20
{
	public static void main(String[]args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter Number :");
		int no=s1.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Number is :"+i);	
		}
	}
}