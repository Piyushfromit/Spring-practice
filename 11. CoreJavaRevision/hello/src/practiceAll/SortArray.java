package practiceAll;

public class SortArray {
	
	public static void main(String[] args) {
		
		int array [] = {4,5,6,7,3,2,1};
		
		//System.out.println(array.length);
		
		
		for(int i=0; i< array.length-1; i++){
		    
		    for(int j=i+1; j<array.length; j++){
		       
		        if( array[j]<array[i] ){
		           int num = array[i];
		            array[i]=array[j];
		            array[j]=num;
		        }
		    }
		}
		

		
		for (int i : array) {
			System.out.println(i);
		}
		
	}

}
