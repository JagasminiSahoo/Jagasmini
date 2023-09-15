import java.util.Scanner;
class  Print_Array_Odd
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int [] x=new int[size];
		int count=0;
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++)
		{
			x[i]=sc.nextInt();
		}
		System.out.println("The odd elements are");
		for(int i=0;i<size;i++)
		{
			if(x[i]%2 != 0)
			{
				count++;
			}
		}
		
		System.out.println("Size of 2nd array is"+count);
		int y[]=new int[count];
		int index=0;
		for(int i=0;i<count;i++)
		{
			if(x[i]%2!=0)
			{
			   y[index]=x[i];
			   index++;
			}
		}
		System.out.println("The new values are:");
		for(int i=0;i<y.length;i++)
		{
			System.out.println(y[i]);
		}

		
	}
}
