package ArrayIntQuestion;

public class TargetElementInArray {
	
	public static void main(String[] args) {
		
		int[] arr = {4,6,2,7,3,5,78,8,32,};
		
		int target = 78;
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i]== target) {
			   System.out.println(i);
			}
		}
		
	}
	
	

}
