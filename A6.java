//static member function using object 
class Abc 
{
	public void disp()
	{
		System.out.println("Welcome to another clas static Function");
	}

}
class A6
{
	public static void main(String args[])
	{
		Abc a1=new Abc();
		a1.disp();
	}
}