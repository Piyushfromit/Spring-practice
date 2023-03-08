package StringIntQuestion;

public class RemoveAllSpecialCharcters {
	
	public static void main(String[] args) {
		
		String str= "6213brjsnmn2wxvaekj832$%^%%*&&^*&uhxcsd0";
		
		String newstr= str.replaceAll("[^a-z A-Z]", "");
		
		System.out.println(newstr);
		
	}
	
	

}
