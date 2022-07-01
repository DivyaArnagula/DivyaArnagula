/*Two Dimensional array 
VariableName=new int[row size][column size]
x=int[3][2]*/
class Array2d1{
	public static void main(String args[])
	{
	int[][]x={{10,20},{20,30}};
	int[][]y={{20,50},{10,80}};
	int[][]z={{0,0},{0,0}};
	System.out.println("Elements of x");
	for(int i=0;i<x.length;i++)
	{
		for(int j=0;j<x.length;i++)
		{
			System.out.println(x[i][j] +" ");
		}
		System.out.println();
	}
	System.out.print("Elements of y ");
	for(int i=0;i<y.length;i++){
		for(int j=0;j<y.lenght;j++)
		{
		System.out.println(y[i][j] +" ");
	}
	}
	System.out.println();
	}System.out.println("Sum of x and y elements");
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			z[i][j]=x[i][j]+y[i][j];
			System.out.println(z[i][j]+" ");
		}
		System.out.println();
	}
} 