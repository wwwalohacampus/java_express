package chap04.Array.oneD;

/*
	배열 (Array)
		: 배열이란 번호(Index)와 그 번호에 대응하는 데이터들로 이루어진 자료구조를 말한다.
		
	(장점)
	- 상수시간 O(1)	만에 데이터를 호출할 수 있다.
	(단점)
	- 인덱스의 값이 고정되어 있기 때문에 불필요한 공간을 생성할 수도 있다.
	
 */

public class Array {
	static int arr[];
	public static void main(String[] args) {
		arr = new int[7];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		
		System.out.println("arr[2] = " + arr[2]);
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int a : arr) {
			System.out.print(a + " ");
		}
		
		
	}
}
