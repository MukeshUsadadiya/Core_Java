//Thread Synchronized 
class Syn
{
	synchronized  void call(String tnm)
	{
		System.out.println(tnm   +"Thread is Start ");
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(tnm   +"Thread is :"+i);
				Thread.sleep(500);
			}
			System.out.println(tnm    +"Thread is Sleep");
		}catch(Exception e){}
	}
}
class R1 extends Thread
{
	String tname;
	Syn s1;
	R1(Syn s,String tnm)
	{
		s1= s;
		tname=tnm;
		this.start();
	}
	public void run()
	{
		s1.call(tname);
	}
}
class A80
{
	public static void main(String []args)
	{
		Syn s=new Syn();
		R1 r1=new R1(s,"One");
		R1 r2=new R1(s,"Two");
		
		System.out.println("Thread One is Alive :"+r1.isAlive());
		System.out.println("Thread Two is Alive :"+r2.isAlive());
		try
		{
			System.out.println("Wait For Finished Thread......");
			r1.join();
			r2.join();
		}catch(Exception e){}
		System.out.println("Thread One is Alive :"+r1.isAlive());
		System.out.println("Thread Two is Alive :"+r2.isAlive());
	}
}