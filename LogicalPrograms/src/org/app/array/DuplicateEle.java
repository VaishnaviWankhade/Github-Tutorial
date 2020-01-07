package org.app.array;

public class DuplicateEle {
public static void main(String[] args) {
	String a []= {"java","seleium","java","python"};
	for(int i=0;i<a.length;i++) {
		for(int j=1;j<a.length;j++) {
			if(a[i].equals(a[j])&& (i!=j)) {
				System.out.println("duplicate element:"+a[j]);
			}
		}
	}
}
}
