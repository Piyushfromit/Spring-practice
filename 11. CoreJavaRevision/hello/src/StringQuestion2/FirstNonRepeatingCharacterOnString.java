package StringQuestion2;

import java.util.*;

public class FirstNonRepeatingCharacterOnString {
	
	public static void main(String[] args) {
		
		String str= "hgfhgfhgfukjhkjhy";
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(map.containsKey(ch)) {
				
				map.put(ch, map.get(ch)+1);
				
			}else {
				map.put(ch, 1);
			}
		}
		
		
		for(Character i: map.keySet()) {
			if(map.get(i)==1) {
				System.out.println(i);
				break;
			}
		}
		
		
		
	}

}
