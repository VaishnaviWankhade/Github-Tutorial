package org.app.array;

public class ArrayMinMax {
public static void main(String[] args) {
	int a[]=new int[] {10,20,50,40,80,90};
	int max=a[0];
	int min=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
		
		if(a[i]<min) {
			min=a[i];
		}
	}
	System.out.println("max no:"+max);
	System.out.println("max no:"+min);

}
}
