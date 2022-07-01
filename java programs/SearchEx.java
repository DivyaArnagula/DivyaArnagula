class SearchEx{
	public static void main(String args[])
	{
		int[]x={1,2,3,3,4,3,5};
		int n=3;
		int co=0;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]==n)
			{
				co=co+1;
			}
		}
		 System.out.println("Number of times element found=" +co);
	}
}