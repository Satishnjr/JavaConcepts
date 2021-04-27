package interviewPrograms;

public class ReverseWordsInLine2 {

	public static void main(String[] args) {

		{
			String s = "My Name is Satish";
			String rev = " ";
			String word[] = s.split(" ");

			for (int i = word.length - 1; i >= 0; i--) {
				rev = rev + word[i] + " ";

			}
			System.out.println(rev);

		}
	}
}
