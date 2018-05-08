package CollectionsListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		// add
		ll.add("selenium");
		ll.add("QTP");
		ll.add("RFT");
		ll.add("RPA");
		ll.add("UFT");
		System.out.println("contents of linked list:" + ll);

		// addFirst:
		ll.addFirst("satish");

		// addLast:
		ll.addLast("kumar");
		System.out.println("contents of linked list:" + ll);

		// get:
		System.out.println(ll.get(0));

		// set:
		ll.set(0, "reddy");
		System.out.println(ll.get(0));

		// remove first & last element:
		ll.removeFirst();
		ll.removeLast();
		System.out.println("contents of linked list:" + ll);

		ll.remove(2); // based on index it will remove
		System.out.println("contents of linked list:" + ll);

		// How to print all the values of Linked List:
		// 1.using for loop
		System.out.println("*****using for loop:");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

		// 2.using Advanced for loop
		System.out.println("*****using Advanced for loop:");
		for (String str : ll) {
			System.out.println(str);
		}

		// 2.using Iterator
		System.out.println("*****using Iterator:");
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// 2.using While loop
		System.out.println("*****using While loop:");
		int num = 0;
		while (ll.size() > num) {
			System.out.println(ll.get(num));
			num++;
		}

	}

}
