//command line
class A3
{
	public static void main(String args[])
	{
		int i,tot=0;
		for (i=0;i<args.length;i++)
		{
			System.out.println("Number is :" +args[i]);
			tot=tot +Integer.parseInt(args[i]);
		}
		System.out.println("Total is :" +tot);
	}
}