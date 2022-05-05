package Com.Scii.Arrays;

import java.util.Scanner;

public class BiggestAndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array:");
        int small,large;
        int b=sc.nextInt();
        int arr[]=new int[b];
        for(int i=0;i<b;i++) {
        	System.out.println("Enter the elements"+(i+1)+":");
        	arr[i]=sc.nextInt();
        	small=arr[0];
        	large=arr[0];
        	for(int j=0;j<b;j++) {
        		if(small>arr[j]) {
        			small=arr[j];
        	  }
        		if(large<arr[j]) {
        			large=arr[j];
        		}
        	}
        	System.out.println("the smallest value is:"+small);
        	System.out.println("The largest value is:"+large);
        }
	}


}