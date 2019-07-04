import java.util.Scanner;
class Main
{
  public static int square_num(int num)
  {
    int final_num = num*num;
    return final_num;
  }
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int result = square_num(num);
      System.out.println(result);
	} 
}