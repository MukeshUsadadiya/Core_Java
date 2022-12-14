//Single Inheritance 
class A
{
	public void dispA()
	{
		System.out.println("Class A");
	}
}
class B extends A
{
	public void dispB()
	{
		System.out.println("Class B ");
	}
}
class A41
{
	public static void main(String[]args)
	{
		B b1=new B();
		b1.dispA();
		b1.dispB();
	}
}