import java.util.Arrays;
import java.util.Collections;

public class Array_Sort {

	public static void main(String[] args) {
		Integer[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 }; 
		 Integer[] arr2 = arr.clone();
		 System.out.printf("Before sorting, arr2[] : %s",Arrays.toString(arr2) );
				 
		 
		 System.out.println();
	       Arrays.sort(arr); 
	  
	        System.out.printf("Modified arr[] : %s",  Arrays.toString(arr)); 
	                         
	        System.out.println();
	       
	        Arrays.sort(arr, Collections.reverseOrder());
	        System.out.println();
	        System.out.printf("Modified arr[] : %s", 
                    Arrays.toString(arr)); 
	        System.out.println();
	        char c = 'a';
	        Character u = new Character('p');
	        
	        System.out.println(u);
	        System.out.println(c);
	}

}
