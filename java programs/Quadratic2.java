class Quadratic2
{
	public static void main(String args[])
	{int a,b,c;
	a=1;
	b=20;
	c=2;
	double d;
	d=Math.sqrt((Math.pow(b,2) -(4*a*c)));
	 double r1=(-b+d)/(2*a);
	 double r2=(-b-d)/(2*a);
	 System.out.println("The value of r1 =" +r1);
	 System.out.println("The value of r2 =" +r2);

	 System.out.println("The ceiling value of r1 is" + Math.ceil(r1));
	 System.out.println("The ceiling value of r2 is" + Math.ceil(r2));

	 System.out.println("The floor value of r1 is" +Math.floor(r1));
	 System.out.println("The floor value of r2 is" + Math.floor(r2));	


}
}