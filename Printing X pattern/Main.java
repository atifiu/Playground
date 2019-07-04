import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
     
	Scanner sc=new Scanner(System.in);
	//System.out.println("Enter N : ");
	int size=sc.nextInt();	 
              
      for(int i=0; i < size ;i++)
    {
        //4
        for(int j=0; j < size ;j++)
        {
            //5
            if(i==j || j==(size-i-1))
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
        //6
        System.out.print("\n");
    }
	}
}