class Hidding
{
	public void m1()
	{
		System.out.println("Puja");
	}
}
class Mhidding extends Hidding
{
	public static void m1()
	{
		System.out.println("Lija");
	}
}
class MethodHidding
{
	public static void main(String [] args)
	{
	     Hidding h=new Hidding();
		 h.m1();
		 Mhidding mh=new Mhidding();
		 mh.m1();

	}	
}

	
   

