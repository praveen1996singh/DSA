package slidingWindow;

public class MaxSubArrayOfSum_K {
	
	public static void main(String[] args) {
		
		int[] nums = {10, 5, 2, 7, 1, -10};
		findMaxSubArrayOfSum_K(nums, 15);
	}
	
	public static void findMaxSubArrayOfSum_K(int[] nums, int sum) {
		
		int i=0;
		int j=0;
		int length = nums.length;
		int maxSubArray = 0;
		int currentSum = 0;
		
		while(j < length) {
			
			currentSum = currentSum + nums[j];
			
			if(currentSum == sum) {
				maxSubArray = Math.max(maxSubArray, j -i +1);
			}
			
			while(currentSum > sum) {
				currentSum = currentSum - nums[i];
				i++;
			}
			
			j++;
		}
		
		System.out.println("Max sub array :: "+ maxSubArray);
	}

}
