package org.app.array;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		Integer i=o1;
		Integer i1=o2;
		
		return -i.compareTo(i1);
	}

}
