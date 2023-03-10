package StringIntQuestion;

public class ReverseSentence {

	
public static void main(String[] args) {
		
		String str= "Hello i am piyush";
		
		String [] arr =str.split(" ");
		
		String revstr = "";
		
		for(int i=arr.length-1; i>=0; i--) {
			
			revstr=revstr+arr[i]+" ";
			
		}
		
		System.out.println(revstr);
	}
	
}
