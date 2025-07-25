package arrays;

public class LongestSubArrayWithGivenSum {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,1,1,1,1,4,2,3};
		findLongestSubArrayWithSumK(nums, 4);
	}
	
	public static void findLongestSubArrayWithSumK(int[] nums, int k) {
		int j = 0;
		int i = 0;
		int sum = 0;
		int longestSubArray = 0;
		while(j< nums.length) {
			sum = sum + nums[j];
			while(sum > k) {
				sum = sum - nums[i];
				i++;
			}
			
			if(sum == k) {
				longestSubArray = Math.max(longestSubArray, j -i+1);
				
			}
			
			
			
			j++;
		}
		
		System.out.println(longestSubArray);
	}
}
