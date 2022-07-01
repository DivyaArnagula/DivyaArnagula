class Ifelseif3
{
	public static void main(String args[])
	{
		int m1,m2,m3,m4;
		m1=75;m2=85;m3=95;m4=115;

		if(m1>m2 && m1>m3 && m1>m4)
		{
			System.out.println("m1 is big");
		}
		else if(m2>m3 && m2>m4)
		{
			System.out.println("m2 is big");

		}
		else if(m3>m4)
		{
			System.out.println("m3 is big");
		}
		else
		{
			System.out.println("m4 is big");
		}
	}
}