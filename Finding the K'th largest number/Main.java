import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      int size1;
      int highest;
      Scanner sc = new Scanner(System.in);
      size1 = sc.nextInt();
      int arr[] = new int[size1];
      for(int i = 0; i<size1;i++)
      {
        arr[i] = sc.nextInt();
      }
      highest = sc.nextInt();
      System.out.println(getSecondLargest(arr,size1,highest)); 
    } 
  public static int getSecondLargest(int[] arr, int total, int highest){  
int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (arr[i] > arr[j])   
                {  
                    temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
        }  
       return arr[total-highest];  
}  
}