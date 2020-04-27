package chap01;

import java.util.Scanner;

// ctrl + shift + c  : 한 줄 주석 
// ctrl + shift + /  : 여러 줄 주석
// ctrl + shift + \  : 여러 줄 주석 해제

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
 		1		:		0개
 */
public class test02 {
	public static void main(String[] args) {
		// 1. 금액 입력
		// 2. 화폐 매수를 계산
		//		[규칙]
		//		1) 큰 화폐단위부터 계산
		//		2) 화폐매수 계산	: 		(화폐매수) = (입력 금액) / (화폐단위)
		//		3) 잔액계산	 	:	<1>	( 잔 액  ) = (입력 금액) - ( (화폐단위)X(화폐매수) )
		//							<2> ( 잔 액  ) = (입력 금액) % (화폐단위)
		//		4) 화폐단위 변환	:    번갈아 가면서 /5, /2 를 반복
		//							 50000 -> 10000		: (화폐단위 / 5)
		//							 10000 -> 5000  	: (화폐단위 / 2) 
		// 3. 각 화폐단위별 매수 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 : ");
		// 필요한 변수			:	(입력금액), (화폐단위), (화폐매수)
		int input = sc.nextInt();
		int money = 50000;
		int cnt = 0;
		int sw = 0;
		
		while( money >= 1 ) {					
			//	1. 화폐매수 계산
			cnt = input / money;
			System.out.println(money + "원 \t : " + cnt + "매");
			
			// 	2. 잔액 계산
//		input = input - (money * cnt);
			input = input % money;
			
			// 	3. 화폐단위 변환
			if( sw == 0 ) {
				money = money / 5;
				sw = 1;
			} else {
				money = money / 2;
				sw = 0;
			}
		}
		sc.close();
	}
}





























