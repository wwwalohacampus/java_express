package chap05.math;

import java.util.Random;

public class MathEx {
	public static void main(String[] args) {
		double a = Math.PI;
		System.out.println(Math.PI);			// 원주율 상수 출력
		System.out.println(Math.ceil(a)); 		// ceil (올림)
		System.out.println(Math.floor(a)); 		// floor (내림)
		System.out.println(Math.sqrt(a));		// 제곱근
		System.out.println(Math.exp(2));		// e의 2승
		System.out.println(Math.round(3.14));	// 반올림
		
		// [1, 45] 사이의 정수형 난수 5개 발생
		System.out.println("이번주 행운의 번호는 ");
		for (int i = 0; i < 5; i++) {
			System.out.print((int)(Math.random()*45 + 1) + " ");		// 난수 발생 
		}
		System.out.println();
		// 랜덤 수 공식
		// 1.  (int)(Math.random() * [개수] + [시작숫자]
		// 2.  random.nextInt([개수]) + [시작숫자]
		// -10 ~ 10
		Random random = new Random();
		int n = random.nextInt(21) - 10;
		System.out.println(n);
		
		
		
		
	}
}







