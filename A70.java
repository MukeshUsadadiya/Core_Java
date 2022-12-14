//Stack
import java.util.*;
class A70
{
	public static void main(String[]args)
	{
		Stack s1=new Stack();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		
		System.out.println("Value is :"+s1);
		s1.pop();
		System.out.println("Value is :"+s1);
	}
}