package org.app.array;

import java.util.Scanner;

public class ReverseNo {
public static void main(String[] args) {
	int temp,rev=0;
	System.out.println("enter a no");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	while(n!=0) {
		 temp=n%10;
		 rev=rev*10+temp;
		n=n/10;
		
	}
	System.out.println(rev);
}
}
