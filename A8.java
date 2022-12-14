//Input Age Which is Eligable for Voting 
class A8
{
	public static void main(String args[])
	{
		int no;
		no=Integer.parseInt(args[0]);

		if (no>18)
		{
			System.out.println("Eligable for Voting");
		}
		else
		{
			System.out.println("Not Eligable for Voting");
		}
	}
}