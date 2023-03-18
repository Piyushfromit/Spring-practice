package StringIntQuestion;

import java.util.*;

public class ReverseSentenceNotWord {

	public static void main(String[] args) {
		
		String str = "Hello world! How are you?";
		// Output  "you? are How world! Hello"
		
		// Split sentence into words
        List<String> words = new ArrayList<>();
		
		int start =0; 
		
		for(int i=0; i< str.length(); i++) {
			
			if(str.charAt(i)==' ') {
				words.add(str.substring(start, i));
				start= i+1;
			}
		}
		words.add(str.substring(start, str.length()));
		
		StringBuilder revstr = new StringBuilder();
		
		for(int i= words.size()-1; i>=0; i--) {
			revstr.append(words.get(i));
			if(i>0) {
				revstr.append(' ');
			}
		}
		
		System.out.println(revstr);
		
	}
}
























//public static void main(String[] args) {
//	
//	String str = "Hello world! How are you?";
//	// Output  "you? are How world! Hello"
//	
//	// Split sentence into words
//    List<String> words = new ArrayList<>();
//    
//    int start = 0;
//    for (int i = 0; i < str.length(); i++) {
//        if (str.charAt(i) == ' ') {
//            words.add(str.substring(start, i));
//            start = i + 1;
//        }
//    }
//    // for last word of sentence
//    words.add(str.substring(start, str.length()));
//    
//    // Reverse the order of the words
//    StringBuilder revStr = new StringBuilder();
//    
//    for (int i = words.size() - 1; i >= 0; i--) {
//        revStr.append(words.get(i));
//        if (i > 0) {
//            revStr.append(' ');
//        }
//    }
//
//    System.out.println(revStr.toString());
//	
//}

// Approach 2 with using inbuilt function 

//   public static void main(String[] args) {
//	
//		String str= "Hello i am piyush";
//		
//		String [] arr =str.split(" ");
//		
//		String revstr = "";
//		
//		for(int i=arr.length-1; i>=0; i--) {
//			
//			revstr=revstr+arr[i]+" ";
//			
//		}
//		
//		System.out.println(revstr);
//	}
