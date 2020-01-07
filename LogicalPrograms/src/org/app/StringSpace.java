 package org.app;

import java.util.Scanner;

public class StringSpace {
	public static void main(String[] args) {  
		Scanner input= new Scanner(System.in);

		String data=input.nextLine();
		int cnt=0;
		System.out.println(data);
		for(int i=0;i<data.length();i++)
		{if(data.charAt(i)==' ')
		    {
		        cnt++;
		    }
		}

		System.out.println("Total number of Spaces in a given String are " +cnt);
		}
}
