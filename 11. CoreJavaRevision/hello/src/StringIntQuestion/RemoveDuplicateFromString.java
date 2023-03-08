package StringIntQuestion;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromString {
	
	public static void main(String[] args) {
		
		String str = "rreewwaa";
		
		int n = str.length();
		
		Set<Character> set = new LinkedHashSet<>();
		
		for(int i=0; i< n ; i++) {
			if(set.contains(str.charAt(i))) {
				continue;
			}else {
				set.add(str.charAt(i));
			}
		}
		
		StringBuilder ans= new StringBuilder();

        for(Character c:set){
            ans.append(c);
        }
        System.out.println(ans);


        
      //Approch 2
        
        
        StringBuilder sb=new StringBuilder();

        str.chars().distinct().forEach(s->sb.append((char)s));
        System.out.println(sb);

        

		
	}

}
