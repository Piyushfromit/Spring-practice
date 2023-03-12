package StringIntQuestion;

import java.util.*;

public class RemoveDuplicateFromString {
	
	public static void main(String[] args) {
		
		String str = "Hello World";
		
		int n = str.length();
		
		// LinkedList follow order of insertion and it doesn't allow duplicate  
		// if data is present already then it will not add, 
		Set<Character> set = new LinkedHashSet<>();
		
		for(int i=0; i< n ; i++) {
			
			set.add(str.charAt(i));
			
		}
		
		StringBuilder ans= new StringBuilder();

        for(Character c:set){
            ans.append(c);
        }
        System.out.println("Original string: " + str);
        System.out.println("String without duplicates: " + ans.toString());
       
        
        
        
        //Approach 2
        
        StringBuilder sb=new StringBuilder();

        str.chars().distinct().forEach(s->sb.append((char)s));
        System.out.println("without Duplicates Using Approach 2: " + sb.toString());

	}
}


// without using any inbuilt function

//public class RemoveDuplicates {
//    public static void main(String[] args) {
//        String str = "Hello World";
//
//        String result = "";
//
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//
//            boolean isDuplicate = false;
//
//            for (int j = 0; j < i; j++) {
//                if (str.charAt(j) == ch) {
//                    isDuplicate = true;
//                    break;
//                }
//            }
//
//            if (!isDuplicate) {
//                result += ch;
//            }
//        }
//
//        System.out.println("Original string: " + str);
//        System.out.println("String without duplicates: " + result);
//    }
//}
