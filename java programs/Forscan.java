import java.util.Scanner;
class Forscan
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x value");
		int x=sc.nextInt();
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int sum=0;

		do
		{	
			if(x%2==1)
			{
			  sum=sum+x;
		    }

			x=x+1;	
		}while(x<=n);
		System.out.println("The sum of odd numbers are " + sum);
	}
}