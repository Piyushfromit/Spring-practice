package ArrayIntQuestion;

public class RotateTheArrayByK {
	
	public static void main(String[] args) {
		
		
		int arr[] = {3,6,8,9,7,5,2};
		
		int k =3; 
		
		// output will be: {7,5,2,3,6,8,9}
		int n= arr.length;
		
		k= k%n;
		
		int newarr []  =new int[n];   //*****************
		
		for(int i=0; i<n; i++) {
			if(i<k) {
				newarr[i]= arr[n-k+i];
			}else {
				newarr[i]= arr[i-k];
			}
		}
		
		for (int i : newarr) {
			System.out.print(i+" ");
		}
		
	}

}
