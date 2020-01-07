package org.app;

import java.util.Scanner;

public class StringNoAddition {
public static void main(String[] args) {
	System.out.println("enter a string");
	Scanner sc=new Scanner(System.in);
	String data=sc.nextLine();
	sumNumber(data);
}

 static void sumNumber(String data) {
		int sum=0;
for(int i=0;i<data.length();i++) {
	char c=data.charAt(i);
	if(Character.isDigit(c)) {
		
		int b=Integer.parseInt(String.valueOf(c));
		sum=sum+b;
	}
}
if(sum==0) {
	System.out.println(-1);
}else {
	System.out.println(sum);
}
}
}
