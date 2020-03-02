package chap01;

import java.util.Scanner;

public class test04 {
	public static void showMenu() {
		System.out.println("########## 메뉴 ##########");
		System.out.println("1. 후라이드 치킨");
		System.out.println("2. 양념 치킨");
		System.out.println("3. 왕갈비 치킨");
		System.out.println("0. (종료)");
		System.out.print("##### 입력 : ");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu = "";
		int num = 0;
		
		do {
			// 메뉴 호출
			showMenu();
			
			num = sc.nextInt();
			if( num == 0)
				break;
			
			switch (num) {
				case 1:
						menu = "후라이드 치킨";
						break;
				case 2:
						menu = "양념 치킨";
						break;
				case 3:
						menu = "왕갈비 치킨";
						break;
				case 0:
						break;
				default:
						break;
			}
			if ( num <= 3 )
				System.out.println("\'" + menu + "\'" + "이(/가) 주문되었습니다!!! \n");
			else 
				System.out.println("(0~3) 사이의 숫자를 입력해주세요.");
		} while( true );
		
		sc.close();
	}
}
