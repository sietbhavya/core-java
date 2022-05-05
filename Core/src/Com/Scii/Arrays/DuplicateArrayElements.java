package Com.Scii.Arrays;

import java.util.Scanner;

public class DuplicateArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = input.nextInt() ;
		int arr[]=new int[n];
	    System.out.println("enter the elements in array");
	    for(int i=0;i<n;i++) 
	    arr[i] = input.nextInt();
	    
	    n= arr.length;
	     for(int i = 0; i < n; i++) {
	    	 for(int j = i + 1; j < n; j++) {
	    		 if(arr[i] == arr[j])  
	    			  System.out.println("the duplicate array element is "+arr[j]); 	    		 
	    	 }	    	 
	     }		
	}		
}