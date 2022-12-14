//Hierarchical  Inheritance 
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
class C extends A
{
	void display()
	{
		System.out.println("Class C ");
	}
}
class A50
{
	public static void main(String []args)
	{
		B b1=new B();
		double ans=b1.area(5);
		System.out.println("Area of Circle is :"+ans);
		b1.disp();
		C c1=new C();
		c1.disp();
		c1.display();
	}
}