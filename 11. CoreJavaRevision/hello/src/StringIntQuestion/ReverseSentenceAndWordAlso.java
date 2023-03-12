package StringIntQuestion;

import java.util.*;

public class ReverseSentenceAndWordAlso {
	
	public static void main(String[] args) {
		
		String input = "Hello world! How are you?";
		// Output "?uoy era woH !dlrow olleH"
		
		// Split sentence into words
	    List<String> words = new ArrayList<String>();
	    int start = 0;
	    for (int i = 0; i < input.length(); i++) {
	        if (input.charAt(i) == ' ') {
	            words.add(input.substring(start, i));
	            start = i + 1;
	        }
	    }
	    // for last word of sentence; 
	    words.add(input.substring(start, input.length() ));

	    // Reverse the order of the words and reverse the characters of each word
	    StringBuilder reversed = new StringBuilder();
	    for (int i = words.size() - 1; i >= 0; i--) {
	        String word = words.get(i);
	        StringBuilder reversedWord = new StringBuilder();
	        for (int j = word.length() - 1; j >= 0; j--) {
	            reversedWord.append(word.charAt(j));
	        }
	        reversed.append(reversedWord);
	        if (i > 0) {
	            reversed.append(' ');
	        }
	    }

	    System.out.println(reversed.toString());
    }
}

//  Approach 2  with using Inbuilt function; 

//public static void main(String[] args) {
//	
//	String str= "Hello i am piyush";
//	// output = "olleH i ma hsuyip";
//	String [] arr =str.split(" ");
//	
//	String revstr = "";
//	
//	for(int i=0; i<arr.length; i++) {
//		
//		String s= arr[i];
//		
//		String revs ="";
//		
//		for(int j=s.length()-1; j>=0; j--) {
//			revs=revs+s.charAt(j);
//		}
//		revstr = revstr+revs+" ";
//	}
//	
//	System.out.println(revstr);
//}



