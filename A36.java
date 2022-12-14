//overload Method 
class Abc
{
	int sum(int a)
	{
		return a+a;
	}
	int sum (int a,int b)
	{
		return a+b;
	}
	int sum (int a,int b,int c)
	{
		return a+b+c;
	}
}
class A36
{
	public static void main(String []args)
	{
		Abc a1=new Abc();
		int ans;
		//ans =a1.sum(10);
		System.out.println("Answer is :"+a1.sum(10));
		//ans =a1.sum(10,20);
		System.out.println("Answer is :"+a1.sum(10,20));
		//ans =a1.sum(10,20,30);
		System.out.println("Answer is :"+a1.sum(10,20,30));
		
	}
}