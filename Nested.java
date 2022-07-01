class Nested
{
	public static void main(String args[])
	{
		int m1,m2,m3,m4,tot,avg;
		m1=50;m2=84;m3=90;m4=25;

		if(m1>=35 &&m2>=35 &&m3>=35 &&m4>=35)
		{
         System.out.println("Student pass");
         tot=m1+m2+m3+m4;
		avg=tot/4;
         System.out.println("The total marks =" +tot);
         System.out.println("The avg marks =" +avg);
		
		   if(avg>=90)
		   {
		   	System.out.println("Dist");
		   }
		   else if(avg>=80)
		   {
		   	System.out.println("Average");
		   }
		    else if(avg>=60)
		   {
		   	System.out.println("First class");
		   }
		   else if(avg>=50)
		   {
		   	System.out.println("Second class");
		   }
		   else
		   {
		   	System.out.println("Third class");
		   }
         }
		else
		   {
		   	System.out.println("fail");
		   }
	}
}