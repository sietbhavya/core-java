package Com.Scii.Arrays;
import java.lang.String;
import java.util.Scanner;
public class InsertArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of array");
      int s=sc.nextInt();
      int[] arr=new int[s];
      for(int i=0;i<arr.length;i++) {
    	  arr[i]=sc.nextInt();
    	  System.out.println("The array elements are:"+arr[i]);
      }
       
	}

}
