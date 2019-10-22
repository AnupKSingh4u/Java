
public class ReverseStringWithoutStringBuilder {
	 
	public static void main(String[] args) {
		String str ="examination";
		
		char chr[] = str.toCharArray();
		int ln = chr.length;
		String str2 ="";
		for(int i=ln-1;i>=0; i--) {			
						
			str2= str2+chr[i];
			//System.out.print(chr[i]);
		}		
		System.out.println(str2);
	}

}
