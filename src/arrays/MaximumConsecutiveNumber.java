package arrays;

public class MaximumConsecutiveNumber {
	
	public static void main(String[] args) {
		int[] nums = {1,1,1,0,1,1,1,1,0,1,1};
		findMaximumConsecutiveNum(nums);
	}
	
	
	public static void findMaximumConsecutiveNum(int[] nums) {
		
		int count = 1;
		int maxCount = 0;
		
		for(int i = 1; i< nums.length;i++) {
			if(nums[i] == nums[i-1]) {
				count++;
			}
			else {
				maxCount = Math.max(maxCount, count);
				count = 1;
				}
				
		}
		System.out.println(maxCount);
	}

}
