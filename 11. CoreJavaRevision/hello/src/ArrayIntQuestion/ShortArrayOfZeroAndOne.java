package ArrayIntQuestion;


public class ShortArrayOfZeroAndOne {
	
	public static void main(String[] args) {
		
		int [] arr = {1,0,0,1,0,0,1,1,1,0,0,0,0,};
		
		// approach 1;
		
		int left =0; 
		int right = arr.length-1;
		
		while (left < right) {
			while (left< right && arr[left] == 0) {
				left++;
			}
			
			while (left< right && arr[right] == 1 ) {
				right--;
			}
			
			if (left< right  ) {
				arr[left]=0;
				arr[right]=1;
				left++;
				right--;
			}
		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		
//		// approach 2
		
        
//		int czero=0; 
//		int cone =0;
//		
//		for( int i=0; i<arr.length; i++){
//			if(arr[i] ==0) {
//				czero++;
//			}
//		}
//		
//		for (int i=0; i<arr.length; i++) {
//			if(i<czero) {
//				arr[i]=0;
//			}else {
//				arr[i]=1;
//			}
//		}
//		
//		for (int i : arr) {
//			System.out.print(i + " ");
//		}
		
	}
	

}
