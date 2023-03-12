package StringIntQuestion;

import java.util.*;


public class FirstNonRepeatedCharOfString {
	
	
	
	
	public static void main(String[] args) {
		String str = "hhrctzrctsh";
		
		// ListHasMap maintain the order of insertion
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for (int i = 0; i < str.length(); i++) {
		    char ch = str.charAt(i);
		    if (map.containsKey(ch)) {
		        int count = map.get(ch);
		        map.put(ch, count + 1);
		    } else {
		        map.put(ch, 1);
		    }
		}
		
		
		for(Character c: map.keySet()){
            if(map.get(c)==1){
                System.out.println(c);
                break;
            }
        }
        
		System.out.println(map);
		
	}

}




















