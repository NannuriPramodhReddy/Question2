package problem5;

import java.io.Serializable;

public class Person implements Serializable {
	
	private String name;
	transient private int age;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
