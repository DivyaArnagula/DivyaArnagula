 import java.util.Scanner;
 class Arth
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x value");
		int x=sc.nextInt();
		System.out.println("Enter y value");
		int y=sc.nextInt();
		add(x,y);
		
		
		
	 	System.out.println("Enter a value");
		int a=sc.nextInt();
		System.out.println("Enter b value");
		int b=sc.nextInt();
		sub(a,b);

		System.out.println("Enter m value");
		int m=sc.nextInt();
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int res1=mul(m,n);
		System.out.println("Mult of "+m+" and"+n+" ="+res1);
	}
	 public static void sub(int a,int b)
	 {
	
		int s =a-b;
		System.out.println("Sub of "+a+" and"+b+" ="+s);
	 }
	 
	 public static int mul(int m,int n)
	 {
		int mult =m*n;
		return mult;
		
	 }
	 public static void add(int x,int y)
	 {
		int result =x+y;
		System.out.println("Sum of "+x+" and"+y+" ="+result);
	 }
}
