import java.util.Scanner;

public class ReverseStringUsingSplitMethod {

	public static void main(String[] args) {
		String str;
		String str2="";
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the string to be reversed...");
		str= in.nextLine();
		String[] arr = str.split("");

		for(int i=arr.length-1; i>=0; i--) {
			
			//String s= arr[i];
			str2= str2+arr[i];
		}
		System.out.println(str2);
	}

}
