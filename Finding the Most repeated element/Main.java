import java.util.*; 

class Main
{
  static int mostFrequent(int arr[], int n) 
    { 
          
        // Sort the array 
        //Arrays.sort(arr); 
          
        // find the max frequency using linear 
        // traversal 
        int max_count = 1, res = arr[0]; 
        int curr_count = 1; 
          
        for (int i = 1; i < n; i++) 
        { 
            if (arr[i] == arr[i - 1]) 
                
            {curr_count++; 
          //System.out.println(" curr_count "+ curr_count);
            }
            else 
            { 
                if (curr_count > max_count) 
                { 
                    max_count = curr_count; 
                    res = arr[i - 1]; 
                } 
                curr_count = 1; 
              //System.out.println(" Res outside "+ res);
            } 
        } 
      
        // If last element is most frequent 
        if (curr_count > max_count) 
        { 
            max_count = curr_count; 
            res = arr[n - 1]; 
          //System.out.println(" Res inside"+ res);
        } 
      
        return res; 
    } 
      
    // Driver program 
    public static void main (String[] args) { 
          
        int size1;
      int highest;
      Scanner sc = new Scanner(System.in);
      size1 = sc.nextInt();
      int arr[] = new int[size1];
      for(int i = 0; i<size1;i++)
      {
        arr[i] = sc.nextInt();
      }
      int k = 0;

		//longestSeq(arr, k);
          
        System.out.println(mostFrequent(arr,size1)); 
          
    } 
}