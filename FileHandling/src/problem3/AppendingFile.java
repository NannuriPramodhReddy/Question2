package problem3;

import java.io.FileReader;
import java.io.FileWriter;

public class AppendingFile {
	
	public static void main(String[] args) throws Exception {

		try {
			FileReader fr = new FileReader("C:/Users/dac/Documents/vijay.txt");
			FileWriter fw = new FileWriter("C:/Users/dac/Documents/outputvijay.txt",true);
			int i;
			while ((i = fr.read()) != -1) {
				fw.write((char) i);
				System.out.print((char) i);
			}
			fw.write("\n");
			
			fr.close();
			fw.close();
		} catch (Exception e) {
			System.err.println(e);
		}
		System.out.println("rest of thecode follows...");
	}


}
