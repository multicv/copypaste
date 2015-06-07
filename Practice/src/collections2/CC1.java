package collections2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class CC1 {

	public static void main(String[] args) {
		LinkedHashSet<String> masterSet = new LinkedHashSet<String>();
		LinkedHashSet<LinkedHashSet<String>> powerSet = new LinkedHashSet<LinkedHashSet<String>>();
		CC1 cc1 = new CC1();
		for (int i = 0; i < args.length; i++) {

			System.out.println("args =" + args[i]);
			masterSet = cc1.createMasterSet(args[i]);
			powerSet = cc1.createPowerSet(masterSet);
			System.out.println("powerSet=" + powerSet);
			/*Iterator<LinkedHashSet<String>> itr = powerSet.iterator();*/
			for(LinkedHashSet<String> lhsElement: powerSet){
				System.out.println("lhselement="+lhsElement);
			}
			
			
		}

	}

	// Creating master set
	LinkedHashSet<String> createMasterSet(String args) {
		LinkedHashSet<String> masterSet = new LinkedHashSet<String>();

		for (int i = 1; i <= Integer.parseInt(args); i++) {
			masterSet.add(String.valueOf(i));
		}

		System.out.println("masterSet=" + masterSet);
		return masterSet;

	}

	// Creating power set
	LinkedHashSet<LinkedHashSet<String>> createPowerSet(
			LinkedHashSet<String> masterSet) {

		LinkedHashSet<LinkedHashSet<String>> powerSet = new LinkedHashSet<LinkedHashSet<String>>();
		int numberOfSetsInPowerSet = (int) Math.pow(2, masterSet.size());
		System.out.println("number of sets in powerSet="
				+ numberOfSetsInPowerSet);
		for (int i = 0; i < numberOfSetsInPowerSet; i++) {
			LinkedHashSet<String> tempPowerSetElement = new LinkedHashSet<String>();
			for (int j = 0; j < getBinaryString(i, masterSet.size()).length(); j++) {

				if (getBinaryString(i, masterSet.size()).charAt(j) == '1') {

					tempPowerSetElement.add(getElementAt(j, masterSet));

					// add jth element of master set to temp hashset... and
					// after this loop add it to power set

				}
				powerSet.add(tempPowerSetElement);
			}

		}

		return powerSet;

	}

	String getElementAt(int index, LinkedHashSet<String> lhs) {
		Iterator<String> itr = lhs.iterator();
		int i = 0;
		if (String.valueOf(index) != null) {

			while (itr.hasNext()) {
				if (i == index) {
					return itr.next();
				}
				itr.next();
				i++;
			}

			return null;
		} else
			return null;

	}

	String getBinaryString(int num, int lengthOfBinaryString) {

		String shortBinaryString = Integer.toBinaryString(num);
		StringBuilder zerosString = new StringBuilder("");
		for (int i = 0; i < lengthOfBinaryString - shortBinaryString.length(); i++) {

			zerosString.append("0");

		}

		return zerosString.append(shortBinaryString).toString();

	}

}
