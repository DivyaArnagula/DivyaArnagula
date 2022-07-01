import java.util.Scanner;

class SearchEx1
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
	int[]x={10,20,30,40,50};
	
	int co=0;
	for(int i=0;i<x.length;i++)
	 {
		System.out.println(x[i]+ " ");
	 }

	System.out.println(" Enter element to search");
	int no=s.nextInt();
	for(int i=0;i<x.length;i++)
	  {
	  	if(no==x[i])
			{
			co=co+1;
			break;
		  }
	  }
	  if(co>0)
	  {
    System.out.println("Element found");
   }
    else
    	
    {
    		System.out.println("Element Not Found");
    }
    	
    }
}  
	

	
