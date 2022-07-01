

class Transpose
{
	public static void main(String args[])
	{
		int orginal[][]={{1,2,3},{2,4,3},{3,4,5}};
		int transpose[][]=newInt[][];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				transpose[i][j]=orginal[j][i];
			}
		}
		System.out.println("Printing the matrix without transpose:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++)	{
				System.out.println(transpose[i][j] +" ");
			}
		}
	}
}	
