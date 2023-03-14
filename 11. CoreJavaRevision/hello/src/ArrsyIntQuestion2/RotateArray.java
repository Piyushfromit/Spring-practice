package ArrsyIntQuestion2;

public class RotateArray {
	
	
	public static void main(String[] args) {
		
		int arr [] = {3,5,7,9,4,6,8};
		
		int k= 3 ;
		
		//  output = {4,6,8,3,5,7,9};
		
		int newarr [] = new int[arr.length];
		
		for(int i=0; i< arr.length ; i++) {
			if (i< k) {
				newarr[i]= arr[arr.length-k+i];
			}else {
				newarr[i]= arr[i-k];
			}
		
		}
		
		for (int i : newarr) {
			System.out.println(i);
		}
	}

}
