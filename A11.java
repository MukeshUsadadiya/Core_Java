class A11
{
	public static void main(String args[])
	{
		int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		
		if(a>b && a>c)
		{
			System.out.println("First Number is Max ");
		}
		else if(b>a && b>c)
		{
			System.out.println("Second Number is Max ")
		}
		else if (c>a && c>b)
		{
			System.out.println("Third Number is Max");
		}
		else 
		{
			System.out.println("More then One Number is Max");
		}
	}
}