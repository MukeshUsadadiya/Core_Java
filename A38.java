//final keyword 
class Abc
{
	final int a=10;
	int disp()
	{
		//a=100;
		return a;
	}
}
class A38
{
	public static void main(String []args)
	{
		Abc a1= new Abc();
		System.out.println("Value of A is :"+a1.disp());
	}	
}