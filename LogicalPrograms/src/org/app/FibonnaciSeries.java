package org.app;

import java.util.Scanner;

public class FibonnaciSeries {
public static void main(String[] args) {
	int i1=0,i2=1,k,i3;
    System.out.print("Provide no.");
	Scanner sc=new Scanner(System.in);
	int s=sc.nextInt();
	
    System.out.print("series: "+i1+" "+i2);
    for(k=2;k<=s;k++) {
    	i3=i1+i2;
        System.out.println(i3);

    	i1=i2;
    	i2=i3;
    	
    }
}
}
