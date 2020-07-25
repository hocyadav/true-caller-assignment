package assignment.question1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hariom Yadav
 * 
 * Question 1 : Given a sequence of numbers, write a method to return a sorted list when each 
 * item is inserted. Create a CustomList implementation which returns a sorted list of items
 *  when an item is added to it.
 */

/**Node data structure **/
class Node {
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
	}
}

/** Custom list implementation **/
public class CustomList {
	Node head;

	/** insert new data into customList : Time Complexity : O(n)**/
	public void add(int key) {
		Node nn = new Node(key);
		if(head == null) {
			head = nn;
			printCustomList();
			return;
		}
		if(key <= head.data) {
			nn.next = head;
			head = nn;		//move head left
			printCustomList();
			return;
		}
		Node temp = head;
		while(temp.next != null && temp.next.data < key) {
			temp = temp.next;
		}
		nn.next = temp.next;
		temp.next = nn;
		//printCustomList();
	}

	/** print custom list : Time Complexity : O(n)**/
	public void printCustomList() {
		Node it = head;
		List<Integer> list = new ArrayList<>();

		System.out.print("CustomList : ");
		while(it != null) {
			System.out.print(it.data+" ");
			list.add(it.data);
			it = it.next;
		}
		System.out.println();
	}

	/** convert customeList to array for unit testing **/
	public List<Integer> getCustomListToArray() {
		Node it = head;
		List<Integer> list = new ArrayList<>();
		while(it != null) {
			list.add(it.data);
			it = it.next;
		}
		return list;
	}
}
