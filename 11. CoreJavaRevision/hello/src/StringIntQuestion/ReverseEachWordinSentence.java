package StringIntQuestion;

public class ReverseEachWordinSentence {
	
	public static void main(String[] args) {
		
		String str= "Hello i am piyush";
		
		String [] arr =str.split(" ");
		
		String revstr = "";
		
		for(int i=0; i<arr.length; i++) {
			
			String s= arr[i];
			
			String revs ="";
			
			for(int j=s.length()-1; j>=0; j--) {
				revs=revs+s.charAt(j);
			}
			revstr = revstr+revs+" ";
		}
		
		System.out.println(revstr);
	}
	
	
	
	

}
