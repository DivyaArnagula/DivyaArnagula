class Prime
{
	public static void main(String args[])
	{
		int x;
		int f=1;
		int co=0;
		x=9 ;
		while(f<=x) //condition
		{
			if (x%f==0)
			{
				co=co+1;
			}
			f=f+1;// counter
		}
		if(co==2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Composite number");
		}
	}
}