//Vector class 
import java.util.*;
class A67
{
	public static void main(String []args)
	{
		Vector v1=  new Vector();
		v1.addElement(new Integer(10));
		v1.addElement(new Integer(20));
		v1.addElement(new Integer(30));
		v1.addElement(new Integer(40));
		v1.addElement(new String("Java"));
		v1.addElement(new String("C sharp"));
		v1.addElement(new Long("5000000"));
	
		System.out.println("Value is :"+v1);
	}
}