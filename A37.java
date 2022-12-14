//Static Method and Static member
class Abc
{
	static int a=10;
	static int b=20;
	static int sum()
	{
		return a + b;
	}
}
class A37
{
	public static void main(String []args)
	{
		System.out.println("Answer is :"+Abc.sum());
	}
}