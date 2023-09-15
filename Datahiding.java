class Datahiding
{
		private int x=100;
		public int getX()
		{
			return x;
		}
		public void setX(int x)
		{
			this.x=x;
		}
}
public class B
{
	public static void main(String[] args)
	{
	     B b=new B();
		 System.out.println(b.getX());
	}
}

