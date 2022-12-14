//two dimensional Array
class A29
{
	public static void main(String[]args)
	{
		int  a[][]=new int[3][3];
		int i,j,k=1;
		
		for (i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				a[i][j]=k;
				k++;		}
		}
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}
}