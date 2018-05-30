package comparable;

import java.util.ArrayList;
import java.util.Collections;


public class ComparapleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<LaptopsForComparaple> laps= new ArrayList<LaptopsForComparaple>();
		
		laps.add(new LaptopsForComparaple("Dell", 700, 4));
		laps.add(new LaptopsForComparaple("HP", 500, 6));
		laps.add(new LaptopsForComparaple("Apple", 1500, 16));
		
		
		
		Collections.sort(laps);
		
		for(LaptopsForComparaple l:laps) {
			System.out.println(l);
			
		}
	}

}
