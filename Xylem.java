import java.util.Scanner;
class Xylem 
{
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int rem=0;
		int os=0;
		int is=0;
		int temp=n;
		while(temp>0)
		{
			if(temp==n || temp<10)
			{
				rem=temp%10;
				os=os+rem;
			}
			else
			{
			    rem=temp%10;
				is=is+rem;
			}
			temp=temp/10;
		}
		if(os==is)
			   System.out.println("Xylem number");
		else
			    System.out.println("Not a Xylem number");
	}
}
