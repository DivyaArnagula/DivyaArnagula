import java.util.Scanner;

class Scanner2
{
	public static void main(String args[])
	{
	Scanner y=new Scanner(System.in);
	System.out.println("Enter the Number :");
	int num=y.nextInt();
	int i=1,factorial=1;
	while(i<=num)
	{
		factorial=factorial*i;
		i++;
		
	}
	System.out.println("Factorial of number:" +factorial);
}

}