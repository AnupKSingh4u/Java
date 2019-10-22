import java.util.Scanner;

public class SwapTwoNumbersWithoutUsingThirdVariable {

	public static void main(String[] args) {
		
		int a,b;
		Scanner s =new Scanner(System.in);
		
	System.out.println("Enter value for both numbers a and b");
	a=s.nextInt();
	b=s.nextInt();
System.out.println("After swap, value for both numbers a and b: "+a+"  "+b);
  a=a*b;
  b=a/b;
  a=a/b;
  
  System.out.println("After swap, value for both numbers a and b: "+a+"  "+b);
		
	}
}
