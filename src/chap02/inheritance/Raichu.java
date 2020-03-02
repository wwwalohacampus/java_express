package chap02.inheritance;

public class Raichu extends Pikachu {
	
	public Raichu() {
		super();
	}

	public Raichu(int energy, String type) {
		super(energy, type);
	}
	
	public Raichu(int energy, String type, String item) {
		super(energy, type, item);
	}

	// 메소드 오버라이딩
	public String aAttack() {
		return "백만볼트";
	}
	
	public String bAttack() {
		return "볼트체인지";
	}
	
	
	
	
	
}
