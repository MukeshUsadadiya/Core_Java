//Runnable Interface 
class R1 implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("Number is :"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e){}
	}
}
class A76
{
	public static void main(String[]args)
	{
		R1 r=new R1();
		Thread t =new Thread(r);
		t.start();
	}
}