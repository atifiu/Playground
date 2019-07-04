import java.util.Scanner;
import java.util.Arrays;
class Main{
          
        public static void main(String[] args) {  
        //Initialize array  
		  int size1;
	      int highest;
	      int n, temp;
	      int freq;
	      int counter = 1;
	      
	      Scanner sc = new Scanner(System.in);
	      size1 = sc.nextInt();
	      freq = sc.nextInt();
	      int arr[] = new int[size1];
	      for(int i = 0; i<size1;i++)
	      {
	        arr[i] = sc.nextInt();
	      }
	      int max = arr[0];
	      for (int i = 0; i < size1; i++) 
	        {
	            for (int j = i + 1; j < size1; j++) 
	            {
	                if (arr[i] > arr[j]) 
	                {
	                    temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }
	        //System.out.print("Ascending Order:")
        //Array fr will store frequencies of element  
        int [] fr = new int [arr.length];  
        int visited = -1;  
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    //To avoid counting same element again  
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }  
  
        //Displays the frequency of each element present in array  
      
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)
            {
                System.out.println(arr[i] + " " + fr[i]);
            }    
        }
        for(int i = 1; i < arr.length;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
			for(int i=max+1;i<=freq;i++)
			{
				 System.out.println(i + " " + 0);
			}
        //System.out.println("----------------------------------------");  
    }
}