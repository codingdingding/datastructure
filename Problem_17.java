package com.java.objacktive;

import java.util.Scanner;

public class Problem_17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start, end, baesu;
		int i, hap = 0;
		
		System.out.printf("�հ��� ���۰� ==> "); //next int�� �ؾ� �ϴ� �ٰ�
		start = s.nextInt();
		System.out.printf("�հ��� ���� ==> ");
		end = s.nextInt();
		System.out.printf("���==> ");
		baesu = s.nextInt();
		
		i = start;
		while (i <= end) {
			if (i % baesu == 0)
				hap = hap + i;
			
			i++;
		}
		System.out.printf("%d���� %d������ %d����� �հ� ==> %d\n", start, end, baesu, hap);
		s.close();
		}
	}

