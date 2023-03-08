package StringIntQuestion;

import java.util.*;

public class FrequencyOfCharinString {
	
	public static void main(String[] args) {
		
		String str = "hello piyush";
	        
	    Map <Character, Integer> map = new HashMap<>();
	    
        int len = str.length();
        
        for (int i=0; i<len; i++){
        	
            char ch = str.charAt(i);
            
            if( ch ==' ') {
            	continue;
            }
            
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch, 1);
            }
        }
        
        System.out.println(map);
	}

}
