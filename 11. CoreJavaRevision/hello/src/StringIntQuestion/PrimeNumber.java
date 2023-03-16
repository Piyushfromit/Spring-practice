package StringIntQuestion;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int num = 14;
		int count =0;
		
		for ( int i=2; i<= num/2; i++) {
			if(num % i ==0) {
				count ++;
			}
		}
		
		if(count == 0) {
			System.out.println(num +" is a prime number ");
		}else {
			System.out.println(num +" is Not a prime number ");
		}
	}

}
