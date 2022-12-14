//input All data types using Scanner class 
import java.util.*;
class A21
{
	public static void main(String []args)
	{
		Scanner s1=new Scanner(System.in);
		int a;
		float b;
		char c;
		double d;
		boolean e;
		String nm;
		
		System.out.print("Enter Integer Number :");
		a=s1.nextInt();
		System.out.print("Enter Float Number :");
		b=s1.nextFloat();
		System.out.print("Enter Character :");
		c=s1.next().toCharArray()[0];
		System.out.print("Enter Double :");
		d=s1.nextDouble();
		System.out.print("Enter String :");
		nm=s1.next();
		System.out.print("Enter Boolean :");
		e=s1.nextBoolean();
	}
}