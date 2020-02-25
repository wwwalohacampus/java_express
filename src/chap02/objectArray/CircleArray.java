package chap02.objectArray;

/*
 	반지름이 0~4인 Circle 객체 5개를 가지는 배열을 생성하고,
 	배열에 있는 모든 Circle의 객체의 면적(넓이)를 출력하시오.
 */
class Circle {
	// 변수 		: 반지름
	// 메소드		: 넓이계산
	int radius;

	// 생성자
	public Circle(int radius) {
		this.radius = radius;
	}
	
	// 메소드
	public double getArea() {
		return 3.14 * radius * radius;
	}
}

public class CircleArray {
	public static void main(String[] args) {
		Circle [] c;						// Circle 배열에 대한 레퍼런스 c 선언
		c = new Circle[5];					// 5개의 레퍼런스 배열 생성
//		Circle [] c = new Circle[5];		// 동시에 생성
		
		for (int i = 0; i < c.length; i++) {		// 배열의 개수 만큼
			c[i] = new Circle(i);					// i번째 배열요소에 객체를 생성하여 대입
		}
		
		for (Circle circle : c) {
			System.out.print( (int)(circle.getArea()) + " " );
		}
		
		
	}
}


















