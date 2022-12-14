//inheritance using with super keyword second Method 
class A 
{
	int a;
}
class B extends A
{
	private int b;
	B(int i,int j)
	{
		super.a=i;;
		b=j;
	}
	void sum()
	{
		System.out.println("Answer is :"+(a+b));
	}
}
class A44
{
	public static void main(String []args)
	{
		B b1=new B(10,20);
		b1.sum();
	}
}