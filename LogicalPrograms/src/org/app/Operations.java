package org.app;

public class Operations {
public static void main(String[] args) {
	int a=10,b=30,c=60,s=0;
	float avg;
	
	if(a>b &&b>c ) {
		System.out.println("a is greater");
	}
	else if(b>a&& b>c) {
		System.out.println("b is greater");

	}
	else {
		System.out.println("c is greater");

	}
	s=a+b+c;
	avg=s/3;
	System.out.println("sum is:"+s);
	System.out.println("avg is:"+avg);
	
}
}
