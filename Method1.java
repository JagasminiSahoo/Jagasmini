class Method1
{
	public static void main(String[] args) 
	{
		m1();
		Method1.m1();
	}
	public static void m1()
	{
		
		Method1 m=new Method1();
		m.m2();
		System.out.println("Hii");
	}
	public void m2()
	{
       System.out.println("Bye");
	}

}
