class Array4
{
	public static void main(String args[])
	{
	int[]x={10,20,30,40,50};
	for(int i=0;i<x.length;i++)
	 {
		System.out.println(x[i]+ " ");
	 }
	int sum=0;
	for(int i=0;i<x.length;i++)
	  {
		sum=sum+x[i];
	  }
    System.out.println("Total is " +sum);
    int max=x[0];
    for(int i=0;i<x.length;i++)
      {
    	if(x[i]>max)
    	{
    		max=x[i];

    	}
    }
    	System.out.println("max value " +max);
    	int min=x[0];
    	for(int i=0;i<x.length;i++)
    	{
    		if(x[i]<min)
    		{
    			min=x[i];
    		}

    	}
    		System.out.println("min value " +min);
    	
    }
}  
	

	
