import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedHashSet;
class Main
{
  public static void main(String args[])
  {
    
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String[] strWords = str.split("\\s+");
        
        //convert String array to LinkedHashSet to remove duplicates
        LinkedHashSet<String> lhSetWords 
            = new LinkedHashSet<String>( Arrays.asList(strWords) );
        
        //join the words again by space
        StringBuilder sbTemp = new StringBuilder();
        int index = 0;
        
        for(String s : lhSetWords){
            
            if(index > 0)
                sbTemp.append(" ");
        
            sbTemp.append(s);
            index++;
        }
        
        str = sbTemp.toString();
        
        //System.out.println("String after removing duplicate words: ");
        System.out.println(str);
  }
}