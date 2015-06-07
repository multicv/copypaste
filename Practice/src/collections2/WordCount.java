package collections2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*HashSet<Employee> hm= new HashSet<Employee>();
		Employee emp = new Employee("Ajit", 22, 10000);
		Employee emp2 = new Employee("Ajit2131", 23, 10000);

		hm.add(emp);
		hm.add(emp2);

		System.out.println(hm);*/
		
		LinkedHashSet lhs = new LinkedHashSet();
		LinkedHashSet inputSet = new LinkedHashSet();
		inputSet.add(1);
		inputSet.add(2);
		inputSet.add(4);
		inputSet.add(3);
		System.out.println(inputSet);
		lhs.add(inputSet);
		lhs.add(3);
		System.out.println();
		Iterator itr = lhs.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
	}

}
