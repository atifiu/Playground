import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int count = 1;
      for(int curr_row=1;curr_row<=num;curr_row++)
      {
        for(int curr_col=1;curr_col<=curr_row;curr_col++)
        {
          if(count%2==0)
          {
          	System.out.print("#");
          }
          else
          {
            System.out.print("*");
          }
          count++;
            
        }
        System.out.print("\n");
      }
    }
}