import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
    int list[] = new int[num];
    for(int i = 0;i<num;i++)
    {
      list[i] = sc.nextInt();
    }
    int max = list[0];
    int index = 0;
    for(int i = 0;i<num;i++)
    {
      if(max <= list[i])
      {
        max = list[i];
        index = i;
      }
    }
    System.out.println(index);
  }
}