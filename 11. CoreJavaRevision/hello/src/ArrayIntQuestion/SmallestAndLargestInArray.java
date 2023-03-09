package ArrayIntQuestion;

public class SmallestAndLargestInArray {
	
	public static void main(String[] args) {
		
		int arr [] = {5,34,23,67,89,4,45,87};
		
		int max = Integer.MIN_VALUE;
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i< arr.length; i++) {
			if(arr[i]> max) {
				max = arr[i];
			}else if (arr[i] < min){
				min = arr[i];
			}
		}
		
		System.out.println("Minimum is: " + min + ", And "+ "Maximum is: " + max);
		
		
	}

}
