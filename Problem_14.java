package com.java.objacktive;

public class Problem_14 {

	public static void main(String[] args) {
		int i, k;
		
		for (i = 2; i <= 9; i++)
			System.out.printf("  #제%d단#" , i); //#제%단#을 다루는 문장
			
		System.out.println("\n\n"); //문장 사이에 공칸
		
		for (i =1; i <= 9; i++) { //*숫자에 관한 문장
			for (k = 2; k <= 9; k++) { //숫자*에 관한 문장
				System.out.printf("%2dX%2d=%2d", k, i, k * i);
			}
			System.out.println("\n");
		}

	}

}
