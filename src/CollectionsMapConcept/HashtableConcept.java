package CollectionsMapConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashtableConcept {

	public static void main(String[] args) {

		Hashtable ht1 = new Hashtable();

		ht1.put("1", "Selenium");
		ht1.put("2", "QTP");
		ht1.put("3", "RFT");

		// create a clone copy/shallow copy: ht2 creating dummy obj of ht1
		Hashtable ht2 = new Hashtable();
		ht2 = (Hashtable) ht1.clone();

		System.out.println("values from ht1:" + ht1);
		System.out.println("values from ht2:" + ht2);

		// to clear h1 data, but ht2 data remains same. it will not delete
		ht1.clear();

		System.out.println("values from ht1:" + ht1);
		System.out.println("values from ht2:" + ht2);

		// contains value:
		Hashtable hash = new Hashtable();
		hash.put("A", "satish");
		hash.put("B", "Kumar");
		hash.put("C", "Reddy");

		if (hash.containsValue("satish"))
			System.out.println("value is found");

		// print all the values from hashtable using -- Enumeration -- elements():
		System.out.println("print values from hash using enumeration");
		Enumeration e = hash.elements();// to stote hashtable data, instead of for loop, we use elements() method, cant
										// iterate through for loop
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		// get all the values from hashtable using -- entryset() -- set of hashtable values:
	 
        System.out.println("print values from hash using entry set");
		Set s = hash.entrySet();
		System.out.println(s);
		
		//check both the Hashtables are equal or not:
		Hashtable hash2 = new Hashtable();
		hash2.put("A", "satish");
		hash2.put("B", "Kumar");
		hash2.put("C", "Reddy");
		hash2.put("C", "Reddy"); //it contains only unique values
	
		//no null key & null values
		//hash2.put("D", null); //null pointer exception
		//hash2.put(null, "RPA");
		
		
		if(hash.equals(hash2))
		System.out.println("both are equal");
		
		//get the value from a key:
		System.out.println(hash.get("A"));
		
		//get the hashcode of the hashtable object:
		System.out.println("hash code of value of" +  hash2.hashCode());
		
		//generics
		Hashtable<String, String> h = new Hashtable<String, String>();
	}

}
