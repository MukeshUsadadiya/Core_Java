//Multiple Threads / Paralel Threads 
class Th1 extends Thread 
{
	String tname;
	Th1(String tnm)
	{
		tname=tnm;
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
class A77
{
	public static void main(String[]args)
	{
		Th1 t1=new Th1("One");
		Th1 t2=new Th1("Two");
		t1.start();
		t2.start();
	}
}