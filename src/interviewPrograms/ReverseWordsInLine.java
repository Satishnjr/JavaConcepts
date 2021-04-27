package interviewPrograms;

public class ReverseWordsInLine {

	public static void main(String[] args) {

		String s = "My Name is Satish Kumar";
		String rev = "";
		for (String word : s.split(" ")) {

			// for loop for reversing each word
			for (int i = word.length() - 1; i >= 0; i--) {
				rev = rev + word.charAt(i); // rev += word.charAt(i);
			}
			// adding space after each word
			rev = rev + " "; // rev = " ";
		}
		System.out.println(rev);

	} // o/p: yM emaN si hsitaS ramuK

}
