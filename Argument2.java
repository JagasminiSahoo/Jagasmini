class Argument2
{
	public static void main(String[] args) 
	{
		m1();
		m2(true);
		Argument2 t=new Argument2();
		m3(t);
		m3(new Argument2());

	
	}
	public static int m1()
	{
	    System.out.println("Puja");
		return 0;
	}
	public static  void m2(boolean b)
	{
		System.out.println("Boolean");
	}
	public static void m3(Argument2 a)
	{
		System.out.println("Non primitive");
	}
	
}
