package collections2;

import java.util.LinkedHashSet;

public class Sets {

	public LinkedHashSet getPowerSet(LinkedHashSet inputSet){
		
		LinkedHashSet lhs = new LinkedHashSet();
		inputSet.add(1);
		inputSet.add(2);
		inputSet.add(4);
		inputSet.add(3);
		System.out.println(inputSet);
		lhs.add(2);
		lhs.add(inputSet);
		System.out.println(inputSet.containsAll(lhs));
		return null;
		
	}
	
	
	
}
