import java.util.Scanner;
class Arthsub
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt();
		System.out.println("Enter b value");
		int b=sc.nextInt();
		
		int result=sub(a,b);
		System.out.println("Sum of "+a+" and"+b+" ="+result);

	
	}
	public static int  sub(int a,int b)
	 {
		int re =a-b;
		return re;
		
	 }
}