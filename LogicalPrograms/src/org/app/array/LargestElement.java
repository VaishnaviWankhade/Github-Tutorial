package org.app.array;

public class LargestElement {
public static void main(String[] args) {
	int a[]= new int[] {23,45,89,7,69,47,12};
	int total=7;
	int x=getLargest(a,total);
	
		System.out.println(x);
	
	
}

private static int getLargest(int[] a,int total) {
	int temp=0;

	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}}
	}
	return a[2];
	
}
}
