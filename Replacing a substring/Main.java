import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      Scanner scan = new Scanner(System.in);
   	 String str = scan.nextLine();
      String replace1 = scan.nextLine();
      String replace2 = scan.nextLine();
      //String str = "Hello World";
      System.out.println( str.replace( replace1,replace2 ) ); 
    }
}