import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      int num3 = sc.nextInt();
      int great = greatest_number(num1, num2);
      int greatest = greatest_number(num3, great);
      System.out.println(greatest);
      
	}
  	public static int greatest_number(int num1, int num2)
    {
      int gcd = 1;
      for(int i = 1; i <= num1 && i <= num2; ++i)
        {
            // Checks if i is factor of both integers
            if(num1 % i==0 && num2 % i==0)
                gcd = i;
        }
      return gcd;
    }
}