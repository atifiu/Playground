import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int inputArray[] = new int[size];
      for(int i = 0;i<size;i++)
      {
        inputArray[i] = sc.nextInt();
      }
      int inputNumber = sc.nextInt();
      findThePairs(inputArray, inputNumber);
    }
 
    static void findThePairs(int inputArray[], int inputNumber)
    {
        //System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");
 
        for (int i = 0; i < inputArray.length; i++)
        {
            for (int j = i+1; j < inputArray.length; j++)
            {
                if(inputArray[i]+inputArray[j] == inputNumber)
                {
                    System.out.println(inputArray[i]+", "+inputArray[j]);
                }
            }
        }
    }
    
}