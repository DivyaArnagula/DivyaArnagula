import java.util.Scanner;

class SsearchEx2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	int[]x={10,20,30,40,50};
	
	System.out.println("Enter elements to search");
	int f=sc.nextInt();
	boolean found=false;
	for(int i=1;i<x.length;i++)
	 {
		if(x[i]==f)
		{
			found=true;
			break;
		}
	}
	if(found)
	{
		System.out.println(f+"is found");
	}
	else 
	{
				
		System.out.println(f+"is not found");
	}
 }
    
}	