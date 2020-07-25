package assignment;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import assignment.question1.CustomList;
import assignment.question2.SortedChars;
import assignment.question3.Anagrams;

/**
 * 
 * @author Hariom Yadav
 *
 */
public class Test {
	public static void main(String[] args) throws IOException {
		/** Q1 : Custom list test **/
		CustomList customList = new CustomList();
		customList.add(10); 
		customList.add(1); 
		customList.add(-9);
		customList.add(80); 
		customList.add(19);
		customList.add(70); 
		customList.add(7);
		customList.add(-1);
		customList.add(999);
		customList.add(0);
		System.out.println("------------------------------------");
		
		
		/** Q2 : Sorted char test **/
		SortedChars sortedChars = new SortedChars();
		List<Character> list = sortedChars.getSortedChars("baabzyy");
		System.out.println(list);
		System.out.println("------------------------------------");
		
		
		
		/** Q3 : getAnagrams test **/
		String filePath = "question3input2.txt";
		String filePath2 = "question3input.txt";
		
		Anagrams anagrams = new Anagrams();
		anagrams.createDictionary2(filePath2);
		
		System.out.println(anagrams.getAnagrams("egilnprs")+"\n");
		System.out.println(anagrams.getAnagrams("acimnoty")+"\n");
		System.out.println(anagrams.getAnagrams("relast")+"\n");
		System.out.println(anagrams.getLargestAnagramSet()+"\n");
	}
}
