package StringQuestion2;

public class RemoveAllSpecialChar {
	
	
	public static void main(String[] args) {
		
		String str = "hgfjg%^$%#jgjh^%34152";
		
		StringBuilder newstr= new StringBuilder();
		
		for(int i=0; i< str.length(); i++) {
			char ch  =str.charAt(i);
			if( (ch >='a' && ch<= 'z') || (ch >='A' && ch<= 'Z') || (ch >= '0' && ch<= '9') ) {
				newstr.append(ch);
			}else {
				continue;
			}
		}
		
		System.out.println(newstr.toString());
	}

}
