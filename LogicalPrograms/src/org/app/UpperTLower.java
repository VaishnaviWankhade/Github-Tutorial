package org.app;

public class UpperTLower {
	static char ch[] ={'P','R','E','E','T','I'};

	public static void main(String[] args){
		to_Lower(ch);
	}

	//method to convert in lowercase
	public static void to_Lower(char str[]){
		int i=0;
		while(str[i]!='\0'){
			if(str[i]>= 65 && str[i]<=96){
				str[i]+=32;
				System.out.println(str[i]);
			}
			++i;
		}
	}
}
