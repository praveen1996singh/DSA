package slidingWindow;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class MaxOfEachSlidingWindow {
	
	public static void main(String[] args) {}
	
	
	public static List<Integer> maxOfEachSlide(int[] nums, int k){
		
		int i = 0;
		int j = 0;
		int length = nums.length;
		Deque<Integer> deque = new LinkedList<>();
		List<Integer> maxList = new ArrayList<>();
		
		while(j<length) {
			
			if(j-i+1 == k) {
				maxList.add(deque.peek());
				if(nums[i]<= deque.peek())
					deque.poll();
				i++;
			}
			
			j++;
		}
		return null;
	}

}
