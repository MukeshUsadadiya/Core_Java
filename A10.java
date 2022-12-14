class A10
{
	public static void main(String args[])
	{
		int year;
		year=Integer.parseInt(args[0]);
	
		if (year % 4 ==0)
		{
			System.out.println(" leap year");
		}
		else
		{
			System.out.println("Not leap Year");
		}
	}
}