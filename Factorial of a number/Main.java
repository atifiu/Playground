import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int first_num = 1;
      int factor = 1;
      for(int i = 2;i<=num;i++)
      {
        factor = first_num*i;
        first_num = factor;
        
      }
      System.out.println(first_num);
	}
}