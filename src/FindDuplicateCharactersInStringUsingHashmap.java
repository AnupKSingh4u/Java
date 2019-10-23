import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class FindDuplicateCharactersInStringUsingHashmap {
	

	public static void main(String[] args) {
		String str = "aaabbccd";
		int rep;		
		//String[] chAr= str.split("");
		char[] chAr =str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<chAr.length; i++) {
			
			if(map.containsKey(chAr[i])) {
				
				 rep =map.get(chAr[i]);
				 //System.out.println(rep);
				map.put(chAr[i], rep+1);
				
			
			}
			
			else {
				map.put(chAr[i], 1);
				
			}
		}
		
		//System.out.println(map.keySet()+map.values().toString());
		//System.out.println(map.values());
	
		
		Iterator<Character> itr = map.keySet().iterator();
		
		while(itr.hasNext()) {
			Character key =itr.next();
			System.out.print(key+map.get(key).toString());
			//System.out.println(map.get(key));
		}
		
		
		System.out.println(map);	
		
	}

}
