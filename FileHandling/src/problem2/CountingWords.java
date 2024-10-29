package problem2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountingWords {
	public static void main(String[] args) throws Exception {
		BufferedReader fr = null;
		try {
			fr = new BufferedReader(new FileReader("C:/Users/dac/Documents/vijay.txt"));
			String line;
			int countCharacters = 0, countWords = 0, countLines = 0;
			int longestWordLength = 0, ShortestWordLength = 0;
			String Longestword = "", ShortestWord = "";

			while ((line = fr.readLine()) != null) {
				countLines++;
				String[] words = line.split("\\s+");
				countWords += words.length;

//                for (String word : words) {
//                    if (longestWordLength < word.length()) {
//                        longestWordLength = word.length();
//                    }
				// }
				ShortestWordLength = words[0].length();
				for (int i = 0; i < words.length; i++) {

					// longest
					if (longestWordLength < words[i].length()) {
						longestWordLength = words[i].length();
						Longestword = words[i];

					}

					//
					if (words[i].length() < ShortestWordLength) {
						ShortestWordLength = words[i].length();
						ShortestWord = words[i];
					}

				}

				countCharacters += line.length();

			}

			System.out.println("Number of characters: " + countCharacters);
			System.out.println("Number of words: " + countWords);
			System.out.println("Number of lines: " + countLines);
			System.out.println("Length of longest word: " + longestWordLength);
			System.out.println("longest word: " + Longestword);
			System.out.println("Length of shortest word: " + ShortestWordLength);
			System.out.println("Shortest word: " + ShortestWord);

		} catch (Exception e) {
			System.err.println(e);
		} finally {
			if (fr != null) {
				fr.close();
			}
		}
	}
}
