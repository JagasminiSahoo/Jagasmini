class  Method
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
	
		Method m=new Method();
		m.m1();
		System.out.println("main ends");
	}
	public static void m1()
	{
		System.out.println("m1 starts");
		Method m=new Method();
		m.m2();
		System.out.println("m1 ends");
	}
	public void m2()
	{
		System.out.println("m2 starts");
		System.out.println("m2 ends");
	}

}
