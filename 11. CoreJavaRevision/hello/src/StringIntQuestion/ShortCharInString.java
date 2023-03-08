package StringIntQuestion;

import java.util.Arrays;

public class ShortCharInString {
	
	public static void main(String[] args) {
		
		String str = "HiIAmPiyush";
		
		char [] arr = str.toCharArray();
		
//		Arrays.sort(arr);
//		
//		for (char c : arr) {
//			System.out.print(c);
//		}
		
		
		for( int i=0; i<arr.length-1; i++) {
			
			for(int j =i+1 ; j<arr.length; j++) {
				
				if(arr[i]> arr[j]) {
				  char temp = arr[i];
				   arr[i]=arr[j];
				   arr[j]= temp;
				}
			}
		}
		
		for (char c : arr) {
		System.out.print(c);
	    }
		
		
	}
	
	
	
	

}
