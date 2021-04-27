package interviewPrograms;

public class RemoveJunkCharacters {

	public static void main(String[] args) {
		// Regular Expression [^a-zA-Z0-9]
		String s = "硒檢測工具 Selenium01234567890";

		System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));

		System.out.println(s.replaceAll("[^a-z]", "")); // to print only alphabets(small letters)
		System.out.println(s.replaceAll("[^A-Z]", "")); // to print only alphabets(caps letters)
		System.out.println(s.replaceAll("[^0-9]", "")); // to print only numbers
		System.out.println(s.replaceAll("[a-zA-Z0-9]", "")); // to print only junk values

	}

}
