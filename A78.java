//Multiple Runnable Interface
class R1 implements Runnable
{
	String tname;
	Thread t;
	R1(String tnm)
	{
		tname=tnm;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(tname   +"Thread is "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e){}
	}
}
class A78
{
	public static void main(String[]args)
	{
		R1 r1=new R1("One");
		R1 r2=new R1("Two");
	}
}