package chap03.dynamicBinding;

class Shape {
	public Shape next;
	
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("circle");
	}
}

public class MethodOverridingEx {
	static void paint(Shape p) {
		p.draw();  	// p가 가리키는 객체 내에 오버라이딩 된 draw() 호출. (동적 바인딩)
	}
	
	public static void main(String[] args) {
		Line line = new Line();
		
		// 다음 호출들은 모두 paint() 메소드 내에서 Shape에 대한 레퍼런스 p로 업캐스팅
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
		
	}
}








