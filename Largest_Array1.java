class  Largest_Array1
{
	public static void main(String[] args) 
	{
		int x[]={2,3,56,6,73,20};
		int len=x.length;
		int max=x[0];
		for(int i=0;i<len;i++)
		{
		    for(int j=0;j<len;j++)
			{

			if(x[i]<x[j])
				max=x[j];
			}
		}		
		System.out.println(max);
}
}
