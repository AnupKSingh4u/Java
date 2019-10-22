import java.util.Collection;

public class FindSecondHighestNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Array[]= {12,13,56,89,99,90,78,99,67,45,85};
         int highest=Array[0];     
         int Sec_highest=Array[0];   
         
         for(int i=0; i<Array.length; i++) {
        	 System.out.print(Array[i] + "\t");

        	 if(Array[i]>highest) {
        		 
        		 Sec_highest=highest;
        		 highest=Array[i];
        	
        	 }
        	 
        	 else if(Array[i]>Sec_highest && Array[i] !=highest) {
        		 
        		 Sec_highest=Array[i];
        		 
        	 }
         }
         
         System.out.println();
         System.out.println(Sec_highest);
         System.out.println(highest);
	}

}
