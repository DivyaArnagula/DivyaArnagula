class Prime2
{
	public static void main(String args[])
	{
		int x;
		int f=2;
		int co=0;
		x=19;
		while(f<x) //condition
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
			System.out.println("prime Number");
		}
		else
		{
			System.out.println("composite number");
		}
	}
}