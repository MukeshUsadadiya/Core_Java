//StringTolenizer 
import java.util.*;
class A69
{
	public static void main(String []args)
	{
		String str="This is a Junagadh , I am in Junagadh";
		StringTokenizer st=new StringTokenizer(str," ,");
		
		while(st.hasMoreTokens())
		{
			System.out.println("Value is :"+st.nextToken());
		}
	}
}