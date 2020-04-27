package chap06.vector;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {
	public static void main(String[] args) {
		// 정수 값만 가지는 제네릭 벡터 생성
		Vector<Integer> v = new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		
		// Iterator 를 이용한 모든 정수 출력하기
		Iterator<Integer> it = v.iterator();			// Iterator 객체 얻기
		while(it.hasNext()) {
			int n = it.next();
			System.out.print(n + " ");
		}
		
		
	}
}





















