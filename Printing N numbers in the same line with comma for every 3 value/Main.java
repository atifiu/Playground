import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    int a = 0;
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
     for(int i=1;i<=num;i++)
     {
       System.out.print(i);
       a++;
       if(a==3)
       {
         System.out.print(",");
         a=0;
       }
     
     }
  }
}