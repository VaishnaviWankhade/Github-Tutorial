package org.app.array;

public class OddNoInArray {
public static void main(String[] args) {
	int arr[] = { 2, 3, 5, 4, 5, 2, 
            4, 3, 5, 4, 4, 2 }; 
int n = arr.length;

// Function calling 
	int x= getOddOccurrence(arr, n); 
	System.out.println(x);

}
	static int getOddOccurrence(int arr[], int arr_size) 
	{ 
	    for (int i = 0; i < arr.length; i++) { 
	          
	        int count = 0; 
	          
	        for (int j = 0; j < arr.length; j++) 
	        { 
	            if (arr[i] == arr[j]) 
	                count++; 
	        } 
	        if (count % 2 != 0) 
	            return arr[i]; 
	    } 
	    return -1; 
	} 

}
