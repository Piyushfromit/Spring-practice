package ArrayIntQuestion;

// Two sum of an array: In this question you will be given 
// an array arr and a target. You have to return the indices 
// of the two numbers such that they add up to target.

public class TwoSum {
	
	
	public static void main(String[] args) {
		
		
		int [] nums = {2,7,11,15};
		int target = 9;
		
		for(int i=0; i<nums.length-1; i++){
            
			for(int j=i+1; j<nums.length; j++){
                
				if(nums[i]+nums[j]==target){
                    System.out.println(i+" "+j);
                    break;
                }
            }
        }
       
		
		
		
		
	}
	
	
	
	
	

}
