package chap02.overriding;

public class CalculatorSub {

	public int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public int sub(int a, int b, int c) {
		return a - b - c;
	}
	
	public int mul(int a, int b, int c) {
		return a * b * c;
	}
	
	public int div(int a, int b, int c) {
		return a / b / c;
	}
	
	public int rem(int a, int b, int c) {
		return a % b % c;
	}
}
