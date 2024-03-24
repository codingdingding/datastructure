package com.java.objacktive;

import java.util.Scanner;

public class Problem_17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start, end, baesu;
		int i, hap = 0;
		
		System.out.printf("합계의 시작값 ==> "); //next int를 해야 하는 근거
		start = s.nextInt();
		System.out.printf("합계의 끝값 ==> ");
		end = s.nextInt();
		System.out.printf("배수==> ");
		baesu = s.nextInt();
		
		i = start;
		while (i <= end) {
			if (i % baesu == 0)
				hap = hap + i;
			
			i++;
		}
		System.out.printf("%d부터 %d까지의 %d배수의 합계 ==> %d\n", start, end, baesu, hap);
		s.close();
		}
	}

