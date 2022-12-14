//non-paramerized constructor 
class Abc
{
	int a;
	public Abc()
	{
		a=10;
	}
	void disp()
	{
		System.out.println("Value of A is :"+a);
	}
}
class A33
{
	public static void main(String []args)
	{
		Abc a1=new Abc();
		a1.disp();
	}
}