package chap02.callparameter;

import chap02.inheritance.Pikachu;

public class CallByReference {
	
	public static void  getArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i+1) * 10;
		}
		System.out.println("***** getArr 메소드 *****");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		System.out.println("(get**) 레퍼런스");
		System.out.println("arr\t\t--> " + arr);
	}
	
	public static void  getObj(Pikachu pikachu) {
		pikachu.energy = 1000;
		pikachu.type = "fire";
		
		System.out.println("***** getObj 메소드 *****");
		System.out.println(pikachu.toString());
		
		System.out.println("(get**) 레퍼런스");
		System.out.println("pikachu\t\t--> " + pikachu);
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		Pikachu pikachu = new Pikachu();
		pikachu.energy = 100;
		pikachu.type = "thunder";
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		System.out.println("***** main 메소드 *****");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		System.out.println(pikachu.toString());
		
		System.out.println("(main) 레퍼런스");
		System.out.println("arr\t\t--> " + arr);
		System.out.println("pikachu\t\t--> " + pikachu);
		
		
		getArr(arr);
		getObj(pikachu);
		
		
		System.out.println("***** get** 메소드 호출 후 *****");
		System.out.println("***** main 메소드 *****");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		System.out.println(pikachu.toString());
		
	}
}
