class Forodd
{
	public static void main(String args[])
	{
		int x=1,n,sum;
		n=20;sum=0;

		do
		{	
			if(x%2==1)
			{
			  sum=sum+x;
		    }

			x=x+1;	
		}while(x<=n);
		System.out.println("The sum of odd numbers from 1 to 20 " +sum);
	}
}