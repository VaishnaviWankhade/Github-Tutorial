package org.app;

public class SumOfDigit {
public static void main(String[] args) {
	int s=0;
	int n=123;
while(n!=0) {
	s=s+n%10;
	n=n/10;

}
System.out.println(s);

}
}
