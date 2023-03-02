package practiceAll;

import java.util.ArrayList;


public class ShortArrayListByTwoPointer {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		nums.add(12);
		nums.add(18);
		nums.add(4);
		nums.add(8);
		nums.add(6);
		nums.add(12);
		nums.add(6);
		
		for(int i=0; i<nums.size(); i++) {
			
			for(int j=i+1; j<nums.size(); j++) {
				
				if(nums.get(i)>nums.get(j)) {
					int temp =nums.get(i);
					
					nums.set(i,nums.get(j) );
					nums.set(j,temp );
				}
				
			}
		}
		
		System.out.println(nums);
		
	}


}


