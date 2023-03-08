package StringIntQuestion;

public class RemoveStringFromString {

	
	public static void main(String[] args) {
		
		String str= "Piyush gupta and Bittu are the same person ";
		
		String newstr = str.replaceAll(" " , "");
		
		System.out.println(newstr);
		
	}
}
