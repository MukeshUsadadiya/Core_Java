//inheritance using Setval Function 
class A
{
	int a,b;
	void setval(int i,int j)
	{
		a=i;
		b=j;
	}
}
class B extends A
{
	void sum()
	{
		System.out.println("Answer is :"+(a+b));
	}
}
class A42
{
	public static void main(String []args)
	{
		B b1=new B();
		b1.setval(10,20);
		b1.sum();
	}	
}