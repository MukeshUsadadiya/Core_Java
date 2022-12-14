//Abstract Class 
abstract class intrest
{
	abstract int intrest();
	void disp()
	{
		System.out.println("Welcome ");
	}
}
class SBI extends intrest 
{
	int intrest()
	{
		return 7;
	}
}
class BOB extends intrest
{
	int intrest()
	{
		return 8;
	}
}
class A56
{
	public static void main(String[]args)
	{
		intrest i1;
		i1=new SBI ();
		System.out.println("Rate of Intrest is :"+i1.intrest());
		i1=new BOB();
		System.out.println("Rate of Intrest is :"+i1.intrest());
	}
}