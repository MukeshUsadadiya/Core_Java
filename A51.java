//Interface Inheritance(extends)
interface A
{
	void disp1();
	void disp2();
}
interface B extends A
{
	void disp3();	
}

class C implements B
{
	public void disp1()
	{
		System.out.println("Disp 1 ");
	}
	public void disp2()
	{
		System.out.println("Disp 2 ");
	}
	public void disp3()
	{
		System.out.println("Disp  3 ");
	}
}
class D implements A
{
	public void disp1()
	{
		System.out.println("Disp 1 ");
	}
	public void disp2()
	{
		System.out.println("Disp 2 ");
	}
}
class A51
{
	public static void main(String []args)
	{
		C c1=new C();
		c1.disp1();
		c1.disp2();
		c1.disp3();

		D d1=new D();
		d1.disp1();
		d1.disp2();
	}
}