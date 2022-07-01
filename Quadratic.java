class Quadratic
{
	public static void main(String args[])
	{
		int a=1,b=3,c=1;
		double res;
		res=Math.pow(b,2);
		int z1=4*a*c;
		
		double z2=res-z1;
		double d=Math.sqrt(z2);

		 int z3=2*a;
		 double z4=-b+d;
		 double z5=-b-d;
		 double r1=z4/z3;
		 double r2=z5/z3;

		 System.out.println("the value of x =" +r1);
		 System.out.println("the value of y =" +r2);

		 //ceiling value of r1 and r2
		 double res1,res2;
		 res1=Math.ceil(r1);
		 res2=Math.ceil(r2);
		 System.out.println("the value of ceil is:" +res1);
		 System.out.println("the value of ceil is:" +res2);

		 //floor value of r1 and r2
		 double re1,re2;
		re1=Math.floor(r1);
		re2=Math.floor(r2);
		System.out.println("the value of floor is:" +re1);
		 System.out.println("the value of floor is:" +re2);
		}
	}
		



		 

		

	
