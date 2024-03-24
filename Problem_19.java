package com.java.objacktive;

import java.util.Scanner;

public class Problem_19 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		char ch;
		int start, i, k ;
		str = s.nextLine();
		
		i = 0;
		ch = str.charAt(i);
		while (true) {
			start = (int) ch -48;
		for (k = 0; k < start; k++)
			System.out.printf("*");
		System.out.printf("\n");
		
		if(++i > str.length() - 1)
			break;
				
		ch = str.charAt(i);
	}
}
}
