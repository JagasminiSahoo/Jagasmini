class  Even_Sum_Array
{
	public static void main(String[] args) 
	{
		int [] x={2,8,9,40,23};
		int len=x.length;
		int sum=0;
		System.out.println("Enter the array elements");
		for(int i=0;i<len;i++)
		{
			System.out.println(x[i]);
		}
		System.out.println("The sum of even elements are");
		for(int i=0;i<len;i++)
		{
			if(x[i]%2==0)
			{
				sum=sum+x[i];
			}
		}
		System.out.println(sum);
		
	}
}
