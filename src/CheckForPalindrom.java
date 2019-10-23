import java.util.Scanner;

public class CheckForPalindrom {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		String org;
		String rsv ="";
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter string/number to check for palindrom: ");
		
		org= s.next();
		System.out.println("Original= "+org);
		char[] orgArr= org.toCharArray();
		int size =orgArr.length;
		
		for(int i=size-1; i>=0; i--) {
			rsv= rsv+orgArr[i];
			
		}
		
		System.out.println("Reverse= "+rsv);
		
		if(rsv.equals(org)) {
			
			System.out.println("This is a palindrom num/String.");
		}
		else {
			System.out.println("This is not a palindrom num/String.");
		}

	}

}
