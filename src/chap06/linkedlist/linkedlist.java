package chap06.linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {
	
	static void printList(LinkedList<Integer> list) {
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			Integer e = it.next();
			String separator;
			if(it.hasNext())
				separator = "->";
			else
				separator = "\n";
			
			System.out.print(e + separator);
		}
		
	}
	
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Collections.sort(list);
		printList(list);
		
		
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(5);
		list2.add(1);
		list2.add(4);
		list2.add(3);
		list2.add(2);
		printList(list2);		
		
		
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		System.out.println(Collections.binarySearch(list, 1));
		
	}
}






