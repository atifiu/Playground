import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		// Type your code here
      int year1 = in.nextInt();
      if (((year1%4 == 0 && year1%100 != 0 )) || ((year1%100 == 0 && year1%400 == 0)))
        System.out.println("Leap year");
      else
        System.out.println("Non Leap year");
    }
}