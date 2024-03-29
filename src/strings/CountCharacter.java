package strings;

//1. Java Program to count the total number of characters in a string
public class CountCharacter {

	public static void main(String[] args) {
		String s = "The best of both worlds";
		int count = 0;

		// Counts each character except space
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ')
				count++;
		}
		// Displays the total number of characters present in the given string
		System.out.println("Total number of characters in a string: " + count);
	}
}
