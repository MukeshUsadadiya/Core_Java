//Output Stream Writer
import java.io.*;
class A83
{
	public static void main(String []args)
	{
		String data ="This is a Example of Output Stream Writer";
		try
		{
			FileOutputStream file=new FileOutputStream ("output.txt");
			OutputStreamWriter output=new OutputStreamWriter(file);
			
			output.write(data);
			output.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}
}