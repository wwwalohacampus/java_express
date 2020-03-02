package chap02.staticMember;

public class staticMember {
	static int a;
	static int b;
	int c;
	static final double PI = 3.141592;
	
	public static int sum(int a, int b) {
		int sum = a + b;
//		sum += c;
		return sum;
	}
	
	public static void main(String[] args) {
		int sum = sum(10,20);
		a = 100;
		staticMember sM1 = new staticMember();
		staticMember sM2 = new staticMember();
		int a1 = sM1.a;
		int a2 = sM2.a;
		
		System.out.println(a1);
		System.out.println(a2);
		
	}
}
