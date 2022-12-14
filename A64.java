//Util Package 1. Random class 
import java.util.*;
class A64
{
	public static void main(String []args)
	{
		Random r1=new Random();
		for(int i=0;i<=5;i++)
		{
			System.out.println("Value is :"+r1.nextInt());
		}
	}
}