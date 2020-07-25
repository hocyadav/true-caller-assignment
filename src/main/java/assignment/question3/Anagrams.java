package assignment.question3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
/**
 * @author Hariom Yadav
 * 
 * Question 3 : Given a list of words(consider this a dictionary), 
 * write a method `getAnagrams(String inword)` which will return a list of 
 * all anagrams of the given inWord from the dictionary.Write another 
 * method `getLargestAnagramSet()` to return the largest possible set of anagrams 
 * from this dictionary. For example {flower, fowler, reflow, wolfer} is one set of anagrams. 
 * The goal is to find the largest possible set from the dictionary. The list of words will be 
 * provided along with the assignment
 * 
 */

public class Anagrams {

	/** KEY : string, VALUE : anagrams **/
	private Map<String, Set<String>> dictionary = new HashMap<>();

	/** read file and create dictionary **/
	public void createDictionary2(String filePath) throws IOException {
		System.out.println("reading file - START\n");
		Path path = Paths.get(filePath);

		Files.readAllLines(path).forEach(line -> {
			System.out.println(line);
			String sortStr = sortStr(line);
			dictionary.putIfAbsent(sortStr, new HashSet<>());
			dictionary.get(sortStr).add(line);
		});

		System.out.println("\nreading file - END\n");
	}

	/** print all anagram **/
	public void printMap() {
		this.dictionary.forEach(new BiConsumer<String, Set<String>>() {
			@Override
			public void accept(String t, Set<String> u) {
				System.out.println(t+" "+u);
			}
		});
	}

	/** get anagram set for a given input string **/
	public Set<String> getAnagrams(String inword) {
		String sortStr = sortStr(inword);
		System.out.println("getAnagrams - input word : "+inword);
		return dictionary.get(sortStr);
	}

	/** return set that contain largest anagram count **/
	public Set<String> getLargestAnagramSet() {
		System.out.println("getLargestAnagramSet : ");
		int count = 0;
		Set<String> result = new HashSet<>();
		for(Map.Entry<String, Set<String>> e : dictionary.entrySet()) {
			Set<String> value = e.getValue();
			int size = value.size();
			if(size > count) {
				result.clear();	//delete old record
				result.addAll(value); //update new record
				count = size;
			}
		}
		return result;
	}

	/** sort given string in alphabetical order **/
	private String sortStr(String s) {
		char[] c = s.toCharArray();
		Arrays.sort(c);
		return String.valueOf(c);
	}
}
