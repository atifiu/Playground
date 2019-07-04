
import java.util.Scanner;
import java.lang.Math;
class Main
{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
           int base1 = sc.nextInt();
      	   int exponent1 = sc.nextInt();
      double power = power_clac(base1,exponent1);
      System.out.println(power);
      		
         }
  		public static double power_clac(int base, int exp)
        {
          double power = Math.pow(base,exp);
          return power;
        }
    }
