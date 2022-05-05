package Com.Scii.Strings;

import java.util.Scanner;

public class Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		    Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the string");
	        String s=sc.nextLine();
	        System.out.println("Enter the index");
	        int index=sc.nextInt();
	        System.out.println("the character of the given position is:"+s.charAt(index));
	        System.out.println("Enter the character");
	        char a=sc.next().charAt(0);
	        System.out.println("the position of the given letter is:"+s.indexOf(a));
	        }
		catch(NullPointerException e) {
			System.out.println("nullpointerexception e");
		}
	}
}



