class A
{
	public static void m1()
	{
		System.out.println("Parent class");
	}
}
class B extends A
{
	public static void m2()
	{
		System.out.println("Child class");
	}
}
class Inheritance
{
	public static void main(String [] args)
	{
		A a=new A();
		a.m1();
		//a.m2();  ........ CE
		B b=new B();
		b.m1();
		b.m2();
		A a1=new B();
		a1.m1();
		//a1.m2();........ce
		//B b1=new A();
		//b1.m1();
		//b1.m2();
	}

}
	

