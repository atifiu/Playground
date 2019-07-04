import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      for(int i=1;i<=num;i++)
      {
        for(int k=1;k<=num;k++)
        {
          System.out.print(i);
        }
        System.out.print("\n");
      }
    }
}