import java.util.Scanner;
import java.util.Arrays;
class Main 
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       int arr_size = sc.nextInt();
       int arr[] = new int[arr_size];
       int arr1[] = new int[arr_size];
       int new_index = 0;
       for(int index = 0; index < arr_size; index++)
       {
           arr[index] = sc.nextInt();
       }
       for (int index_1 = arr_size-1; index_1 >= 0  ; index_1--)
       {
         arr1[new_index] = arr[index_1];
         //System.out.println(arr[index_1]);
         new_index++;
       }
     /*for(int index = 0; index < arr_size; index++)
       {
           System.out.println(arr1[index]);
       }*/
     boolean ints1EqualsInts2 = Arrays.equals(arr, arr1);
     if(ints1EqualsInts2)
       System.out.println("Yes");
     else
       System.out.println("No");
   }
}