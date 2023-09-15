class GetSetMethod 
{
	private int x=10;
	public void setX(int i)
	{
		this.x=i;
	}
	public int getX()
	{
		return x;
	}
	class GetSetMethod1 extends GetSetMethod
	{
	public static void main(String[] args) 
	{
		GetSetMethod1 gsm=new GetSetMethod1();
		System.out.println();
	}
}
