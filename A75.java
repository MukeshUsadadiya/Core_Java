//Thread class Sleep Method 
class Th1 extends Thread
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
class A75
{
	public static void main(String[]args)
	{
		Th1 t1=new Th1();
		t1.start();
	}
}