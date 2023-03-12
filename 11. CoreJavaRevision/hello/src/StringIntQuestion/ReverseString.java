package StringIntQuestion;

public class ReverseString {
	
	public static void main(String[] args) {

        String str="piyush";

        //Approach 1  **********************************
        
        StringBuilder rev1 = new StringBuilder();
        
        for(int i=str.length()-1; i>=0; i--){
            rev1.append(str.charAt(i));
        }
        
        System.out.println(rev1);
        
        //Approach 2   **********************************

        String rev2="";

        for(int i=str.length()-1; i>=0; i--){
            rev2+=str.charAt(i);
        }
        System.out.println(rev2);

        //Approach 3   **********************************

       StringBuilder rev3 = new StringBuilder(str);
       
       rev3.reverse();
       
       System.out.println(rev3);

    }

}
