import java.util.Scanner;
class Reverse_Array 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		int[]  x=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++)
		{
			x[i]=sc.nextInt();
		}
		System.out.println("Reverse array is");
		for(int i=size-1;i>=0;i--)
		{
			System.out.println(x[i]);
		}

	}
}
