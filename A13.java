import java.io.*;
class A13
{
	public static void main(String args[])
	{
		try
		{
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			
			System.out.print("Enter First Number :");
			int a=Integer.parseInt(br.readLine());

			
			System.out.print("Enter Second  Number: ");
			int b=Integer.parseInt(br.readLine());
			
			System.out.println("Total is :" +(a+b));
		}
		catch(Exception e)
		{
			System.out.println("Exception is :"+e);
		}
	}
	
}