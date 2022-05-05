package Com.Scii.Arrays;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt() ;
		int arr[]=new int[n];
	    System.out.println("enter the elements in array");
	    for(int i=0;i<n;i++) 
	    arr[i] = sc.nextInt();
	    
	    int m=arr.length;
	    int sum=0;
	    for(int i=0;i<m;i++) 
	    sum=sum+arr[i];
	    System.out.println("the sum of arrays are: "+sum);
	
     	float avg=sum/n;
        System.out.println("the average is "+avg);
        System.out.println("\n");
    
        for(int i=0;i<n;i++)
    	if(arr[i]>avg)
    	System.out.println("the above average numbers are: "+arr[i]);
	}
}