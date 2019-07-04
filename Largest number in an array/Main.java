import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int len_arr = sc.nextInt();
     // int element1 =-1;
      //int element2 =-1;
      int array1[] = new int[len_arr];
      for(int i =0;i<len_arr;i++)
      {
        array1[i] = sc.nextInt();
        //System.out.println(i);
      }
      int greater = 0;
      
      for(int j =0;j<len_arr;j++)
      {
        if(array1[j]>greater)
        {
          greater = array1[j];
        }
      }
      System.out.println(greater);
      //System.out.println(element2);
    }
}