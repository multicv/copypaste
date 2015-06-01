package collections2;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ValuesComparator implements Comparator<Map.Entry>{

	@Override
	public int compare(Entry o1, Entry o2) {
		if((int)(o1.getValue())>(int)(o2.getValue())){
			return 1;
		}
		else return -1;
	}

}
