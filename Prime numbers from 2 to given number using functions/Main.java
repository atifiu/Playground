import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      prime_test(num);
    }
     
      public static void prime_test(int num)
      {
         for(int i =2;i<= num;i++)
      {
           if(i%2==0 || i%3==0)
           {
             if(i==2 || i==3)
             {
               System.out.println(i);
             }
           }
           else
           {
             System.out.println(i);
           }
        
      }
        
      }
      
	
}