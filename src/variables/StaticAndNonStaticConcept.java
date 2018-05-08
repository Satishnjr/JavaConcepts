package variables;

public class StaticAndNonStaticConcept {

	// Global Variables
	String name = "Tom"; // non-static GV
	static int age = 25; // static GV

	public static void main(String[] args) {

		// how to call static methods & variables:
		// 1. direct calling
		sum();
		System.out.println(age);

		// 2. calling by class name
		StaticAndNonStaticConcept.sum();
		System.out.println(StaticAndNonStaticConcept.age);

		// how to call non-static methods & variables:
		// by creating obj for class name
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail(); // 1. through obj ref calling method
		System.out.println(obj.name); // 1. through obj ref calling non-static GV

		// can i access static methods by using object reference? : yes
		obj.sum(); // it will give warning, The static method sum() from the type StaticAndNonStaticConcept
					// should be accessed in a static way(but it will print o/p) --> we wont prefer this				
	}

	public void sendMail() {
		System.out.println("send mail method");
	}

	public static void sum() {
		System.out.println("sum method");
	}

}
