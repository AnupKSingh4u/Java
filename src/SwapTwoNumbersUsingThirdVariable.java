import java.util.Scanner;

public class SwapTwoNumbersUsingThirdVariable {

	public static void main(String[] args) {
		int a, b, var;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value for a and b...");
		a=s.nextInt();
		b=s.nextInt();
		
		System.out.println("Value of a and b befor swap: "+a+" "+b);
		var=a;
		a=b;		
		b=var;
		System.out.println("Value of a and b after swap: "+a+" "+b);
	}

}
