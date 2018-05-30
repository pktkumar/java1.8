package test;

import java.util.HashMap;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Person, String> hashM=new HashMap<Person, String>();
		
		hashM.put(new Person("Kumar", 42), "first");
		hashM.put(new Person("Vadu", 100), "second");
		
		Set<Person> newSet= hashM.keySet();
		
		for(Person p:newSet) {
			System.out.println(p);
		}
	}

}
