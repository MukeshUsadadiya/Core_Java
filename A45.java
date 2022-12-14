//inheritance using Setval & Get Function
class A
{
	int a;
	private int b;
	void setval(int i,int j)
	{
		a=i;
		b=j;
	}
	int getb()
	{
		return b;
	}
}
class B extends A
{
	void sum()
	{
		System.out.println("Answer is :"+(a+getb()));
	}
}
class A45
{
	public static void main(String []args)
	{
		B b1=new B();
		b1.setval(10,20);
		b1.sum();
	}	
}