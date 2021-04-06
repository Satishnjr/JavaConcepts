package strings;

import java.io.BufferedReader;
import java.io.FileReader;

//15. Java Program to find the number of the words in the given text file
public class CountWordFile {
	public static void main(String[] args) throws Exception {
		String line;
		int count = 0;

		// Opens a file in read mode
		FileReader file = new FileReader("data.txt ");
		BufferedReader br = new BufferedReader(file);

		// Gets each line till end of file is reached
		while ((line = br.readLine()) != null) {
			// Splits each line into words
			String words[] = line.split("");
			// Counts each word
			count = count + words.length;

		}

		System.out.println("Number of words present in given file: " + count);
		br.close();
	}
}