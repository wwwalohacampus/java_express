package chap03.accessModifier;

//Person -(상속)-> Student
//상속관계에 있는 클래스 간 멤버 접근

class Person {
	private int weight;			// private 접근 지정. Student 클래스에서 접근 불가
	int age;					// default 접근 지정. Student 클래스에서 접근 가능
	protected int height;		// protected 접근 지정. Student 클래스에서 접근 가능
	public String name;			// public 접근 지정. Student 클래스에서 접근 가능
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
	
}

class Student extends Person {
	public void set() {
		age = 20;
		name ="홍길동";
		height = 175;
//		weight = 60;					// 캡슐화
		setWeight(60);
	}
}


public class InheritanceEx {
	public static void main(String[] args) {
		Student s = new Student();
		s.set();
		System.out.println("weight : " + s.getWeight());
	}
}

