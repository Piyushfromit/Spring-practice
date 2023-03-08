package StringIntQuestion;

public class ReplaceCharacterWithNumberOccurence {
	
	
	public static void main(String[] args) {
		
		
		
		String str = "piyutshtgutpta";    // output = "piyu1sh2gu3p4a";
		
		StringBuilder newstr =new StringBuilder();
		
		int count=1;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='t') {
				newstr.append(count++);
			}else {
				newstr.append(str.charAt(i));
			}
		}
		
		System.out.println(newstr);
		
	}

}
