import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      String str = sc.nextLine(); 
    findMissingLetters(str); 
    }
     public static void findMissingLetters(String input){
		boolean[] present = new boolean[26];
		input = input.toLowerCase();
		for(int i=0;i<input.length();i++){
			char c = input.charAt(i);
			if(c>='a' && c<='z'){
				present[c-'a'] = true;
			}
		}
		for(int i=0;i<26;i++){
			if(!present[i]){
				System.out.print((char)(i+'a') +  " ");
			}
		}
	}
}