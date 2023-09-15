class Method_Overloading1 
{
	public static void main(String[] args) 
	{
		m1(null);
	}
	public static void m1(Object o)
	{
		System.out.println("Supermost Parent class");
	}
	public static void m1(String s)
	{
		System.out.println("Child Class");
	}
//	public static void m1(Method_Overloading1 m)
	//{
		//System.out.println("User defined class");
	//}..............................Ambiguity error
      //public static void m1(int i)
	    //{
		    //   System.out.println("Ch class");
	     //}.................................................Primitive arg not at all match no error
}
