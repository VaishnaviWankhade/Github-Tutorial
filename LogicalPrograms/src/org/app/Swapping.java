package org.app;

public class Swapping {
public static void main(String[] args) {
    System.out.println("Provide no. 1");
    
    int i1=4,i2=8;
    System.out.println("before:"+i1+" "+i2);
    i1=i1+i2;
    i2=i1-i2;
    i1=i1-i2;
    System.out.println("After:"+i1+" "+i2);

}
}
