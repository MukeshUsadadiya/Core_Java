//using console class print All arithmetic operator
import java.io.*;
class A16
{
	public static void main(String args[])
	{
		System.out.print("Enter First Number:");
		int a=Integer.parseInt(System.console().readLine());
		
		System.out.print("Enter Second Number:");
		int b=Integer.parseInt(System.console().readLine());


		System.out.println("Plus is :"+(a+b));
		System.out.println("Minus is :"+(a-b));
		System.out.println("Multiply is :"+(a*b));
		System.out.println("Divide is :"+(a/b));
	}
}