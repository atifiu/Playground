import java.io.*;
import java.util.Scanner; 

public class Main
{
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
      int k = 0;

		longestSeq(arr, k);
    }
  public static void longestSeq(int[] A, int k) 
    { 
        int left = 0;    // left represents current window's starting index
		int count = 0;   // stores number of zeros in current window
		int window = 0;  // stores maximum number of continuous 1's found
						 // so far (including k zeroes)

		int leftIndex = 0;  // store left index of max window found so far

		// maintain a window [left..right] containing at-most k zeroes
		for (int right = 0; right < A.length; right++)
		{
			// if current element is 0, increase count of zeros in the
			// current window by 1
			if (A[right] == 0) {
				count++;
			}

			// window becomes unstable if number of zeros in it becomes
			// more than
			while (count > k)
			{
				// if we have found zero, decrement number of zeros in the
				// current window by 1
				if (A[left] == 0) {
					count--;
				}

				// remove elements from the window's left side till window
				// becomes stable again
				left++;
			}

			// when we reach here, the window [left..right] contains at-most
			// k zeroes and we update max window size and leftmost index
			// of the window
			if (right - left + 1 > window)
			{
				window = right - left + 1;
				leftIndex = left;
			}
		}

		// print maximum sequence of continuous 1's
		System.out.println(window); 
    } 
}