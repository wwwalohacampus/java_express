package chap01;

public class test03 {
	public static void main(String[] args) {
		// for-each (Advanced for)
		String [] week = { "월","화","수","목","금","토","일" };
		
		for (int i = 0; i < week.length; i++) {
			System.out.print( week[i] + "요일 ");
		}
		System.out.println();
		for (String str : week) {
			System.out.print( str + "요일 "); // str == week[i]
		}
	}
}
