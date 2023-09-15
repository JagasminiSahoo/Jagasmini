class PrimeCheck 
{
	public static void main(String[] args) 
	{
		int count1=0;
		for(int num=1;num<=20;num++)
		{
			int count=0;
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					  count++;
			}

		   if(count==2)
				{
			          count1++;
					  if(count1 % 2!=0)
					{
						  System.out.println(num);
				    }
		        }
	     }
      }
}

