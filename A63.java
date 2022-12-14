//Integer class 
class A63
{
	public static void main(String []args)
	{
		Integer i1=10;
		int a=5;
		int c=a+i1;
		System.out.println("Total is :"+c);
		
		Integer i2=new Integer("20");
		a=5; 			//int b=5;
		c=a + i2;			//int d=b +i2;
		System.out.println("Total is :"+c);
			
		Long l1=new Long("454545");
		a=5;
		c= a + l1.intValue();
		System.out.println("Total is :"+c);
			
		Double d1=new Double("454545");
		a=5;
		c=a+d1.intValue();
		System.out.println("Total  is :"+c);
	}
}

	
	