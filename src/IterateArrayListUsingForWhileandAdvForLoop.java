import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class IterateArrayListUsingForWhileandAdvForLoop {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("F");
		al.add("G");
		al.add("H");
		al.add("I");
		
		System.out.println("Using for loop..........");
		
		for(int i=0; i<=al.size()-1; i++) {
			System.out.println(i+" "+al.get(i));
		}
		
		System.out.println("Using while loop.........");
		java.util.Iterator<String> itr = al.iterator();
		while(itr.hasNext()){
			
			//System.out.println(itr);
			System.out.println(itr.next());
		}
		
		System.out.println("Using advanced for loop.........");
		for(String str:al) {
			
			System.out.println(str);
		}
	}

}
