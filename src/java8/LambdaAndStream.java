package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaAndStream {
	public static void main(String[] args) {
	List<Integer> intList	= Arrays.asList(2,3,4,5,6,7,8,9,10);
		List<String> strList	= Arrays.asList("hello","How","are","you");
	//saparateOddAndEven(intList);
	//List<Integer> intList = Arrays.asList(10, 13, 14, 13, 19, 10, 25, 28, 25);
	//removeDuplicates(intList);
		//findFrequencyOfEachCharacterInString("String");
		
		
		List<Double> decibelList = Arrays.asList(55.3, 72.8, 60.0, 85.2, 69.5);
		//sortDecimal(decibelList);
		//joinstring(strList);
	//	findMaxMin(intList);
		
		int[] arr1 = {10, 13, 14, 13, 19, 10, 25, 28, 25};
		int[] arr2 = {2,3,4,5,6,7,8,9,10};
		//mergeTwoArrays(arr1, arr2);
		//anagramString("geeks", "kseeg") ;
		//secondLargestNum(arr1);
		//sortAccordingToLength(strList);
		findCommonElementsBetweenTwoArrays(arr1,arr2);
	}
	
	public static void saparateOddAndEven(List<Integer> intList) {
		
	Map<Boolean, List<Integer>> map =	intList.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));
	Map<String, List<Integer>> map2 =intList.stream()
	.collect(Collectors.groupingBy(num -> (num % 2 == 0) ? "EVEN" :"ODD"));
		System.out.println(map);
		
		System.out.println("===============");
		System.out.println(map2);
	}
	
	public static void removeDuplicates(List<Integer> intList) {
	List<Integer> finalList =	intList.stream()
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap :: new,Collectors.counting()))
		.entrySet().stream()
		.filter(entry -> entry.getValue()==1).map(Map.Entry :: getKey).collect(Collectors.toList());
		
	System.out.println(finalList);
	}
	
	public static void findFrequencyOfEachCharacterInString(String str) {
	Map<Character,Long> map =	str.chars()
		.mapToObj(c -> (char)c)
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap :: new,Collectors.counting()));
	System.out.println(map);
	}
	
	//sort the given list of decimals in reverse order
	
	public static void sortDecimal(List<Double> longList) {
		System.out.println(longList.stream().sorted(Comparator.reverseOrder()).toList());
	}
	
	// Given the list of string , kjin the strings with '[' as prefix, ']' as suffix and ',' as delimeter
	
	public static void joinstring(List<String> strList) {
		
	 String str = strList.stream().collect(Collectors.joining(",", "[", "]"));
	 System.out.println(str);
	}
	
	public static void findMaxMin(List<Integer> intList) {
		System.out.println("Max :: " +intList.stream().sorted().findFirst().get());
		System.out.println("Min :: "+ intList.stream().sorted(Comparator.reverseOrder()).findFirst().get());
	}
	
	//Merger two unsorted arrays into single sorted array
	
	public static void mergeTwoArrays(int[] arr1, int[] arr2) {
		System.out.println(Stream.concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed()).sorted().toList());
	}
	
	public static void anagramString(String s1, String s2) {
	//	s1.chars().mapToObj(c -> String.valueOf((char)c).collect(Collectors.joining()));
		String str1 = s1.chars().mapToObj(c -> String.valueOf((char)c)).sorted().collect(Collectors.joining());
		String str2 = s2.chars().mapToObj(c -> String.valueOf((char)c)).sorted().collect(Collectors.joining());
		if(str1.equals(str2))
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}
	
	public static void sumOfAllDigits(int num) {
		String.valueOf(num).chars().map(c -> Character.getNumericValue(c)).sum();
	}

	public static void secondLargestNum(int[] intArr) {
		
		System.out.println(Arrays.stream(intArr).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
	}
	
	public static void sortAccordingToLength(List<String> strList) {
	List<String> sorted =	strList.stream().sorted(Comparator.comparing(String :: length)).collect(Collectors.toList());
	System.out.println(sorted);
	}
	
	public static void sumIntegerArray(int[] intArr) {
		
		Arrays.stream(intArr).average();
	}
	
	public static void findCommonElementsBetweenTwoArrays(int[] arr1, int[] arr2) {
	List<Integer> list2 =	Arrays.stream(arr2).boxed().collect(Collectors.toList());
	List<Integer> commonElements =  Arrays.stream(arr1).filter(num -> list2.contains(num)).boxed().distinct().collect(Collectors.toList());
	
	System.out.println(commonElements);
		
	}
}
