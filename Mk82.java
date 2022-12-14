//UserDefine Exception Class 
class Mk82 extends Exception
{
	Mk82(String str)
	{
		System.out.println("Ecxeption Throw :"+str);
	}
	public static void main(String []args)
	{
		Mk82 a =new Mk82("Welcome");
		try
		{
			throw a;
		}
		catch(Exception e)
		{
			System.out.println("Exception Catch and Controlled BY :"+e);
		}
	}
}