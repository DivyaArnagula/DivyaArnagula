    class Lcm
    {
	public static void main(String args[])
	{
		int x=1;
		int y=5;
		int lcm;
		lcm=x>y? x : y; //ternary operation ( expression ? expression1:expression)
		while(lcm<=x*y) //condition
		{
			if(lcm%x==0 && lcm%y==0)
			{
				break; //terminate the loop
			}
			lcm=lcm+1; //counter
		}
		System.out.println("Lcm of two numbers " +lcm);
	}
}