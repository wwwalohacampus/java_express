package chap04.Queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 	큐(Queue)
 		: 선입선출(F.I.F.O), 후입후출(L.I.L.O) 순서로 데이터 삽입 제거가 일어나는 자료구조이다.
 		
 	*구현
 		: Linkedlist 클래스로 Queue를 인스턴스화해서 사용한다.
 		
 */
public class queue {
	static Queue<Integer> que;
	public static void main(String[] args) {
		// queue는 Linkedlist 클래스로 선언한다.
		que = new LinkedList<Integer>();
		
		// queue 초기화
		que.clear();
		
		// queue에 데이터 3 삽입
		que.add(3);
		
		// queue에 데이터 30 삽입
		que.add(30);
		
		// queue의 size 출력
		System.out.println("que.size : " + que.size());
		
		// queue에서 데이터 확인 및 제거
		System.out.println("data : " + que.poll());
		
		// queue에서 데이터 확인
		System.out.println("data : " + que.peek());
		
		// queue에서 데이터 확인 및 제거
		System.out.println("data : " + que.poll());
		
		// queue에 아무것도 없는 확인
		if(que.isEmpty()) {
			System.out.println("queue is empty");
		}
	}
}
















