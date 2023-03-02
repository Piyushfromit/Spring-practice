package practiceAll;

public class ReverseString {
	
	public static void main(String [] args) {
		
		String st = "Hello boys i am piyush";
		
		int len = st.length();
		
		for(int i=len-1; i>=0; i--) {
			System.out.print(st.charAt(i));
		}
		
	}

}
