package problem2;

import java.io.FileReader;

public class DemoCountingAndFinding {
	
	public static void main(String[] args) throws  Exception {
		
		FileReader fr = new FileReader("C:/Users/dac/Documents/vijay.txt");
		
		int i,cc=0,cl=0,cw=0,length=0,c=0;
		while((i=fr.read())!=-1)
		{
			cc++;
			//System.out.print((char)i);
			if(i == '\n')
			{
				cl++;
			}
			if(i==' ')
			{
				cw++;
				
			}
		}
		fr.close();
		
		System.out.println("count of chars: " + cc);
		System.out.println("count of lines: "+(cl+1));
		System.out.println("count of words: "+(cw+cl+1));
		System.out.println("");
	}


}
