package interviewPrograms;

public class SwapTwoStrings {

	public static void main(String[] args) {

		String a = "Hello";
		String b = "World";

		System.out.println("Before swapping:");
		System.out.println("value of a is:" + a);
		System.out.println("value of b is:" + b);

		a = a + b; // HelloWorld

		b = a.substring(0, a.length() - b.length()); // Hello
		a = a.substring(b.length()); // World

		System.out.println("After swapping:");
		System.out.println("value of a is:" + a);
		System.out.println("value of b is:" + b);
	}
}
