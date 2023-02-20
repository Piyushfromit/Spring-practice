package practiceAll;

import java.util.ArrayList;
import java.util.Collections;

public class ShortArrayListByTwoPointer {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<>();
		
		num.add(8);
		num.add(6);
		num.add(12);
		num.add(6);
		
		
		int size = num.size();
		
		for(int i=0; i<size; i++) {
			
			for (int j=i+1; j<size; j++) {
				
				if(num.get(i)>  num.get(j)) {
					
					int temp = num.get(i);
					
					num.set(i, num.get(j));
					
					num.set(j, temp);
					
				}
			}
		}
		
		
	   //  Collections.sort(num);
		
	  System.out.println(num);
		
	}
	
	
	
	

}
