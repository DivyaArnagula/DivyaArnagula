 import java.util.Scanner;

 class Scanner1
{
	public static void main(String args[])
    {
    
	Scanner x=new Scanner(System.in);
	System.out.println("Enter student name");
    //string input
    String name=x.nextLine();
    // numerical input
    System.out.println("Enter  1st subject marks");
    int m1=x.nextInt();
    System.out.println("Enter 2nd subject marks");
    int m2=x.nextInt();
    System.out.println("Enter 3rd subject marks");
    int m3=x.nextInt();
    System.out.println("Enter tution fees");
    double fee=x.nextDouble();
    System.out.println("Student details are:  " );
    System.out.println("Name: " +name);
    System.out.println("Fee: " +fee);
    System.out.println("m1: "+m1);
    System.out.println("m2: "+m2);
    System.out.println("m3: "+m3);
     if(m1>=35 && m2>=35 && m3>=35)
     
        System.out.println("Student pass");
      else
    
            System.out.println("Student fail");

     }


}