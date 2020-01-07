package org.app;

public class LowerToupper {
	static char ch[] ={'p','t','w','e','t','i'};

	public static void main(String[] args){
		to_Upper(ch);
	}

	//method to convert in lowercase
	public static void to_Upper(char str[]){
		int i=0;
		while(str[i]!='\0'){
			if(str[i]>= 97 && str[i]<=123){
				str[i]-=32;
				System.out.println(str[i]);
			}
			++i;
		}
	}
}
