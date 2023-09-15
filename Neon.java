import java.util.Scanner;
class Neon
{
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a number:");
	  int n=sc.nextInt();
	  int sum=0;
	  int rem=0;
	  int sqr=n*n;
	  while(sqr>0)
		{
		   rem=sqr%10;
	       sum=sum+rem;
		   sqr=sqr/10;
	   }
	   if(n==sum)
		{
			System.out.println("Neon number");
		}
       else
		{
			System.out.println("Not a Neon number");
		}
}
}
		