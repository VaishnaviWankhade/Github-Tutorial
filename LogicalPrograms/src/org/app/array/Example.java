package org.app.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Example {
public static void main(String[] args) {
	HashMap  hm=new HashMap<>();
	hm.put(new Employee(101), "A");
	hm.put(new Employee(102), "B");
	hm.put(new Employee(101), "C");

	//System.out.println(hm);
	Set<Employee> s=hm.keySet();
	for(Employee key:s) {
		System.out.println("key="+key.id);
		
		System.out.println("value="+hm.get(key));
		
	}
}
}
