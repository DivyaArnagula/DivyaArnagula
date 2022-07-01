class Geometry
{
	public static void main(String args[])
	{
     int a=60;
     double r,res1,res2,res3;
     r=a*(3.14/180);
     res1=Math.sin(r);
     res2=Math.cos(r);
     res3=Math.tan(r);
     
     System.out.println("The sin value of r =" +res1);
     System.out.println("The cos value of r =" +res2);
     System.out.println("The tan value of r =" +res3);
	}
}