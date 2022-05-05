package Com.Scii.Arrays;

import java.util.Scanner;

public class SortElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of array1");
			int n1 = input.nextInt() ;
			int arr1[]=new int[n1];
		    System.out.println("enter the elements in array");
		 for(int i=0;i<n1;i++) 
		 arr1[i] = input.nextInt();
		 System.out.println("enter the size of array2");
			int n2 = input.nextInt() ;
			int arr2[]=new int[n2];
		    System.out.println("enter the elements in array");
		 for(int i=0;i<n2;i++) 
		 arr2[i] = input.nextInt();
		 
		 
			     n1 = arr1.length;
			     n2 = arr2.length; 
			      int i = 0, j = 0, k = 0, x;
			      System.out.print("Array 1: ");
			      for (x = 0; x < n1; x++)
			      System.out.print(arr1[x] + " ");
			      System.out.print("\nArray 2: ");
			      for (x = 0; x < n2; x++)
			      System.out.print(arr2[x] + " ");
			      int[]c = new int[n1+n2]; 
			      int count = 0; 
			       
			      for( i = 0; i<n1; i++) {  
			         c[i] = arr1[i]; 
			         count++; 
			         
			      }  
			      for( i = 0;i<n2;i++) {  
			         c[count++] = arr2[i]; 
			         
			              }
			      
			  	System.out.println("Sorting the array"); 
			  	int temp; 
			  	    for ( i = 0; i < c.length; i++)  
			  	    { 
			  	        for ( j = (i + 1); j  < c.length; j++)  
			  	        { 
			  	            if (c[i] > c[j])  
			  	            { 
			  	                temp = c[i]; 
			  	                c[i] = c[j]; 
			  	                c[j] = temp; 
			  	            } 
			  	             
			  	        } 
			   }
			  	   
			      for ( i = 0; i < c.length ; i++)  
			      { 
			          System.out.println(c[i]); 
			           
			      } 
		} 
  }

