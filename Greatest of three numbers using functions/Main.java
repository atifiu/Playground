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
      if(num1> num2)
        return num1;
      else
        return num2;
    }
}