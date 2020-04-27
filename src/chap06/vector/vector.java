package chap06.vector;

import java.util.Vector;

public class vector {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();		// 정수 값만 다루는 벡터 생성
		v.add(5);
		v.add(4);		
		v.add(-1);
		
		// 5 4 100 -1
		
		// 벡터 중간에 삽입하기
		v.add(2, 100);
		
		System.out.println("벡터 내의 요소 객체 수 : " + v.size());
		// 10배수씩 증가하는 물리적 용량
		System.out.println("벡터의 현재 용량 : " + v.capacity());
		
		// 모든 요소 정수 출력
		for (int i = 0; i < v.size(); i++) {
			int n = v.get(i);
			System.out.print(n + " ");
		}
		System.out.println();
		
		// 벡터 모든 정수 더하기
		int sum = 0;
		for (int i = 0; i < v.size(); i++) {
			int n = v.elementAt(i);
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합 : " + sum);
		
	}
}









