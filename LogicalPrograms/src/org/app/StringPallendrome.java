package org.app;

public class StringPallendrome {
public static void main(String[] args) {
	String  str="radar";
	String temp="";
	int length=str.length();
	for(int i=length-1;i>=0;i--) {
		temp=temp+str.charAt(i);
	}
	if(str.equals(temp)) {
		System.out.println("String is Pallindrome");

	}else {
		System.out.println("String is not Pallindrome");

	}
}
}
