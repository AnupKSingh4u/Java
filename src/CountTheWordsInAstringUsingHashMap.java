import java.util.HashMap;

public class CountTheWordsInAstringUsingHashMap {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "kudi to badi sharmati hai humako to darati hai hai hai hai";
		String[] arr= str.split(" ");
	
		
		int count= arr.length;
		System.out.println("Total words= "+count);
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0; i<count; i++) {		
								

		//System.out.println(test);
			if(map.containsKey(arr[i])) {
				int wr= map.get(arr[i]);
				map.put(arr[i], wr+1);
				
				
	}
			else {
				map.put(arr[i], 1);
			}
				
			
}
		System.out.println(map);
	
		
}}