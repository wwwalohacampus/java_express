package chap03.interfaceEx;

public class PhoneTest {
	public static void main(String[] args) {
		
		SamsungPhone sp = new SamsungPhone();
		sp.printLogo();
		sp.sendCall();
		sp.receiveCall();

		System.out.println();
		
		LGPhone lp = new LGPhone();
		lp.printLogo();
		lp.sendCall();
		lp.receiveCall();
	}
}
