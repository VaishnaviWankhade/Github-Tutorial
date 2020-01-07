package org.app;

public class FibonacciRecursion {
	
	static int k1=0,k2=1,k3=0;
	static void add(int c) {
		if(c>0) {
		k3=k1+k2;
		k1=k2;
		k2=k3;
        System.out.println(k3);
        add(c-1);
		}
	}
public static void main(String[] args) {
	int c=10;
    System.out.println(k1+""+k2);
    add(c-2);

}
}
