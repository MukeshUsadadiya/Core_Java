//Multilevel  Inheritance 
class A
{
	void disp()
	{
		System.out.println("Class A");
	}
}
class B extends A
{
	double area(double r)
	{
		double a;
		a=3.14 * r * r;
		return a;
	}
}
class C extends B
{
	void display()
	{
		System.out.println("Class C ");
	}
}
class A49
{
	public static void main(String []args)
	{
		C c1=new C();
		double ans=c1.area(5);
		System.out.println("Area of Circle is :"+ans);
		c1.disp();
		c1.display();
	}
}