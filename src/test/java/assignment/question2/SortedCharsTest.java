package assignment.question2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * 
 * @author Hariom Yadav
 *
 */
public class SortedCharsTest {

	@Test
	public void testSorted() {
		
		SortedChars sortedChars = new SortedChars();
		List<Character> result = sortedChars.getSortedChars("baabzyy");
		System.out.println(result);
		List<Character> expected = Arrays.asList('a','a','b','b','y','y','z') ;
		
		assertTrue(result.equals(expected));
		
	}
	@Test
	public void testNegativeCase() {
		
		SortedChars sortedChars = new SortedChars();
		List<Character> result = sortedChars.getSortedChars("hariomyadav");
		
		List<Character> expected = Arrays.asList('h','a','r','i') ;
		
		assertFalse(result.equals(expected));
		
	}
}
