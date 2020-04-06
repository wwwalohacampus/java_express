package chap02.inheritance;

public class jiwoo {
	public static void main(String[] args) {
		Pikachu pickachu = new Pikachu();
		System.out.println("########## 피카츄 ##########");
		System.out.println("에너지 : " + pickachu.energy);
		System.out.println("타입 : " + pickachu.type);
		System.out.println("공격 A : " + pickachu.aAttack());
		System.out.println("공격 B : " + pickachu.bAttack());
		
		System.out.println();
		
		Pikachu pickachu20 = new Pikachu(150, "adv");
		System.out.println("########## 피카츄(LV.20) ##########");
		System.out.println("에너지 : " + pickachu20.energy);
		System.out.println("타입 : " + pickachu20.type);
		System.out.println("공격 A : " + pickachu20.aAttack());
		System.out.println("공격 B : " + pickachu20.bAttack());
		
		System.out.println();
		
		Raichu raichu = new Raichu();
		System.out.println("########## 라이츄 ##########");
		System.out.println("에너지 : " + raichu.energy);
		System.out.println("타입 : " + raichu.type);
		System.out.println("공격 A : " + raichu.aAttack());
		System.out.println("공격 B : " + raichu.bAttack());
		System.out.println();
		
		Raichu raichu40 = new Raichu(400, "megathunder");
		System.out.println("########## 라이츄(Lv.40) ##########");
		System.out.println("에너지 : " + raichu40.energy);
		System.out.println("타입 : " + raichu40.type);
		System.out.println("공격 A : " + raichu40.aAttack());
		System.out.println("공격 B : " + raichu40.bAttack());
		
		System.out.println();
	}
}	









