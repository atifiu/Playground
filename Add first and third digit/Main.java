import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int final_value = (a/100) + (a%10);
      System.out.println(final_value);
	}
}