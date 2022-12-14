//finalize method 
class A39
{
	public static void main(String []args)
	{
		A39 a1=new A39();
		System.out.println("Value of A1 Object is :"+a1.hashCode());
		a1=null;
		
		System.gc();
		System.out.println("After Calling Finalize Method ");
	}	
	protected void finalize()
	{
		System.out.println("Call finalize Method for Destory Object");
	}
}
	