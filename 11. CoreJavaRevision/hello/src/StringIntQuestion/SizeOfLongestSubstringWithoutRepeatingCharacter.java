package StringIntQuestion;

import java.util.*;


public class SizeOfLongestSubstringWithoutRepeatingCharacter {
	
	public static void main(String[] args) {
		
		String str= "abbacd";
		 
		int maxlen=0;
		int left=0;
		
		Set<Character> set = new LinkedHashSet<>();
		
		for(int right =0; right< str.length(); right++) {
			
			char ch = str.charAt(right);
			
            while(set.contains(ch)) {
				set.remove(str.charAt(left));
				left++;
			}
            
            set.add(ch);
            maxlen = Math.max(maxlen, right-left+1);
			
		}
		 
		System.out.println(maxlen);
		 
		    
		}
	

}






















//int maxLen = 0;
//int left = 0;
//
//if (str == null || str.length() == 0) {
//       System.out.println(0);
//       return;
//}
//
//Set<Character> set = new LinkedHashSet<>();
//
//
//for (int right = 0; right < str.length(); right++) {
//	 
//    char ch = str.charAt(right);
//    
//    while(set.contains(ch)) {
//        // remove characters from the left end of the set
//        set.remove(str.charAt(left));
//        left++;
//    }
//    
//    set.add(ch);
//    maxLen = Math.max(maxLen, (right - left + 1) );
//    
//}
//   
//System.out.println( maxLen);

