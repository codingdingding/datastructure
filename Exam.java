package com.java.objacktive;

public class Exam {

	public static void main(String[] args) {
		int i;
		
		for ( i=1; i<10 ; i++)
			System.out.printf("%d + %d = %d \n", i,i,i+i);
		
		int j;
		int odd_hap =0  ;
		int even_hap = 0 ;
		
		for (j = 1; j <=100; j++) {
			if( i%2 ==0)
				even_hap = even_hap+j ;
			else
				odd_hap = odd_hap+j ;
		}
		System.out.printf(" 홀수의 합 :%d \n" ,odd_hap);
		System.out.printf(" 짝수의 합 :%d \n",even_hap);
		
		int d;
		int hap=0 ;
		
		for(i=0; i<=1000 ; i++ ) {
			if(i%3==0 || i%7==0)
				hap = hap+i;
		}
		System.out.printf("3의 배수 또는 7의 배수의 합 : %d \n", hap);
		
		
		int r, h;
		
		r = 0 ;
		while (i <3 ) {
			h = 0;
			while (h < 4)
				System.out.printf(" 중첩 while 문 \n");
			    h++;
		}
		r++;
		
		int G;
		int hap1 = 0;
		
		G = 1;
		while( i <=100 ) {
			if(G%5 == 0 || G%8 == 0)
				hap1 = hap1 ;
			G++;
		}
		System.out.printf("5의 배수와 8의 배수의 합 : %d\n", hap1);
		}
	}

