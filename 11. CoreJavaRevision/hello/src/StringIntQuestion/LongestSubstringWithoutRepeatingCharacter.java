package StringIntQuestion;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {
	
	
	public static void main(String[] args) {
		String str= "abbacd";
		 
		int left =0; 
		int maxLen=0;
		
		Set<Character> set = new LinkedHashSet<>();
		
		String maxStr ="";
		
		for(int right=0; right < str.length(); right++) {
			
			char ch = str.charAt(right);
			
			while(set.contains(ch)) {
				set.remove(str.charAt(left));
				left++;
			}
			
			set.add(ch);
			
			if(right-left+1>maxLen) {
				maxLen=right-left+1;
				maxStr=(str.substring(left, right+1));
			}
			
		}
		System.out.println(maxStr);
	}

}

