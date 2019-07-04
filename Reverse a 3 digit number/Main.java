import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    int first = input/100;
    int second = (input/10)%10;
    int third = input%10;
    int final_value = (third*100) + (second*10) + first;
    System.out.println(final_value);
  }
}