package chap02.inheritance;

public class Pickachu {
	// 클래스 : 변수 + 메소드
	// 멤버	: (변수), (메소드)
	
	// 변수
	int energy;
	String type;
	String item = "";
	
	
	// 기본 생성자
	public Pickachu() {
		this(100, "thunder");
//		this.energy = 100;
//		this.type = "fire";
	}

	// 메소드(생성자) 오버로딩
	public Pickachu(int energy, String type) {
		this.energy = energy;
		this.type = type;
	}

	// 메소드(생성자) 오버로딩
	public Pickachu(int energy, String type, String item) {
		this.energy = energy;
		this.type = type;
		this.item = item;
	}

	// 메소드
	public String aAttack() {
		return "십만볼트";
	}
	
	public String bAttack() {
		return "전광석화";
	}
	
}








