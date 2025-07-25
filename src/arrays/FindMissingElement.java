package arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 5, 6};
        int N = 6;
       // int missingNumber = findMissingNumberXOR(arr, N);
        
        int missingNumber2 = findMissingElement(arr, N);
        System.out.println(missingNumber2);
	}
	
	public static int findMissingElement(int[] nums,int N) {
	//	int sum = 10
		int totalsum = 0;
		int sum = N*(N+1)/2;
		for(int num : nums)
			totalsum = totalsum + num;
		
		return sum - totalsum;
			
	}
	
	    public static int findMissingNumberXOR(int[] arr, int N) {
	        int xorArray = 0;
	        for (int num : arr) {
	            xorArray ^= num;
	        }
	        int xorRange = 0;
	        for (int i = 1; i <= N; i++) {
	            xorRange ^= i;
	        }
	        return xorArray ^ xorRange;
	    }
}
