package udemy.part1;

public class ReverseString {
//Practise Exercise : reverse String logic-Palindrome
	public static void main(String[] args) {

		String s = "Nihit";
		String rev = "";

		for (int i = s.length() - 1; i <= 0; i--) {

			rev = rev + s.charAt(i);

		}
		System.out.println(rev);

	}

}
