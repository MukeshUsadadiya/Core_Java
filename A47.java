//Multiple Inheritance using Interface 
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
class A47
{
	public static void main(String []args)
	{
		C c1=new C();
		double ans=c1.area(5);
		System.out.println("Area of Circle is :"+ans);
		c1.disp();
	}
}