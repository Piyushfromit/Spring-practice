package ArrayIntQuestion;

public class TwoSumWithTwoPointerWhenArrayIsSorted {
	
	public static void main(String[] args) {
		
		int [] arr = {2,7,11,15};
		int target = 18;
		
		
		int left=0; 
		int right= arr.length-1;
		
		while(left<right) {
			
			if(arr[left]+ arr[right]<target) {
				left++;
			}else if(arr[left]+ arr[right]>target) {
				right--;
			}else if(arr[left]+ arr[right]==target) {
				System.out.println(left + "  " + right);
				return;
			}
			
			
			
		}
		
		
	}

}
