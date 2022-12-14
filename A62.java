//String Buffer 
/*NOTE :-- String Create Fix Length.
	  String Buffer Create Flexible Length.*/
class A62
{
	public static void main(String []args)	
	{
		StringBuffer s1=new StringBuffer("Computer Science Departmernt ");
		StringBuffer s2=new StringBuffer("B.C.A.");

		System.out.println("String is :"+s1);	
		//System.out.println("Reverse is :"+s1.reverse());
		
		s1.insert(9,s2);
		System.out.println("After Insert String is :"+s1);
		
		s1.append (",Mukesh");
		System.out.println("After Append String is :"+s1);
	}
}