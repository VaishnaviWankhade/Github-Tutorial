package org.app.array;

import java.util.ArrayList;

public class ArraylistToArray {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(60);
	al.add(70);
	System.out.println(al);
Integer [] str=new Integer[al.size()];
al.toArray(str);
for(int i:str) {
	System.out.println(i);
}
}
}
