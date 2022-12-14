//Hybrid  Inheritance using Interface 
interface A
{
	final double pi=3.14;
	double area(double r);
}
class B
{
	void disp()
	{
		System.out.println("Class B ");
	}
}
class C extends B implements A
{
	public double area(double r)
	{
		double a;
		a=pi*r*r;
		return a;
	}
}
class D extends C
{
	void display()
	{
		System.out.println("Class D ");
	}
}
class A48
{
	public static void main(String []args)
	{
		D d1=new D();
		double ans=d1.area(5);
		System.out.println("Area of Circle is :"+ans);
		d1.disp();
		d1.display();
	}
}