class Parent
{
	public void eat()
	{
		System.out.println("Fried Rice");
	}
}
class Child extends Parent
{
	public void eat()
	{
	      System.out.println("Biriyani");
	}

}
class Method_Overriding 
{
	public static void main(String[] args) 
	{
		Parent p=new Parent();
		p.eat();
		Child c=new Child();
		c.eat();
		Parent p1=new Child();
		p1.eat();
		//Child c1=new Parent();
		//c1.eat();...............error

		
	}
}
