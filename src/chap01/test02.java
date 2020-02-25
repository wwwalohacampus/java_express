package chap01;

import java.util.Scanner;

/*
 		화폐매수 구하기
 		금액 : 		537620
 		50000 	:	 	10개
 		10000 	: 		3개
 		5000	:		1개
 		1000	:		2개
 		500		:		1개
 		100		:		1개
 		50		:		0개
 		10		:		2개
 		5		:		0개
 		1		:		1개
 */
public class test02 {
	public static void main(String[] args) {
		// 1. 금액 입력
		// 2. 화폐 매수를 계산
		//		* 큰 화폐단위부터 계산
		//		* (규칙) : 화폐단위가 큰 단위에서 작은 단위로	( / 5 ), ( / 2 ) 로 번갈어서 변환 
		//		*  화폐단위 변환
		// 3. 매수를 출력
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 : ");
		int input = sc.nextInt();
		int cnt = 0;
		int [] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int start = 50000;
		
		
		int input1 = input;
		int input2 = input;
		
		//(방법1) 배열로 화폐단위를 변환
		System.out.println("(방법1) 배열로 화폐단위를 변환");
		for (int i = 0; i < money.length; i++) {
			cnt = input1 / money[i];				// 537620 / 50000 = 10		: 화폐매수 계산	
			System.out.println( money[i] + " : " + cnt + "개" );
			input1 = input1 % money[i];			// 537620 % 500000 = 37620	: 잔액 계산
		}
		
		
		//(방법2) 규칙으로 화폐단위를 변환
		System.out.println("(방법2) 규칙으로 화폐단위를 변환");
		int sw = 0;
		while( start >= 1 ) {
			// 화폐매수 계산
			cnt = input2 / start;
			System.out.println( start + " : " + cnt + "개" );
			// 잔액 계산
			input2 = input2 % start;
			
			// 화폐단위 변화
			if( sw == 0 ) {
				start = start / 5;
				sw = 1;
			}
			else {
				start = start / 2;
				sw = 0;
			}
		}
		
		sc.close();
		
	}
}










