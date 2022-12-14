import java.io.*;
class A12
{
	public static void main(String args[])
	{
		try
		{
	
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			
			System.out.print("Enter Your Name:");
			String nm=br.readLine();
			
			System.out.println("Your Name is :" +nm);
		}
		catch(Exception e)
		{
			System.out.println("Exception is :"+e);
		}
	}
	
}