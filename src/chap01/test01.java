package chap01;

import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3의 배수 인가요?");
		
		int num = sc.nextInt();
		
		if( num % 3 == 0 ) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		sc.close();
	}
}
