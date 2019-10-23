import java.util.Scanner;

public class ReplaceWhiteSpacefromStringUsingReplace {

	public static void main(String[] args) {
		String str; // = "my name is lakkhan";
		System.out.println("Enter the sentence:....");
		Scanner s = new Scanner(System.in);
		
		str= s.nextLine();
		String str2= str.replaceAll("\\s", "");
		System.out.println("After replacing spaces:...."+"\t"+ "=");
		
		System.out.println(str2);

	}

}
