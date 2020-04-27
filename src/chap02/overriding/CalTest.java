package chap02.overriding;

public class CalTest {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(10, 20));
		System.out.println(cal.sub(20, 10));
		System.out.println(cal.mul(10, 10));
		System.out.println(cal.div(10, 2));
		System.out.println(cal.rem(10, 3));
				
	}
}
