class Whileeven
{
	public static void main(String args[])
	{
		int x;
		x=1;
		System.out.println("Even numbers from 1 to 20");
		while(x<=20)
		{
			if(x%2==0)
			{
				System.out.println(x);
			}
			x=x+1;
		}
	}
}