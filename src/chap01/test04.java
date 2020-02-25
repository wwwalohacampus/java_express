package chap01;

import java.util.Scanner;

public class test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu = "";
		int num = 0;
		
		do {
			System.out.println("########## 메뉴 ##########");
			System.out.println("1. 후라이드 치킨");
			System.out.println("2. 양념 치킨");
			System.out.println("3. 왕갈비 치킨");
			System.out.println("0. (종료)");
			System.out.print("##### 입력 : ");
			
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
			System.out.println("\'" + menu + "\'" + "이(/가) 주문되었습니다!!! \n");
		} while( true );
		
		sc.close();
	}
}
