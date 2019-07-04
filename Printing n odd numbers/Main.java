import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int odd = 0;
      //int i = 1;
      int num2 = 0;
      
       for(int count=1;count<=num;){
         num2 = num2 + 1;
         if (num2%2 != 0)
         {
        System.out.println(num2);
           count++;
         }
    } 
      
      
	}
}