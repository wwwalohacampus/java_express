package chap02.encapsulation;

public class Test {
	public static void main(String[] args) {
		Encapsulation ec = new Encapsulation(); // 계좌 객체
		// 입금 : 1만원 입금
		ec.setDeposit(10000);
		int money = ec.getDeposit();		// 계좌 잔액
		System.out.println("계좌 잔액 : " + money);
	}
}
