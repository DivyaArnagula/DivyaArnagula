import java.util.Scanner;
class Scanhcf
{
 public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x value");
		 int x=sc.nextInt();
        System.out.println("Enter y value");
        int y=sc.nextInt();
        int hcf,i;
		hcf=x<y? x : y;
		
		
		for( i=hcf;i>1;i--)		
		{
           
           if(x%i==0 && y%i==0)
        { 
        	 break;
			}
		}
       
   System.out.println("hcf of x and y " +i);
    }
}
   