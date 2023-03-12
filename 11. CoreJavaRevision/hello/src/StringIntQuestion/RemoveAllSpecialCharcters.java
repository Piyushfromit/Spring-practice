package StringIntQuestion;

public class RemoveAllSpecialCharcters {
	
	public static void main(String[] args) {
		
		
		// approach 1
		
		String str= "6213brjsnmn2wxvaekj832$%^%%*&&^*&uhxcsd0";
		
		String newstr= str.replaceAll("[^a-z A-Z 0-9]", "");
		
		System.out.println("Original string: " + str);
        System.out.println("New Srting using Approach 1: " + newstr);
		
		
		// approach 2
		
		String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
                result += ch;
            }
        }

        System.out.println("Original string: " + str);
        System.out.println("New Srting using Approach 1: " + result);
		
	}
	

}


