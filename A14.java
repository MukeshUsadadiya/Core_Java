//using Throws block ,without try catch block
import java.io.*;
class A14
{
	public static void main(String []args)throws IOException
	{
		InputStreamReader ir =new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		
		System.out.print("Enter First Number: ");
		int a=Integer.parseInt(br.readLine());
		System.out.print("Enter Second Number:");
		int b=Integer.parseInt(br.readLine());

		System.out.println("Total is :"+(a+b));
	}
}