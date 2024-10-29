package problem1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadingAndWriting {

	public static void main(String[] args) throws Exception {

		try {
			FileReader fr = new FileReader("C:/Users/dac/Documents/vijay1.txt");
			FileWriter fw = new FileWriter("C:/Users/dac/Documents/outputvijay.txt");
			int i;
			while ((i = fr.read()) != -1) {
				fw.write((char) i);
				System.out.print((char) i);
			}
			fr.close();
			fw.close();
		} catch (Exception e) {
			System.err.println(e);
		}
		System.out.println("rest of thecode follows...");
	}

}
