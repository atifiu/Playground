import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int factor;
      int num2;
      for(int i=1;i<=num;i++){  
        //System.out.println(i);
        num2 = i;
        if(num%i == 0)
        {
        factor = i;
        System.out.println(factor);
        }
    }  
	}
}