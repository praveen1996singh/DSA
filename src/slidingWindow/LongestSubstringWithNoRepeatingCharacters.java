package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithNoRepeatingCharacters {
	
	public static void main(String[] args) {
	System.out.println(findLongestSubstringWithNoRepeatingCharacters("pddkkew"));
	}
	
	
	public static int findLongestSubstringWithNoRepeatingCharacters(String str) {
		
		int i = 0;
		int j = 0;
		int length = str.length();
		int maxLenth = 0;
		Map<Character, Integer> map = new HashMap<>();
		
		while(j< length) {
			
			if(map.size() == 0)
				map.put(str.charAt(j), 1);
			else
				if(map.containsKey(str.charAt(j)))
					map.put(str.charAt(j), map.get(str.charAt(j))+1);
				else
					map.put(str.charAt(j), 1);
			
			if(map.size() == j-i+1) {
				maxLenth = Math.max(maxLenth, map.size());
			}
			
			while(map.size() < j-i+1) {
				if(map.get(str.charAt(i)) > 1)
					map.put(str.charAt(i), map.get(str.charAt(i))- 1);
				else
					map.remove(str.charAt(i));
				
				i++;
			}
			
			j++;
				
			
		}
		return maxLenth;
	}

}
