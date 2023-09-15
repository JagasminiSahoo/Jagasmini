class Method_Overloading
{
	public static void main(String[] args)
	{
		//m1();...............error
		//m1(10);
		//m1(12.9);..............double type can't convert to float and int
		//m1(12.0f);
		m1('a');

	}
	public static void m1(int x)
	{
		System.out.println("Lija");
	}
	public static void m1(float f)
	{
	     System.out.println("Puja");
	}

}