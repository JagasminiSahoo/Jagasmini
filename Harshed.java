import java.util.Scanner;
class Harshed 
{
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a number:");
	  int n=sc.nextInt();
	  int sum=0;
	  int rem=0;
	  int num=n;
	  int sqr;
	  while(n>0)
		{
		   rem=n%10;
	       sum=sum+rem;
		   sqr=n*n;
		   n=n/10;
	   }
	   if(num==sum)
		{
			System.out.println("Neon number");
		}
       else
		{
			System.out.println("Not a Neon number");
		}
}
}
		