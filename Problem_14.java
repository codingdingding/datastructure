package com.java.objacktive;

public class Problem_14 {

	public static void main(String[] args) {
		int i, k;
		
		for (i = 2; i <= 9; i++)
			System.out.printf("  #��%d��#" , i); //#��%��#�� �ٷ�� ����
			
		System.out.println("\n\n"); //���� ���̿� ��ĭ
		
		for (i =1; i <= 9; i++) { //*���ڿ� ���� ����
			for (k = 2; k <= 9; k++) { //����*�� ���� ����
				System.out.printf("%2dX%2d=%2d", k, i, k * i);
			}
			System.out.println("\n");
		}

	}

}
