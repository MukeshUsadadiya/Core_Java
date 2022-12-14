//Non - Daemon & Daemon Thread 
class Th1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Number is :"+i);
		}
	}
}
class A81
{
	public static void main(String []args)
	{
		Th1 t1=new Th1();
		Th1 t2=new Th1();
		t1.start();
		
		System.out.println("Is Demon Thread :"+t1.isDaemon());
		t2.setDaemon(true);
		System.out.println("Is Demon Thread :"+t2.isDaemon());
	}
}