package chap01;

import java.util.Scanner;

public class test01 {
	// 클래스 : 객체를 정의하는 설계도
	// main : ctrl + space
	
	// main 메소드 : 프로그램의 시작
	public static void main(String[] args) {
		// 입력문 - Sc : ctrl + space
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if( num % 3 == 0 ) {
			// 출력문 - sysout : ctrl + sapce
			System.out.println("3의 배수 입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
		sc.close();
	}
}

