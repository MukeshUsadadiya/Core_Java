//jagged array dynamic 
class A31
{
	public static void main(String []args)
	{
		int i,j,k,r,c;
		System.out.print("Enter Row-Size :");
		r=Integer.parseInt(System.console().readLine());
		int a[][]=new int[r][];
		
		for(i=0;i<a.length;i++)
		{
			System.out.print("Enter "+(i+1)+" Row Column Size :");
			c=Integer.parseInt(System.console().readLine());
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