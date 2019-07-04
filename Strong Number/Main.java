import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int Number, Temp, Reminder, Sum = 0, i, Factorial;
		Scanner sc = new Scanner(System.in);
		
		//System.out.print(" Please Enter any Number : ");
		Number = sc.nextInt();		
		
		Temp = Number;
		while( Temp > 0)
		{
			Factorial = 1; 
			i = 1; 
		    Reminder = Temp % 10;
		    while (i <= Reminder)
		    {
		     	Factorial = Factorial * i;
		     	i++;
		    }
		    //System.out.println(" The Factorial of " + Reminder + "  =  " + Factorial);
		     Sum = Sum + Factorial;
		     Temp = Temp /10;
		}
		
		//System.out.println(" The Sum of the Factorials of a Given Number " + Number + " =  " + Sum);
		
		if ( Number == Sum )
		{
			System.out.println("Yes");
		}
		else
		{
		   System.out.println("No");
		}
	}
}