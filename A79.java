//IS Alive Method - Thread Class 
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
			for(int i=1;i<=5;i++)
			{
				System.out.println(tname   +"Thread is "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e){}
	}
}
class A79
{
	public static void main(String []args)
	{
		R1 r1=new R1("one");
		R1 r2=new R1("Two");
		
		System.out.println("Thread One is Alive :"+r1.t.isAlive());
		System.out.println("Thread Two is Alive :"+r2.t.isAlive());
		try
		{
			System.out.println("Wait For Finieshed Thread.....");
			r1.t.join();
			r2.t.join();
		}catch(Exception e){}
		System.out.println("Thread One is Alive :"+r1.t.isAlive());
		System.out.println("Thread Two is Alive :"+r2.t.isAlive());
	}
}