import java.util.Scanner;

public class ReplaceSpaceUsingStringBuffer {

	public static void main(String[] args) {
		String str; // = "my name is lakkhan";
		System.out.println("Enter the sentence:....");
		Scanner s = new Scanner(System.in);
		str= s.nextLine();
		
		char[] star= str.toCharArray();
		StringBuffer sb =new StringBuffer();
		
  for(int i=0; i<star.length; i++) {
	  if((star[i] !=' ' ) && (star[i] !='\t')) {
		  
		  sb.append(star[i]);
	  }
  }
  
  System.out.println(sb);
	}

}
