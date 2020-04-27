package chap01;

// System.out.print("안녕");		- 문자열 "안녕" 출력
// System.out.println("안녕");	- 문자열 "안녕" 출력 후 한 줄 엔터(개행)  : ln (line)

public class test03 {
	public static void main(String[] args) {
		String week[] = {"월","화","수","목","금","토","일"};
		
		for (int i = 0; i < week.length; i++) {
			System.out.print(week[i] + "요일 ");
		}
		System.out.println();
		
		// for-each(Advanced for)
		for (String str : week) {
			System.out.print(str + "요일 ");	// str == week[i]
		}
	}
}
