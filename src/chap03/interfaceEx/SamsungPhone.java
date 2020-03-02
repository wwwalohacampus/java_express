package chap03.interfaceEx;


public class SamsungPhone implements PhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("전화를 겁니다!!!");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다!!!");
	}

	@Override
	public void printLogo() {
		System.out.println("*** Samsung ***");
	}	

	
}
