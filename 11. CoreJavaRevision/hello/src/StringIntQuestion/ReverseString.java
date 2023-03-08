package StringIntQuestion;

public class ReverseString {
	
	public static void main(String[] args) {

        String str="piyush";

        //Approch 1
        
        String rev="";

        for(int i=str.length()-1; i>=0; i--){
            rev+=str.charAt(i);
        }
        System.out.println(rev);

        //Approch 2

       StringBuilder srev = new StringBuilder(str);
       
       srev.reverse();
       
       System.out.println(srev);

    }

}
