class Whilehcf
{
 public static void main(String args[])
	{
		int x=2;
		int y=3;
		int hcf,i;
		hcf=x<y? x : y;
		
		
		for( i=hcf;i>1;i--)		
		{
           
           if(x%i==0 && y%i==0)
        { 
        	 break;
			}
		}
       
   System.out.println("hcf of x and y " +i);
    }
}
   