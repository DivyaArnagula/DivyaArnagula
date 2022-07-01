class Hcf
{
	public static void main(String args[])
	{
		int x=24;
		int y=16;
		int hcf;
		hcf=x>y? x : y; //ternary operation ( expression ? expression1:expression)
		
		while(hcf>1) //condition
		{
			if(x%hcf==0 && y%hcf==0)
			{
				break; //terminate the loop
			}
			hcf=hcf-1; //counter
		}
		System.out.println("HCF =" +hcf);
	}
}