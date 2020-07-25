package assignment.question1;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

/**
 * 
 * @author Hariom Yadav
 *
 */
public class CustomListTest {
	
	@Test
	public void testIndexValue() {
		CustomList customList = new CustomList();
		customList.add(10);
		customList.add(-1);
		customList.add(5);
		
		List<Integer> list = customList.getCustomListToArray();
		
		assertTrue(list.get(0) == -1);
		assertFalse(list.get(0) == 99);

		assertTrue(list.get(1) == 5);
		assertTrue(list.get(2) == 10);
	}

	@Test
	public void testDuplicate() {
		CustomList customList = new CustomList();
		customList.add(10);
		customList.add(10);
		customList.add(10);
		customList.add(10);
		
		List<Integer> list = customList.getCustomListToArray();//10, 10, 10, 10
		
		assertTrue(list.get(0) == 10);
		assertTrue(list.get(1) == 10);
		assertTrue(list.get(2) == 10);
		assertTrue(list.get(3) == 10);
	}
}
