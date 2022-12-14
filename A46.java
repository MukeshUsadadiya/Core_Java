//Interface 
interface A
{
	final double pi=3.14;
}
class B  implements A
{
	double area(double r)
	{
		double a;
		a=pi * r * r;
		return a;
	}
}
class A46
{
	public static void main(String []args)
	{
		B b1=new B();
		double ans=b1.area(5);
		System.out.println("Area of Circle is :"+ans);
	}
}