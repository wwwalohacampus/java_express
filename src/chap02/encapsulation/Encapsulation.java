package chap02.encapsulation;

public class Encapsulation {
	private int deposit = 1000000;
	private String depoNumber = "282401-04-109955";
	private String depositor = "aloha";
	
	
	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit += deposit;
	}

	public String getDepoNumber() {
		return depoNumber;
	}

	public void setDepoNumber(String depoNumber) {
		this.depoNumber = depoNumber;
	}

	public String getDepositor() {
		return depositor;
	}

	public void setDepositor(String depositor) {
		this.depositor = depositor;
	}

	public static void main(String[] args) {
		
	}
}
