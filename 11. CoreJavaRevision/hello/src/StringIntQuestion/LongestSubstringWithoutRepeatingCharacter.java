package StringIntQuestion;

import java.util.*;


public class LongestSubstringWithoutRepeatingCharacter {
	
	public static void main(String[] args) {
		
		 String s= "abbacd";
		 
		 int maxLen = 0;
		 int left = 0;
		 
		 if (s == null || s.length() == 0) {
		        System.out.println(0);
		        return;
		 }
		
		 Set<Character> set = new LinkedHashSet<>();
		 
		
		 for (int right = 0; right < s.length(); right++) {
			 
		     char c = s.charAt(right);
		     
		     while(set.contains(c)) {
		         // remove characters from the left end of the set
		         set.remove(s.charAt(left));
		         left++;
		     }
		     
		     set.add(c);
		     maxLen = Math.max(maxLen, (right - left + 1) );
		     
		 }
		    
		 System.out.println( maxLen);
		 
		 
		    
		}
	

}
