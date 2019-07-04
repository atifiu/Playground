import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      
      Scanner sc = new Scanner(System.in);
      int rows = sc.nextInt();
         
        //System.out.println(&quot;Here is your pattern....!!!&quot;);
         
       for (int i = rows; i >= 1; i--)
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j + "");
            }
            System.out.println();
        }

	}
}