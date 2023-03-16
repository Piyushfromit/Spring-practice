package StringIntQuestion;

public class SubStringOfString {
	
	public static void main(String[] args) {
		
		String str = "masai";
		
		for(int i=0; i< str.length(); i++) {
			
			StringBuilder substr= new StringBuilder();
			
			for(int j=i; j< str.length();  j++) {
				
				substr.append(str.charAt(j));
				System.out.println(substr);
				
			}
			
		}
	}

}
