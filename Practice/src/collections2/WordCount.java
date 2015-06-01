package collections2;

import java.util.HashMap;
import java.util.HashSet;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Employee> hm= new HashSet<Employee>();
		Employee emp = new Employee("Ajit", 22, 10000);
		Employee emp2 = new Employee("Ajit2131", 23, 10000);

		hm.add(emp);
		hm.add(emp2);

		System.out.println(hm);
	}

}
