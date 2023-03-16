package StringIntQuestion;

public class ReverseNumber {
	
   public static void main(String[] args) {
	  
	   int num = 67546;
	   int rev = 0; 
	   
	   while(num > 0) {
		   int remendire = num %10;
		   rev = rev * 10 + remendire;
		   num = num / 10;
	   }
	   
	   System.out.println("Reversed number is :-" + rev);
   }

}
