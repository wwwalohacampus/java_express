package chap02.inheritance;

// 생성자 단축키 : Alt + Shift + S -> o
public class Pikachu {
		// 클래스		: 객체를 정의하는 설계도(변수 + 메소드)
		// 멤버		: (변수), (메소드)
	
		// 변수
		public int energy;
		public String type;
		public String item = "";
		
		// 기본 생성자
		public Pikachu() {
			this(100, "thunder");
			// this.energy = 100;
			// this.type = "thunder";
		}
		
		// 메소드(생성자) 오버로딩
		public Pikachu(int energy, String type) {
			this.energy = energy;
			this.type = type;
		}

		// 메소드(생성자) 오버로딩
		public Pikachu(int energy, String type, String item) {
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








