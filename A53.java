//Inner class 
class A
{
	private int a=10;
	class B
	{
		void disp()
		{
			System.out.println("Value of A is :"+a);
		}
	}
}
class A53
{
	public static void main(String []args)
	{
		A a1=new A();
		A.B b1=a1.new B();
		b1.disp();
	}
}