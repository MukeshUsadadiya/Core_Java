//return 
class MaxVal
{
	int findMax(int a,int b)
	{
		if(a>b)
		{
			return 1;	
		}
		else 
		{
			return 0;
		}
	}
}
class A27
{
	public static void main(String [] args)
	{
		MaxVal m1=new MaxVal();
		int a=50,b=40;
		
		int ans=m1.findMax(a,b);
		if(ans==1)
		{
			System.out.println("First Number is Max");
		}
		else
		{
			System.out.println("Second Number is Max");
		}
	}
}