import java.util.Scanner;

public class FindDuplicateCharactersInStringWithoutUsingHashmap {

	public static void main(String[] args) {
	
		String str;		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String......");
		str= s.next();
		
		char Char[] = str.toCharArray();
		int count=0;
		System.out.println("Duplicate characters are...");
	for(int i =0; i<str.length(); i++) {
		
		for(int j= i+1; j<str.length(); j++ ) { 
			
			if(Char[i]==Char[j]) {
				
			
				count=count+1;
				
			}
		
			
			System.out.println(Char[i]+" "+count);
		}
	
	
		
	
	}

	}

}
