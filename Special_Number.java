import java.util.Scanner;
class Special_Number
{
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int rem=0;
		int sum=0;
		
		int num=n;
		while(n>0)
		{
			rem=n%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(num==sum)
			   System.out.println("Special number");
		else
			    System.out.println("Not a Special number");
	}
}
