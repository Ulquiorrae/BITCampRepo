import java.util.Scanner;
public class Palindrome {

	public static void main(String args []){
		
		Scanner in=new Scanner(System.in);
		String word;
		int check=0;

		System.out.println("Enter one string: ");
		word=in.nextLine();
		
		int n=word.length();
		
		for(int i=0;i<n/2;++i){
			
			if (word.charAt(i) != word.charAt(n - i - 1)){
				
				
				check=1;
				System.out.println("The entered word is NOT a palindrome! ");
				break;
				
			}
					
		}
		
		if(check==0){
			
			System.out.println("The entered word is a palindrome! ");
		}
	
		
		
	}
}
