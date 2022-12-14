//input All data types using with argument and no return value 
import java.util.*;
class A22
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

		disp(a,b,c,d,e,nm);
	}
	public static void disp(int a,float b,char c,double d,boolean e,String nm)
	{
		
		System.out.println("---------------------");
		System.out.println("Integer Number is :"+a);
		System.out.println("Float Number  is :"+b);
		System.out.println(" Character is  :"+c);
		System.out.println("Double  is :"+d);
		System.out.println("String is :"+nm);
		System.out.println("Boolean is  :"+e);
	}
}