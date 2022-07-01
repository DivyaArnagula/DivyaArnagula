class Prime4
{
	public static void main(String args[])
	{
		int x;
		int f=2;
		int co=0;
		x=29;
		while(f<=x/2) //condition
		{
			if (x%f==0)
			{
				co=co+1;
				break;
				
			}
			f=f+1;// counter
		}
		if(co==0)
		{
			System.out.println("P Number");
		}
		else
		{
			System.out.println("C number");
		}
	}
}