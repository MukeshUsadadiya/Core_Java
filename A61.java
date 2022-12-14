//String class 2
class A61
{
	public static void main(String[]args)
	{
		String s1=new String("COMPUTER EDUCATION ");
		System.out.println("String s1 is :"+s1);
			
		String s2=s1;//.toLowerCase();
		System.out.println("String s2 is :"+s2);
		
		System.out.println("Equal to :"+s1.equals(s2));
		
		System.out.println("Length of s1 is :"+s1.length());
		for(int i=0;i<s1.length();i++)
		{
			System.out.println(""+s1.substring(0,i));
		}
	}
}