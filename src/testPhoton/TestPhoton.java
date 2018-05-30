package testPhoton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class TestPhoton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Person, String> allList= new HashMap<Person, String> ();
		
		//firstName, LastName, age, address
		
		
		
		allList.put(new Person("Kumar", "Vaduganathan",40, "Plano,Tx"), "First");
		allList.put(new Person("Kumar2", "Vaduganathan2",50, "India"), "second");
		
		TestPhoton testPhoton= new TestPhoton();
		
		String inputpara="Kumar2";
		
		System.out.println(testPhoton.getinfo(allList, inputpara));
		
		
		

	}
	
	public List<Person> getinfo(HashMap<Person, String> allList, String inputPara) {
		
	
      Set<Person> newSet= allList.keySet();
      ArrayList<Person> al=new ArrayList<Person>();
		
		for(Person p:newSet) {
			
			if (p.getFirstName().equals(inputPara)) {
				//System.out.println(p.getAddress());
				al.add(p);
			}
			
		}
		
		return al;
	}

}
