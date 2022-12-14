//String Class
class A60
{
	public static void main(String[]args)
	{
		String s1=new String("Computer Education");
		System.out.println("String s1 is :"+s1);
		
		String s2="Junagadh District ";
		System.out.println("String s2 is :"+s2);
		
		String s3=s1+s2;
		System.out.println("String s3 is :"+s3);
			
		char ch[]={'M','u','k','e','s','h'};
		String s4=new String(ch);
		System.out.println("String is :"+s4);
		
		char asci[]={65,66,67,68,69,70};
		String s5=new String(asci);
		System.out.println("String s5 is :"+s5);
	}
}