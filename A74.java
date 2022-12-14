//Thread class 
/*NOTE 1 :-Use Thread class
NOTE  2 :-Use Runnable Interface*/
class Th1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Number is :"+i);
		}
	}
}
class A74
{
	public static void main(String[]args)
	{
		Th1 t1=new Th1();
		t1.start();
	}
}