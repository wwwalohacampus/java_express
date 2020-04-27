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

	@Override
	public String aAttack() {
		return "백만볼트";
	}

	@Override
	public String bAttack() {
		return "볼트체인지";
	}
	
}








