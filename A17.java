//create console object 
import java.io.*;
class A17
{
	public static void main(String args[])
	{
		Console c1=System.console();
		System.out.print("Enter First Number:");
		int a=Integer.parseInt(c1.readLine());
		
		System.out.print("Enter Second Number:");
		int b=Integer.parseInt(c1.readLine());
		
		int c=a+b;
		
		System.out.println("Total is :"+c);
	}
}