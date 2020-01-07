package org.app.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Practice {
public static void main(String[] args) {
		/*
		 * TreeSet<Integer> list=new TreeSet<Integer>(new MyComparator()); list.add(10);
		 * list.add(50); list.add(5); list.add(0); System.out.println(list);
		 */
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(90);
	al.add(50);
	al.add(80);
Iterator<Integer> itr=al.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	Collections.sort(al);
	System.out.println(al);
	
}
}

