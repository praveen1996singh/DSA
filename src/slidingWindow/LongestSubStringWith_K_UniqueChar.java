package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWith_K_UniqueChar {
	
	public static void longestSubString(String str, int k) {
		
		int i = 0;
		int j = 0;
		int length = str.length();
		int longestSubArray = 0;
		Map<Character,Integer> map = new HashMap<>();
		
		while(j < length) {
			
			if(map.containsKey(str.charAt(j)))
				map.put(str.charAt(j), map.get(str.charAt(j)+1));
			else
				map.put(str.charAt(j), 1);
			
			if(map.size() < k) {
				
			}
			
			if(map.size() == k) {
				int size = 0;
				map.values().stream().mapToInt(Integer :: intValue).sum();
			}
		}
		
		
	}

}
