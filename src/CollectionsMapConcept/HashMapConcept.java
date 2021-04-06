package CollectionsMapConcept;

import java.util.HashMap;
import java.util.Map.Entry;

import CollectionsListConcept.Employee;

public class HashMapConcept {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "RFT");
		hm.put(4, "RPA");

		System.out.println("output1");
		System.out.println(hm.get(1)); // Selenium
		System.out.println(hm.get(4)); // RPA

		// To print all the values from Hashmap
		for (Entry m : hm.entrySet()) { // hm.entryset() will store complete all the values available in HashMap
			System.out.println("output2");
			System.out.println(m.getKey() + " " + m.getValue());

		}
		System.out.println("output3");
		System.out.println(hm);
		hm.remove(3); // it doesnt maintain the order
		System.out.println("output4");
		System.out.println(hm);

		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();

		Employee e1 = new Employee("Satish", 20, "QA");
		Employee e2 = new Employee("Kumar", 25, "Dev");
		Employee e3 = new Employee("Reddy", 30, "Analyst");
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);

		// traverse the HashMap
		for (Entry<Integer, Employee> m : emp.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.println("output5");
			System.out.println("Employee " + key + " Info: ");
			System.out.println(e.name + " " + e.age + " " + e.dept);

		}
	}
}
