import java.util.Scanner;
class  Tech
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int temp=num;
		int i=1;
		int firsthalf,secondhalf,count=0;
		int sum=0,square=0;
		int exponent,power=1;
		while(num>0)
		{
		      count++;
			  num=num/10;
	     }
		 if(count%2==0)
		{
             exponent=count/2;      
			 while(i<=exponent)
			{
				 power=power*10;
				 firsthalf=temp/power;
				 secondhalf=temp%power;
				 sum=firsthalf+secondhalf;
				 square=sum*sum;
				 i++;
			}
          if(square==temp)
			  System.out.println("Tech number");
		  else
			  System.out.println("Not a tech number");
		  }
		else
		{
             System.out.println("Not a Tech number");
		}
	}
}
