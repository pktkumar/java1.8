package testNew;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TestHaspMap {

	public static void main(String[] args) {
			
		HashMap<Person, String> personDetails = new HashMap<Person, String>();
		
			
		
		
		personDetails.put(new Person("Kumar", 55),"test1");
		personDetails.put(new Person("Kumar Vadu", 50),"test2");	
		//System.out.println(personDetails);
		
		
		 
        Set<Person> keys = personDetails.keySet();
        for(Person p:keys){
            System.out.println(p);
        }
		
        
        Collection<String> value = personDetails.values();
        for(String p:value){
            System.out.println(p);
        }
		
	}

}
