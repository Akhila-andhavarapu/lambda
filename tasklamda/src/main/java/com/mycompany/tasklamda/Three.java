package com.mycompany.tasklamda;

import java.util.ArrayList;
import java.util.Scanner;
interface Palindrome {
	void palindrome(ArrayList<String> mylist);
}
public class Three{
	private static Scanner sc;

	public static void palindrome(ArrayList<String> mylist) {
		ArrayList<String> mylist1=new ArrayList<String>();
		for(int i=0;i<mylist.size();i++) {
			String str=mylist.get(i);
			String str1= new StringBuffer(str).reverse().toString();
			if(str.equals(str1)) {
				mylist1.add(str);
			}
		}
		System.out.println("The strings which are palindrome :"+mylist1);
		
	}

	

	public static void main(String[] args) {
		sc = new Scanner (System.in);
		System.out.println("Enter size");
		int n= sc.nextInt();
		ArrayList<String> mylist=new ArrayList<String>();
		System.out.println("Enter arraylist of strings:");
		for(int i=0;i<n;i++) {
			mylist.add(sc.next());
		}
		Palindrome t = Three::palindrome;
		t.palindrome(mylist);

	}

}
