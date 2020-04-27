package chap06.vector;

import java.util.Vector;

class Point {
	private int x, y;			//  한 점을 구성하는 x,y 좌표

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// (x,y)
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}

public class PointVectorEx {
	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>();
		
		// 3개의 Point 객체 삽입
		v.add(new Point(2,3));
		v.add(new Point(10,20));
		v.add(new Point(-5,30));
		
		v.remove(1);			// 인덱스 1의 Point(10,20) 객체 삭제
		
		// 벡터의 있는 모든 Point 객체 검색하여 출력
		for (int i = 0; i < v.size(); i++) {			
			Point p = v.get(i);
			System.out.println(p);
		}
		
	}
	
}










