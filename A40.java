//Finally Block
import java.io.*;
class A40
{
	public static void main(String args[])
	{
		try
		{
			int no[]=new int[3];
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			
			System.out.print("Enter First Number :");
			int a=Integer.parseInt(br.readLine());

			
			System.out.print("Enter Second  Number: ");
			int b=Integer.parseInt(br.readLine());
			
			System.out.println("Total is :" +(a/b));
			System.out.println("value of no[2] is :"+no[2]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception is :"+e);
		}
		catch(IOException e)
		{
			System.out.println("Exception is :"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception is :"+e);
		}
		catch(Exception e)
		{
			System.out.println("Exception is :"+e);
		}
		finally
		{
			System.out.println("This is Finally Block ");
		}
	}
	
}