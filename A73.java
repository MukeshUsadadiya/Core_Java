//Creating user defind packages
import First.SUM;
import First.Second.AC;
class A73
{
	public static void main(String []args)
	{
		SUM s1=new SUM();
		AC a1=new AC();

		double p,r,n,a,b,c,si,ac,sc;
		p=50000;
		r=10;
		n=7.5;
		
		si=s1.simpleInt(p,r,n);
		System.out.println("Simple Intrest is :"+si);
		ac=a1.areaCal(r);
		System.out.println("Area of Circle is    :"+ac);
		sc=s1.sumcal(10,20,30);
		System.out.println("Value  is    :"+sc);
		sc=s1.sumcal(10,20);
		System.out.println("Value  is    :"+sc);
		sc=s1.sumcal(10);
		System.out.println("Value  is    :"+sc);
	}
}