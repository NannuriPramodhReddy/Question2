package problem5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		Person p = new Person("vijay", 21);
		System.out.println(p);
		
		//serilization...
		FileOutputStream fo = new FileOutputStream("Person.src");
	    ObjectOutputStream ooo = new ObjectOutputStream(fo);
	    ooo.writeObject(p);
	   
	    //deserilization
	    FileInputStream fs =new FileInputStream("Person.src");
	    ObjectInputStream ooi = new ObjectInputStream(fs);
	    Person p2= (Person)ooi.readObject();
	    
	    System.out.println(p2);
	}

}
