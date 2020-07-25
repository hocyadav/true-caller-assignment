package assignment.question3;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Set;

import org.junit.Test;

/**
 * 
 * @author Hariom Yadav
 *
 */
public class AnagramsTest {

	@Test
	public void testLargestAnagramSet() throws IOException, InterruptedException {

		String filePath2 = "question3input.txt";
		
		Anagrams anagrams = new Anagrams();
		anagrams.createDictionary2(filePath2);
		
		Set<String> largestAnagramSet = anagrams.getLargestAnagramSet();
		System.out.println(largestAnagramSet+"\n");
		
		assertTrue("largest set", largestAnagramSet.contains("relast"));
	}
	
	@Test
	public void testLargestAnagramSet2() throws IOException, InterruptedException {
		
		String filePath2 = "question3input2.txt";
		
		Anagrams anagrams = new Anagrams();
		anagrams.createDictionary2(filePath2);
		
		Set<String> largestAnagramSet = anagrams.getLargestAnagramSet();
		System.out.println(largestAnagramSet+"\n");
		
		assertTrue("largest set", largestAnagramSet.contains("hariom"));
	}
	
	@Test
	public void testGetAnagram() throws IOException, InterruptedException {
		
		String filePath = "question3input2.txt";
		
		Anagrams anagrams = new Anagrams();
		anagrams.createDictionary2(filePath);
		
		Set<String> anagramsSet = anagrams.getAnagrams("hariom");
		assertTrue("anagram set", anagramsSet.contains("hariom"));
	}
}
