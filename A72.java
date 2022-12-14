//Creating user defind packages
import First.SI;
import First.Second.AC;
class A72
{
	public static void main(String []args)
	{
		SI s1 = new SI();
		AC a1=new AC();
		
		double p,r,n,si,ac;
		p=50000;
		r=10;
		n=7.5;
		
		si=s1.simpleInt(p,r,n);
		System.out.println("Simple Intrest is :"+si);
		ac=a1.areaCal(r);
		System.out.println("Area of Circle  is :"+ac);
		
	}
}