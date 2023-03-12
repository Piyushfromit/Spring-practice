package StringIntQuestion;

import java.util.*;

public class ReverseSentenceNotWord {

	public static void main(String[] args) {
		
		String input = "Hello world! How are you?";
		// Output  "you? are How world! Hello"
		
		// Split sentence into words
	    List<String> words = new ArrayList<>();
	    
	    int start = 0;
	    for (int i = 0; i < input.length(); i++) {
	        if (input.charAt(i) == ' ') {
	            words.add(input.substring(start, i));
	            start = i + 1;
	        }
	    }
	    // for last word of sentence
	    words.add(input.substring(start, input.length()));
	    
	    // Reverse the order of the words
	    StringBuilder reversed = new StringBuilder();
	    
	    for (int i = words.size() - 1; i >= 0; i--) {
	        reversed.append(words.get(i));
	        if (i > 0) {
	            reversed.append(' ');
	        }
	    }

	    System.out.println(reversed.toString());
		
	}
}

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
