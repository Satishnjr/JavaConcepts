package strings;

//8. Java Program to replace the spaces of a string with a specific character
public class ReplaceSpace {
	public static void main(String[] args) {
		String string = "Once in a blue moon";
		char ch = '-';

		// Replace space with specific character ch
		string = string.replace(' ', ch);

		System.out.println("String after replacing spaces with given character: ");
		System.out.println(string);
	}
}
