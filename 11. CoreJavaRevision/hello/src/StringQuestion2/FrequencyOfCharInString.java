package StringQuestion2;

import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfCharInString {
	
	public static void main(String[] args) {
		
		String str= "hgfhgfhgfukjhkjhy";
		
		
		Map<Character , Integer> map = new TreeMap<>();
		
		
		for(int i=0; i< str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if( map.containsKey(ch)) {
				
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
			
		}
		
		System.out.println(map);
		
	}
	

}
