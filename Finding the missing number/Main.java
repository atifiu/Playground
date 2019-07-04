import java.util.Scanner;
import java.util.Arrays;
class Main 
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       int arr_size = sc.nextInt();
       int arr[] = new int[arr_size];
       //int arr1[] = new int[arr_size];
       int is_present  = 0;
       for(int index = 0; index < arr_size; index++)
       {
           arr[index] = sc.nextInt();
       }
     for ( int i = 1;i<=arr_size;i++)
     {
       is_present = 0;
       for(int index = 0;index <  arr_size; index++)
       {
         if ( i == arr[index])
         {
           is_present = 1;
         	break;
         }
       }
       if(is_present == 0)
         {
           System.out.println(i);
         }
     }
   }
}