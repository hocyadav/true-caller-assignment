package assignment.question2;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Hariom Yadav
 * 
 * Question 2 : Given a string of words, sort them in ascending order of characters as 
 * they appear in the alphabet. Write a method `getSortedChars(CharSequence charseq)` 
 * which returns a List of characters sorted in alphabetical order. Optimize for large 
 * strings and small buffers. Ignore punctuation and whitespaces. Comparison can be done 
 * while ignoring case.
 *
 */
public class SortedChars {
	
	public List<Character> getSortedChars(String inputStr) {
		List<Character> result = new ArrayList<>();
		
		if(inputStr == null || inputStr.length() == 0)
			return result;
		
		int[] arr = getMap(inputStr);	//store string to char array - hash map

		for (int i = 0; i < arr.length; i++) { //generate final result
			while(arr[i]-- > 0) {
				char c = (char) ('a' + i);
				result.add(c);
			}
		}
		
		return result;
	}

	/** for a given string store in array as hash map : key as char , value as char count in str**/
	private int[] getMap(String inputStr) {
		int[] arr = new int[26];
		for(int i = 0; i < inputStr.length(); i++) {
			char c = inputStr.charAt(i);
			arr[c - 'a']++;
		}
		return arr;
	}
}
