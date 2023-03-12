package ArrayIntQuestion;

public class ShortArray {
	
	
	public static void main (String [] args) {
		
		int arr [] = {5,8,3,9,2,7,4};
		
		int n= arr.length;
		
		for(int i=0; i<n-1 ; i++) {
			
			for( int j=i+1; j<n; j++) {
				
				if(arr[i] > arr[j]) {
					
					int flag = arr[i];
					
					arr[i]= arr[j];
					
					arr[j] = flag;
				}
				
			}
		}
		
		for (int i : arr) {
			System.out.print(i +" ");
		}
	}

}
