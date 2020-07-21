package com.mycompany.tasklamda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Two {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		String s[]= new String[n];
		for (int i=0;i<n;i++) {
			s[i]=sc.next();
		}
		ArrayList<String> str=new ArrayList<String>(Arrays.asList(s));
		str.forEach(b -> {if(b.charAt(0)=='a' && b.length()==3) System.out.print(b);});
		sc.close();
	}

}
