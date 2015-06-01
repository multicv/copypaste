package collections2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class EmployeeManager {

	public static void main(String[] args) {

		/*
		 * HashMap<String, Employee> employeeMap = new HashMap<String,
		 * Employee>(); List<HashMap> employeeMapList = new
		 * ArrayList<HashMap>();
		 * 
		 * for (int i = 0; i < 20; i++) { Employee e = new Employee("Ajit"+i,
		 * 24, 35000); employeeMap.put(e.getName(), e);
		 * 
		 * } employeeMapList.add(employeeMap); employeeMap.remove("Ajit13");
		 * 
		 * Set s= new HashSet(); List<Integer> arr = Arrays.asList(new
		 * Integer[10]); System.out.println(arr.size());
		 */
		/*
		 * Date currentDate= new Date(); System.out.println(currentDate);
		 */
		TreeMap<String, Integer> hm = new TreeMap<String, Integer>();
		HashMap<String, Integer> sortedHashMap = new LinkedHashMap<String, Integer>();

		hm.put("do", 3);
		hm.put("it", 2);
		hm.put("or", 1);
		hm.put("not", 9);
		System.out.println(hm);
		List hmList = new LinkedList(hm.entrySet());
		System.out.println(hmList);
		ValuesComparator vc = new ValuesComparator();
		Collections.sort(hmList, vc);
		System.out.println(hmList);
		for (Iterator it = hmList.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedHashMap.put(entry.getKey().toString(),
					(int) (entry.getValue()));
		}
		System.out.println(sortedHashMap);

	}

}
