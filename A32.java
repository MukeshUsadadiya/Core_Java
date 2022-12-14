//Scanner & Buffered Reader
import java.io.*;
import java.util.*;
class A32
{
	public static void main(String []args)throws IOException
	{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		Scanner s1=new Scanner(System.in);
		int i,j,k,r,c;
		
		System.out.print("Enter Row Size :");
		r=Integer.parseInt(br.readLine());
		int [][]a=new int[r][];

		for(i=0;i<a.length;i++)
		{
			System.out.print("Enter "+(i+1)+" Row Column Size :");
			c=s1.nextInt();
			a[i]=new int[c];
		}
		
		for(i=0;i<a.length;i++)
		{
			for(j=0,k=0;j<a[i].length;j++,k++)
			{
				a[i][j]=k;
			}
		}
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}
}