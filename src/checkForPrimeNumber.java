import java.util.Scanner;

public class checkForPrimeNumber {

	public static void main(String [] args) {
		
		int num;
		int counter =0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number to chek whether it is prime:");
		num= s.nextInt();
		
		for(int i=1; i<=num; i++) {
			
			if(num%i==0) {
				counter= counter+1;
				
			
				System.out.println("Can be devided by "+i);
				
			}
			
		}
		
		if(counter==2) {
			System.out.println(num+" is a prime number.");
		}
		else {
			System.out.println(num+" is not a prime number.");
		}
	}
}
