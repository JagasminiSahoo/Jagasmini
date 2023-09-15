interface I1
{
	default void m1()
	{
	     System.out.println("default");
	}
     static void  m1( )
	{
	    System.out.println("static");
	}
}
class B implements I1
{ 
	public static void main(String [] args)
	{
	   B b=new B();
	    b.m1();// CE
	 //B.m1();
	 I1.m1();
     }
}
	
	





