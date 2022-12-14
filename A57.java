//final Class  
//NOTE :- it can not be Inheritance 
final class A
{
	final void disp1()
	{
		System.out.println("Disp 1");
	}
}
class B 
{
	int intrest1()
	{
		return 7;
	}
}
class C extends B
{
	int intrest()
	{
		return 8;
	}
}
class A57
{
	public static void main(String[]args)
	{
		A a1=new A();
		a1.disp1();
		C c1=new C();
		System.out.println("Rate of Intrest is :"+c1.intrest1());
		System.out.println("Rate of Intrest is :"+c1.intrest());
					
	}
}