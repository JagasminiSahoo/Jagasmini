final class Final1
{
	public void m1()
	{
	     System.out.println("hii");
	}
}
class Final2 extends Final1
{
	public void m1()
	{

	}

	public static void main(String[] args) 
	{
		Final2 f2=new Final2();
		f2.m1();
	}
}
