package arrays;

public class MoveZerosToEnd {
//
	public static void main(String[] args) {
		int[] nums = {1,0,2,3,2,0,0,5,4};
		moveZerosToEnd(nums);
	}
	public static void moveZerosToEnd(int[] nums) {
		
		int j = -1;
		for(int i=0 ; i<nums.length; i++) {
			if(nums[i] == 0) {
				j = i;
			break;
			}
			
		}
		
		if(j == -1)
			System.out.println("There is no zero in array");
		
		for(int i = j+1; i<nums.length;i++) {
			if(nums[i] != 0) {
				nums[j] = nums[i];
				nums[i] = 0;
				j++;
			}
		}
		for(int num : nums)
		System.out.println(num);
	}
}
