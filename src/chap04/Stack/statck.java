package chap04.Stack;

import java.util.Stack;

/*
  	스택(Stack)
  		: 선입후출(F.I.L.O), 후입선출(L.I.F.O) 순서로 삽입되고 제거된다.
  		 한쪽 방향에서만 데이터를 삽입하고 제거가 이루어진 자료구조이다.
 */
public class statck {
	static Stack<Integer> stk;
	public static void main(String[] args) {
		stk = new Stack<Integer>();
		
		// stack 초기화
		stk.clear();
		
		// stack에 데이터를 2 삽입
		stk.add(2);
		
		// stack에 데이터를 2 삽입
		stk.add(20);
		
		// stack의 size 출력
		System.out.println("stk.size : " + stk.size());
		
		// stack에서 데이터 확인 및 제거
		System.out.println("data : " + stk.pop());
		
		// stack에서 데이터 확인
		System.out.println("data : " + stk.peek());
		
		// stack에서 데이터 확인 및 제거
		System.out.println("data : " + stk.pop());
		
		// stack에 아무것도 없는 확인
		if(stk.isEmpty()) {
			System.out.println("stack is empty");
		}
		
		
		
	}
}












