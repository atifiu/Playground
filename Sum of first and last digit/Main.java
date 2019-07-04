import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int last_digit = num %10;
      while(num/10 != 0)
      {
        num = num/10;
      }
      int sum = num + last_digit;
      System.out.println(sum);
	}
}