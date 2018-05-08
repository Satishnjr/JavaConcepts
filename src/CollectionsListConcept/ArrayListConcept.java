package CollectionsListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {

		// static array -- size is fixed
		int a[] = new int[3]; // here only 3 values is allowed

		// dynamic array--size is not fixed
		// 1. contains duplicate values
		// 2. maintains insertion order
		// 3. synchronised
		// 4. allows random access to fetch the element bcoz it stores the values based
		// on its index

		ArrayList ar = new ArrayList(); // non-generic
		ar.add(10); // 0 -index
		ar.add(20); // 1
		ar.add(30); // 2
		System.out.println(ar.size());
		System.out.println("**********");

		ar.add(40); // 3
		ar.add(50); // 4
		ar.add(50); // 5 --duplicate value

		System.out.println(ar.size()); // size of array list
		System.out.println("**********");
		System.out.println(ar.get(4)); // to get the value from an index

		System.out.println("**********");
		// to print all the values from an array
		// 1. using for loop
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("**********");

		// non-generic vs generic:
		ArrayList<Integer> ar1 = new ArrayList<Integer>(); // generic--integer values
		ar1.add(10);

		ArrayList<String> ar2 = new ArrayList<String>(); // generic--string values
		ar2.add("selenum");

		ArrayList<E> ar3 = new ArrayList<E>();  // here we can store any kind of data eg; string, integer...

		// Employee class objects:

		Employee e1 = new Employee("naveen", 25, "qa");
		Employee e2 = new Employee("ramesh", 26, "dev");
		Employee e3 = new Employee("suresh", 27, "admin");

		// create arraylist:

		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);

		// iterator to traverse the values:
		Iterator<Employee> it = ar4.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		System.out.println("**********");

		// add all
		ArrayList ar5 = new ArrayList();
		ar5.add("selenium");
		ar5.add("qtp");
		ar5.add("java");

		ArrayList ar6 = new ArrayList();
		ar6.add("automation");
		ar6.add("manual");
		ar6.add("testing");

		ar5.addAll(ar6);

		for (int i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		System.out.println("**********");
		
		//remove all
		ar5.removeAll(ar6);

		for (int i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		System.out.println("**********");
		
		//retain all
		ArrayList ar7 = new ArrayList();
		ar7.add("selenium");
		ar7.add("qtp");
		ar7.add("java");

		ArrayList ar8 = new ArrayList();
		ar8.add("automation");
		ar8.add("selenium");
		ar8.add("testing");

		ar7.retainAll(ar8);

		for (int i = 0; i < ar7.size(); i++) {
			System.out.println(ar7.get(i));
		}
	}

}
