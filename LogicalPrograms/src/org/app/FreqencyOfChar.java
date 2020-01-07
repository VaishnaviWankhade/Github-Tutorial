package org.app;

public class FreqencyOfChar {
public static void main(String[] args) {
	String str="I will get a success very soon";
	char ch='s';
	int ss=0;
	for(int i=0;i<str.length();i++) {
		if(ch==str.charAt(i)) {
			ss++;
		}
	}
	System.out.println("freqenc of char:"+ss);
}
}
