package StringIntQuestion;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutREpeatingCharacter {
	
	public static void main(String[] args) {
		
		 String s= "abbacd";
		 
		 int maxLen = 0;
		 int left = 0;
		
		 Set<Character> set = new HashSet<>();
		
		 if (s == null || s.length() == 0) {
		        System.out.println(0);
		 }
		 
		 
		 for (int right = 0; right < s.length(); right++) {
			 
		     char c = s.charAt(right);
		     
		     while(set.contains(c)) {
		         // remove characters from the left end of the window
		         set.remove(s.charAt(left));
		         left++;
		     }
		     
		     set.add(c);
		     maxLen = Math.max(maxLen, (right - left + 1) );
		 }
		    
		 System.out.println( maxLen);
		    
		}
	

}
