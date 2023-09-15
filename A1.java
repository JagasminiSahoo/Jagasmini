interface I1
{
	default void m1()
	{
		System.out.println("Hiii");
	}
	static void m2()
	{
		System.out.println("Byeee");
    }
}
class A1 implements I1
{
	public static void main(String [] args)
	{
	      A1 i1=new A1();
		 // i1.m1();//Hiiiii
		 I1.m2();
		  
	}
}