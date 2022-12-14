//paramerized constructor 
class Abc
{
	int a;
	public Abc(int i)
	{
		a=i;
	}
	void disp()
	{
		System.out.println("Value of A is :"+a);
	}
}
class A34
{
	public static void main(String []args)
	{
		Abc a1=new Abc(10);
		a1.disp();
	}
}