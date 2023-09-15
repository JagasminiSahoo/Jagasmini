class StaticBlock 
{
	static int x=10;
	static
	{
		m1();
		System.out.println("Om Namah Shivay");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
	public static void m1()
	{
		System.out.println(y);
	}
	static
	{
		System.out.println("Jay maa tankapani");
	}
	static int y=20;
}

