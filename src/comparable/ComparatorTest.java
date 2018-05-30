package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<LaptopsForCompartor> laps= new ArrayList<LaptopsForCompartor>();
		
		laps.add(new LaptopsForCompartor("Dell", 700, 4));
		laps.add(new LaptopsForCompartor("HP", 500, 6));
		laps.add(new LaptopsForCompartor("Apple", 1500, 16));
		
		System.out.println("-------------------------------------original");
		for(LaptopsForCompartor l:laps) {
			System.out.println(l);
			
		}

		
		Comparator<LaptopsForCompartor> comByPrice=new Comparator<LaptopsForCompartor>(){
			public int compare(LaptopsForCompartor l1, LaptopsForCompartor l2) {
				if(l1.getPrice()>l2.getPrice())
					return 1;
				else
					return -1;
			}
		};
		
		Collections.sort(laps, comByPrice);
		System.out.println("-------------------------------------by price");
		for(LaptopsForCompartor l:laps) {
			System.out.println(l);
			
		}
		
		
		Comparator<LaptopsForCompartor> comByMemory=new Comparator<LaptopsForCompartor>(){
			public int compare(LaptopsForCompartor l1, LaptopsForCompartor l2) {
				if(l1.getMemory()>l2.getMemory())
					return 1;
				else
					return -1;
			}
		};
		
		Collections.sort(laps, comByMemory);
		System.out.println("------------------------------------- by memory");
		for(LaptopsForCompartor l:laps) {
			System.out.println(l);
			
		}
		
		
	}

}
