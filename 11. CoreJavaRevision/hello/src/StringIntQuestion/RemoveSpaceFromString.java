package StringIntQuestion;

public class RemoveSpaceFromString {

	
	public static void main(String[] args) {
		
		
		// approach 1;
		
		String str= "Piyush gupta and Bittu are the same person ";
		
		String newstr = str.replaceAll(" " , "");
		
		System.out.println(newstr);
		
		// approach 2;
		
		StringBuilder newstr2 = new StringBuilder();
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != ' '){
				newstr2.append(str.charAt(i));
			}
		}
		
		System.out.println(newstr2);
		
	}
}
