//
class A9
{
	public static void main(String args[])
	{
		double qty,r,amt,dis=0;
		qty=Double.parseDouble(args[0]);
		r=Double.parseDouble(args[1]);
		amt=qty*r;

		if (amt>=1000)
		{
			dis=amt*10/100;
			amt=amt-dis;
		}
		System.out.println("Discount is :"+dis);
		System.out.println("Amount is :" +amt);
		
	}
}