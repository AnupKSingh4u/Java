import java.util.Scanner;

public class PrintSecHighest {

	static int[] numbers = {11,89,114,1010,89,300,432,700,600,750,302};
	
	static int highest= numbers[0];
	static int sec_highest= numbers[0];
	//static int thrd_highest=numbers[0];
	
	
	public static void main(String[] args) {
		System.out.println("Numbers are: ");
		for(int i=0; i<numbers.length; i++) {
			//System.out.print(numbers[i]+ "\t");
			if(numbers[i]>highest) {
				
				sec_highest=highest;
				highest= numbers[i];
			}
			
			else if(numbers[i]>sec_highest && numbers[i] !=highest ) {
				sec_highest=numbers[i];
				
				
			}
			
			
		}
		
		
		System.out.println(" ");
		
		System.out.println("Highest number: "+highest);
		System.out.println("Second highest number: "+sec_highest);
		

		
		}
	}

