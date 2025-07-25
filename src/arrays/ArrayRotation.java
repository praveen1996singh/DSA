package arrays;

public class ArrayRotation {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		//rotateArray(arr,3);
		
		System.out.println("==================");
		rotateArrayOptimalSolution(arr, 3);
	}
	
	public static void rotateArray(int[] nums, int d) {
		d = d % nums.length;
		int[] temp = new int[d];
		
		for(int i =0 ; i<d ;i++) {
			temp[i] = nums[i];
		}
		// length  7
		// d 2
		//1,2,3,4,5,6,7
		for(int i = 0; i< nums.length -d ;i++) {
			
			nums[i] = nums[i+d];
		}
		
		for(int i = 0; i< temp.length;i++) {
			nums[nums.length -d+i] = temp[i];
		}
		for(int num : nums)
		System.out.println(num);
		
	}
	
	public static void rotateArrayOptimalSolution(int[] nums, int d) {
		int length = nums.length;
		reverseArray(nums,0,d-1);
		reverseArray(nums, d, length-1);
		reverseArray(nums, 0, length-1);
		
		for(int num : nums)
			System.out.println(num);
	}
	
	private static void reverseArray(int[] nums,int a, int b) {
		for(int i = a; i< b+1 ;i++) {
			int temp = nums[i];
			nums[i] = nums[b];
			nums[b] = temp;
			b--;
		}
	}

}
