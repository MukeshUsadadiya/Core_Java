//Creating user defind packages
import First.SI;
class A71
{
	public static void main(String []args)
	{
		SI s1=new SI();
		double p,r,n,si;
		p=1000;
		r=10;
		n=2;
		si=s1.simpleInt(p,r,n);
		System.out.println("Simple Intrest is :"+si);
	}
}