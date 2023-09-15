import java.util.Scanner;
class  Pronic
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int result=0;
		for(int i =1;i<=n;i++)
		{
			if(i*(i+1)==n)
			{
				System.out.println(i);
			    System.out.println(i+1);
			    result=i*(i+1);
				System.out.println(result);
				break;
			}
		}
		if(result==n)
			System.out.println("Pronic number");
		else
			System.out.println("Not a pronic number");
	}
}
