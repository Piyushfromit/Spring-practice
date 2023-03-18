package ArrayIntQuestion;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		int arr [] = {8,7,2,3,7,6,2,3,4};
		
		for(int i=0; i< arr.length; i++) {
			
			int minInd = i;
			
			for( int j=i+1; j< arr.length; j++) {
				if(arr[minInd] > arr[j]  ) {
					minInd=j;
				}
			}
			
			int temp= arr[minInd];
			arr[minInd] = arr[i];
			arr[i] = temp;
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
	// In Selection sort, sorting will start from left;
	// In Bubble sort, sorting will start from Right;
	

}
