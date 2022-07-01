class Power3
{
	public static void main(String args[])
	{
		double n=1.5;
		int    p=3;
		double res;
		res=Math.pow(p,n);
		System.out.println("The value is :" +res);
		System.out.println("The ceiling value =" +Math.ceil(res));
		System.out.println("The floor value =" +Math.floor(res));

	}
}