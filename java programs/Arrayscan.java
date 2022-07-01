import java.util.Scanner;
class Arrayscan
{
	public static void main(String args[])
	{
		int x[]=new int[10];
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter number of elements for array");
		//int n=sc.nextInt();
		//int x[]=new int [n];
        System.out.println("Enter array elements");
        for(int i=0;i<x.length;i++)
        {
        	 x[i]=sc.nextInt();
        }

         System.out.println("Array  elements are :");
        for(int i=0;i<x.length;i++)
        {
        	 System.out.println(x[i]);
        }

	}
}
