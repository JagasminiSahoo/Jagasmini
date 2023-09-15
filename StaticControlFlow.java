class StaticControlFlow 
{
	int x=10;
	{
		m1();
	 System.out.println("NSB-1");
	}
	public static void main(String [] args)
	{
	    StaticControlFlow  nsb=new StaticControlFlow();	
		nsb.m1();
	}
	public void m1()
	{
		System.out.println(y);
	}
	
	{
		System.out.println("NSB-2");
	}
	int y=20;
}