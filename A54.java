//Nested Class - Static Nested Class 
class A
{
	static private int a=10;
	static class B
	{
		void disp()
		{
			System.out.println("Value of A is :"+a);
		}
	}
}
class A54
{
	public static void main(String[]args)
	{
		A.B b1=new A.B();
		b1.disp();
	}
}