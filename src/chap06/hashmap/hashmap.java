package chap06.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class hashmap {
	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();		// 해시맵 생성

		// (key, value) 쌍으로 저장
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("찾고 싶은 단어 : ");
			String eng = sc.next();
			// == (대등연산자)
			// a.equals(b) 
			if(eng.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			// 해시맵에 있는 key 로 value 를 검색
			String kor = dic.get(eng);
			if(kor == null)
				System.out.println(eng + "는 없는 단어 입니다.");
			else
				System.out.println(kor);
		}
		
		sc.close();
		
	}
}
